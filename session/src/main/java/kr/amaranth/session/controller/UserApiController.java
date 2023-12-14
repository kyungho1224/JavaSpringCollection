package kr.amaranth.session.controller;

import jakarta.servlet.http.HttpSession;
import kr.amaranth.session.model.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by KimKyungHo on 2023-12-14(014)
 */

@RestController
@RequestMapping("/api/user")
public class UserApiController {

    @GetMapping("/me")
    public UserDto me(
            HttpSession httpSession
    ) {
        var userObject = httpSession.getAttribute("USER");  // 세션에 저장된 값 가져오기
        var userDto = (UserDto) userObject;
        if (userObject != null) {
            return userDto;
        }
        return null;
    }
}
