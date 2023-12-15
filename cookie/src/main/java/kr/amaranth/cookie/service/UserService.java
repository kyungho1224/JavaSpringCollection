package kr.amaranth.cookie.service;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import kr.amaranth.cookie.db.LoginRequest;
import kr.amaranth.cookie.db.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by KimKyungHo on 2023-12-15(015)
 */

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public void login(
            LoginRequest loginRequest,
            HttpServletResponse httpServletResponse
    ) {
        // request -> 아이디와 비밀번호 가져옴
        var id = loginRequest.getId();
        var pw = loginRequest.getPassword();

        var optionalUser = userRepository.findByName(id);

        if (optionalUser.isPresent()) {
            var userDto = optionalUser.get();
            if (userDto.getPassword().equals(pw)) {
                // cookie 정보를 저장
                var cookie = new Cookie("authorization-cookie", userDto.getId());
                cookie.setDomain("localhost");
                cookie.setPath("/");
                cookie.setMaxAge(-1);   // session 동일, session 유지된 동안
                cookie.setHttpOnly(true);   // ** 자바스크립트에서 사용하지 못하게 보안 **
//                cookie.setSecure(true);     // ** https 에서만 사용이 가능하도록

                httpServletResponse.addCookie(cookie);
            } else {
                throw new RuntimeException("Password Not Match");
            }
        } else {
            throw new RuntimeException("User Not Found");
        }

    }

}
