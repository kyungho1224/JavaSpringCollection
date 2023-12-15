package kr.amaranth.cookie.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import kr.amaranth.cookie.db.UserRepository;
import kr.amaranth.cookie.model.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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

        // 쿠키 키&값 확인
//        var cookies = httpServletRequest.getCookies();
//
//        if (cookies != null) {
//            for (Cookie cookie : cookies) {
//                log.info("key : {}, value : {}", cookie.getName(), cookie.getValue());
//            }
//        }

    }

    @GetMapping("/me2")
    public UserDto me2(
            @RequestHeader(name = "authorization", required = false)
            String authorizationHeader
    ) {

        log.info("authorizationHeader : {}", authorizationHeader);

        var optionalUserDto = userRepository.findById(authorizationHeader);
        return optionalUserDto.get();
    }
}
