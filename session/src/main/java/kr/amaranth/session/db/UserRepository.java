package kr.amaranth.session.db;

import jakarta.annotation.PostConstruct;
import kr.amaranth.session.model.UserDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by KimKyungHo on 2023-12-14(014)
 */

@Service
public class UserRepository {

    private List<UserDto> userList = new ArrayList<>();

    public Optional<UserDto> findByName(String name) {
        return userList
                .stream()
                .filter(it -> {
                    return it.getName().equals(name);
                }).findFirst();
    }

    @PostConstruct  // 해당 bean 초기화 되었을 때 해당 메서드 호출
    public void init() {
        userList.add(new UserDto("홍길동", "1234"));
        userList.add(new UserDto("유관순", "1234"));
        userList.add(new UserDto("이순신", "1234"));
    }

}
