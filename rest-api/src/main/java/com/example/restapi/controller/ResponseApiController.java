package com.example.restapi.controller;

import com.example.restapi.model.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by KimKyungHo on 2023-12-01(001)
 */

@Slf4j
@RestController
//@Controller
@RequestMapping("/api/v1")
public class ResponseApiController {

    // http://localhost:8080/api/v1
    @GetMapping("")
//    @ResponseBody
//    @RequestMapping(path = "", method = RequestMethod.GET)
    public UserRequest user() {
        var user = new UserRequest();
        user.setUserName("홍길동");
        user.setUserAge(30);
        user.setEmail("hong@gmail.com");

        log.info("user : {}", user);

        var response = ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .header("x-custom", "hi")
                .body(user);

        // 메서드에서는 주로 객체를 리턴하는 방법을 사용, 예외처리 할 때 ResponseEntity 사용

        return user;
    }
}
