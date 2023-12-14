package com.example.restapi.controller;

import com.example.restapi.model.BookRequest;
import com.example.restapi.model.UserRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by KimKyungHo on 2023-11-30(030)
 */

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post")
    public String post(
            @RequestBody BookRequest bookRequest
    ) {
        // httpBody 들어오는 데이터를 매핑
        System.out.println(bookRequest);
        return bookRequest.toString();
    }

    @PostMapping("/user")
    public UserRequest getUser(
        @RequestBody UserRequest userRequest
    ) {
        System.out.println(userRequest);
        return userRequest;
    }

}
