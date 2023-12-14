package kr.amaranth.session.service;

import jakarta.servlet.http.HttpSession;
import kr.amaranth.session.db.UserRepository;
import kr.amaranth.session.model.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by KimKyungHo on 2023-12-14(014)
 */

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void login(
            LoginRequest loginRequest,
            HttpSession httpSession
    ) {
        // request -> 아이디와 비밀번호 가져옴
        var id = loginRequest.getId();
        var pw = loginRequest.getPassword();

        // repository -> 아이디를 이용해서 유저를 가져옴 (optional)
        var optionalUser = userRepository.findByName(id);

        if (optionalUser.isPresent()) { // 유저가 있다면
            var userDto = optionalUser.get();
            if (userDto.getPassword().equals(pw)) { // request -> 비밀번호와 유저의 비밀번호가 같다면
                // 세션에 정보 저장
                httpSession.setAttribute("USER", userDto);
            } else {    // 비밀번호가 다르다면
                throw new RuntimeException("Password Not Match");
            }
        } else {    // 유저가 없다면
            throw new RuntimeException("User Not Found");
        }
    }
}
