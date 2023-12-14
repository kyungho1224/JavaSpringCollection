package kr.amaranth.simpleboard.post.db;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by KimKyungHo on 2023-12-07(007)
 */
public interface PostRepository extends JpaRepository<PostEntity, Long> {

    // select * from post where id = ? and status = ? order by id desc limit 1
    Optional<PostEntity> findFirstByIdAndStatusOrderByIdDesc(Long id, String status);
}
