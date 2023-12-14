package kr.amaranth.simpleboard.reply.db;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by KimKyungHo on 2023-12-07(007)
 */
public interface ReplyRepository extends JpaRepository<ReplyEntity, Long> {

    // select * from reply where post_id = ? and status = ? order by id desc
    List<ReplyEntity> findAllByPostIdAndStatusOrderByIdDesc(Long postId, String status);
}
