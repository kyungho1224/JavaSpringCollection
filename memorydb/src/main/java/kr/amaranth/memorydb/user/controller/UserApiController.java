package kr.amaranth.memorydb.user.controller;

import kr.amaranth.memorydb.user.model.UserEntity;
import kr.amaranth.memorydb.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by KimKyungHo on 2023-12-05(005)
 */

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserApiController {

    private final UserService userService;

    @PutMapping("")
    public UserEntity create(
            @RequestBody UserEntity userEntity
    ) {
        return userService.save(userEntity);
    }

    @GetMapping("/all")
    public List<UserEntity> findAll() {
        return userService.findAll();
    }

    // delete
    @DeleteMapping("/id/{id}")
    public void delete(
            @PathVariable Long id
    ) {
//        userService.delete(id);
    }

    // delete
    @GetMapping("/id/{id}")
    public UserEntity findOne(
            @PathVariable Long id
    ) {
        var response = userService.findById(id);
        return response.get();
    }

    @GetMapping("/score")
    public List<UserEntity> filterScore(
            @RequestParam int score
    ) {
        return userService.filterScore(score);
    }

    @GetMapping("/min_max")
    public List<UserEntity> filterScore(
            @RequestParam int min,
            @RequestParam int max
    ) {
        return userService.filterScore(min, max);
    }

}
