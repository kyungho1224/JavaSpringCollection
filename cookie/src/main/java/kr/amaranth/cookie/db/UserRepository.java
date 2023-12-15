package kr.amaranth.cookie.db;

import jakarta.annotation.PostConstruct;
import kr.amaranth.cookie.model.UserDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by KimKyungHo on 2023-12-15(015)
 */

@Service
public class UserRepository {

    private List<UserDto> userList = new ArrayList<>();

    public Optional<UserDto> findById(String id) {
        return userList
                .stream()
                .filter(it -> {
                    return it.getId().equals(id);
                }).findFirst();
    }

    public Optional<UserDto> findByName(String name) {
        return userList
                .stream()
                .filter(it -> {
                    return it.getName().equals(name);
                }).findFirst();
    }

    @PostConstruct
    public void start() {
        userList.add(new UserDto(UUID.randomUUID().toString(), "김경호", "1234"));
        userList.add(new UserDto(UUID.randomUUID().toString(), "동예원", "1234"));
        userList.add(new UserDto(UUID.randomUUID().toString(), "김밀크", "1234"));
    }
}
