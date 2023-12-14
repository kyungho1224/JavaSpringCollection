package kr.amaranth.simpleboard.post.service;

import kr.amaranth.simpleboard.board.db.BoardRepository;
import kr.amaranth.simpleboard.crud.Converter;
import kr.amaranth.simpleboard.post.db.PostEntity;
import kr.amaranth.simpleboard.post.model.PostDto;
import kr.amaranth.simpleboard.reply.service.ReplyConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Created by KimKyungHo on 2023-12-08(008)
 */

@Service
@RequiredArgsConstructor
public class PostConverter implements Converter<PostDto, PostEntity> {

    private final BoardRepository boardRepository;
    private final ReplyConverter replyConverter;

    @Override
    public PostDto toDto(PostEntity postEntity) {
        return PostDto.builder()
                .id(postEntity.getId())
                .userName(postEntity.getUserName())
                .password(postEntity.getPassword())
                .email(postEntity.getEmail())
                .status(postEntity.getStatus())
                .title(postEntity.getTitle())
                .content(postEntity.getContent())
                .postedAt(postEntity.getPostedAt())
                .boardId(postEntity.getBoard().getId())
                .build();
    }

    @Override
    public PostEntity toEntity(PostDto postDto) {

        var boardEntity = boardRepository.findById(postDto.getBoardId());

        // dto -> entity
        var replyEntityList = postDto.getReplyList().stream().map(
                replyConverter::toEntity
        ).toList();

        return PostEntity.builder()
                .id(postDto.getId())
                .board(boardEntity.orElse(null))
                .status((postDto.getStatus() != null) ? postDto.getStatus() : "REGISTERED")
                .userName(postDto.getUserName())
                .password(postDto.getPassword())
                .title(postDto.getTitle())
                .content(postDto.getContent())
                .postedAt((postDto.getPostedAt() != null) ? postDto.getPostedAt() : LocalDateTime.now())
                .replyList(replyEntityList)
                .build();

    }

}
