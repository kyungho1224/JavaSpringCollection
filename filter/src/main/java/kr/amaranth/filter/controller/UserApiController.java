package kr.amaranth.filter.controller;

import kr.amaranth.filter.interceptor.OpenApi;
import kr.amaranth.filter.model.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * Created by KimKyungHo on 2023-12-13(013)
 */

@OpenApi
@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserApiController {

    @OpenApi
    @PostMapping("")
    public UserRequest register(
            @RequestBody
            UserRequest userRequest
    ) {
        log.info("{}", userRequest);
        return userRequest;
    }

    @GetMapping("/hello")
    public void hello() {
        log.info("hello");
    }

}
