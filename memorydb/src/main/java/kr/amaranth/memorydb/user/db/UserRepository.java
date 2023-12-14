package kr.amaranth.memorydb.user.db;

import kr.amaranth.memorydb.user.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by KimKyungHo on 2023-12-05(005)
 */

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    // select * from user where score > [??]    findAllScoreGreaterThanEqual
    // select * from user where score >= [??]    findAllScoreGreaterThan
    public List<UserEntity> findAllByScoreGreaterThanEqual(int score);

    public List<UserEntity> findAllByScoreGreaterThanEqualAndScoreLessThanEqual(int min, int max);

    @Query(
//            "select u from user u where u.score >= ?1 AND u.score <= ?2"
//            value = "select * from user as u where u.score >= ?1 AND u.score <= ?2",
            value = "select * from user as u where u.score >= :min AND u.score <= :max",
            nativeQuery = true
    )
    List<UserEntity> score(
            @Param(value = "min") int min,
            @Param(value = "max") int max);

}
