package kr.amaranth.simpleboard.reply.service;

import kr.amaranth.simpleboard.crud.CRUDAbstractService;
import kr.amaranth.simpleboard.post.db.PostEntity;
import kr.amaranth.simpleboard.post.db.PostRepository;
import kr.amaranth.simpleboard.reply.db.ReplyEntity;
import kr.amaranth.simpleboard.reply.db.ReplyRepository;
import kr.amaranth.simpleboard.reply.model.ReplyDto;
import kr.amaranth.simpleboard.reply.model.ReplyRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by KimKyungHo on 2023-12-08(008)
 */

@Service
@RequiredArgsConstructor
public class ReplyService extends CRUDAbstractService<ReplyDto, ReplyEntity> {

//    private final ReplyRepository replyRepository;
//    private final PostRepository postRepository;
//
//    public ReplyEntity create(
//        ReplyRequest replyRequest
//    ) {
////        var postEntity = postRepository.findById(replyRequest.getPostId()).get();
//        var optionalPostEntity = postRepository.findById(replyRequest.getPostId());
//
//        if (optionalPostEntity.isEmpty()) {
//            throw new RuntimeException("게시물이 존재하지 않습니다 : " + replyRequest.getPostId());
//        }
//
//        var entity = ReplyEntity.builder()
//                .post(optionalPostEntity.get())
//                .userName(replyRequest.getUserName())
//                .password(replyRequest.getPassword())
//                .status("REGISTERED")
//                .title(replyRequest.getTitle())
//                .content(replyRequest.getContent())
//                .repliedAt(LocalDateTime.now())
//                .build();
//        return replyRepository.save(entity);
//    }
//
//    public List<ReplyEntity> findAllByPostId(Long postId) {
//        return replyRepository.findAllByPostIdAndStatusOrderByIdDesc(postId, "REGISTERED");
//    }

}
