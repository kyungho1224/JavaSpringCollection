package kr.amaranth.cookie.controller;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.amaranth.cookie.db.LoginRequest;
import kr.amaranth.cookie.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by KimKyungHo on 2023-12-15(015)
 */

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/account")
public class AccountApiController {

    private final UserService userService;

    @PostMapping("/login")
    public String login(
            @RequestBody
            LoginRequest loginRequest,
            HttpServletResponse httpServletResponse,
            HttpSession httpSession
    ) {
        return userService.login(loginRequest, httpServletResponse);
    }

}
