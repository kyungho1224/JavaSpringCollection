package kr.amaranth.simpleboard.post.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by KimKyungHo on 2023-12-08(008)
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PostRequest {

    private Long boardId = 1L;

    @NotBlank
    private String userName;

    @NotBlank
    @Size(min = 4, max = 4)
    private String password;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String title;

    @NotBlank
    private String content;

}
