package kr.amaranth.memorydb.user.service;

import kr.amaranth.memorydb.user.db.UserRepository;
import kr.amaranth.memorydb.user.model.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by KimKyungHo on 2023-12-05(005)
 */

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserEntity save(UserEntity user) {
        return userRepository.save(user);
    }

    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }

    public void delete(UserEntity id) {
        userRepository.delete(id);
    }

    public Optional<UserEntity> findById(Long id) {
        return userRepository.findById(id);
    }

    public List<UserEntity> filterScore(int score) {

//        return null;
        return userRepository.findAllByScoreGreaterThanEqual(score);
    }

    public List<UserEntity> filterScore(int min, int max) {

//        return null;
//        return userRepository.findAllByScoreGreaterThanEqualAndScoreLessThanEqual(min, max);
        return userRepository.score(min, max);
    }

}
