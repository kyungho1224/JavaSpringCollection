package kr.amaranth.session.model;

import lombok.*;

/**
 * Created by KimKyungHo on 2023-12-14(014)
 */

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String name;
    private String password;
}
