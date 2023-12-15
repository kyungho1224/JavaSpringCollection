package kr.amaranth.cookie.model;

import lombok.*;

/**
 * Created by KimKyungHo on 2023-12-15(015)
 */

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String id;

    private String name;

    private String password;
}
