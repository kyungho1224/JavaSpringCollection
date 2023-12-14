package kr.amaranth.springjpa.user.controller;

import kr.amaranth.springjpa.user.db.UserEntity;
import kr.amaranth.springjpa.user.db.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by KimKyungHo on 2023-12-07(007)
 */

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserApiController {

    private final UserRepository userRepository;

    @GetMapping("/find-all")
    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }

    @GetMapping("/name")
    public void autoSave(
            @RequestParam String name
    ) {
        var user = UserEntity.builder()
                .name(name)
                .build();
        userRepository.save(user);
    }

}
