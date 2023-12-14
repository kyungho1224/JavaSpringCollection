package kr.amaranth.session.controller;

import jakarta.servlet.http.HttpSession;
import kr.amaranth.session.model.LoginRequest;
import kr.amaranth.session.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by KimKyungHo on 2023-12-14(014)
 */

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/account")
public class AccountApiController {

    private final UserService userSerivce;

    @PostMapping("/login")
    public void login(
            @RequestBody
            LoginRequest loginRequest,
            HttpSession httpSession // 서블릿에 포함된 httpSession, 스프링에서 자동으로 요청에 대한 세션을 만들어서 주입
    ) {
        userSerivce.login(loginRequest, httpSession);
    }
}
