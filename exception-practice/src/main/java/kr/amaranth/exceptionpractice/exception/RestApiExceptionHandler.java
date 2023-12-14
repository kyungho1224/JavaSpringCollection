package kr.amaranth.exceptionpractice.exception;

import kr.amaranth.exceptionpractice.controller.RestApiBController;
import kr.amaranth.exceptionpractice.model.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

/**
 * Created by KimKyungHo on 2023-12-01(001)
 */

@Slf4j
@RestControllerAdvice   // 모든 컨트롤러의 예외를 잡아줌
//@RestControllerAdvice(basePackages = "kr.amaranth.exceptionpractice.controller")
//@RestControllerAdvice(basePackageClasses = {RestApiBController.class})
@Order(1)
public class RestApiExceptionHandler {

//    @ExceptionHandler(value = {Exception.class})
//    public ResponseEntity exception(
//            Exception e
//    ) {
//        log.error("RestApiExceptionHandler", e);
//        return ResponseEntity.status(200).build();
//    }

    @ExceptionHandler(value = {IndexOutOfBoundsException.class})
    public ResponseEntity outOfBound(
            IndexOutOfBoundsException e
    ) {
        log.error("IndexOutOfBoundsException", e);
        return ResponseEntity.status(200).build();
    }

    @ExceptionHandler(value = {NoSuchElementException.class})
    public ResponseEntity<Api> noSuchElement(
            NoSuchElementException e
    ) {
        log.error("", e);
        var response = Api.builder()
                .resultCode(String.valueOf(HttpStatus.NOT_FOUND.value()))
                .resultMessage(HttpStatus.NOT_FOUND.getReasonPhrase())
                .build();

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(response);
    }
}
