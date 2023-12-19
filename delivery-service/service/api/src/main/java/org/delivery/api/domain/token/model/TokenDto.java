package org.delivery.api.domain.token.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created by KimKyungHo on 2023-12-19(019)
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TokenDto {

    private String token;

    private LocalDateTime expiredAt;
}
