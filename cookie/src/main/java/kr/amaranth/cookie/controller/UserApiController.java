package kr.amaranth.cookie.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import kr.amaranth.cookie.db.UserRepository;
import kr.amaranth.cookie.model.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by KimKyungHo on 2023-12-15(015)
 */

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/user")
public class UserApiController {

    private final UserRepository userRepository;

    @GetMapping("/me")
    public UserDto me(
            HttpServletRequest httpServletRequest,
            @CookieValue(name = "authorization-cookie", required = false)
            String authorizationCookie
    ) {

        log.info("authorizationCookie : {}", authorizationCookie);

        var optionalUserDto = userRepository.findById(authorizationCookie);
        return optionalUserDto.get();

//        var cookies = httpServletRequest.getCookies();
//
//        if (cookies != null) {
//            for (Cookie cookie : cookies) {
//                log.info("key : {}, value : {}", cookie.getName(), cookie.getValue());
//            }
//        }

    }
}
