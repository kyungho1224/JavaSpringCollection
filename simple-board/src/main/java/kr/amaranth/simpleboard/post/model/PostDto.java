package kr.amaranth.simpleboard.post.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import kr.amaranth.simpleboard.reply.model.ReplyDto;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by KimKyungHo on 2023-12-08(008)
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PostDto {

    private Long id;

    private Long boardId;

    private String userName;

    private String password;

    private String email;

    private String status;

    private String title;

    private String content;

    private LocalDateTime postedAt;

    private List<ReplyDto> replyList = List.of();

}
