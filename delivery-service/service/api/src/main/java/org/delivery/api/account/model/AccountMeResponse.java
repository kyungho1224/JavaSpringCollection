package org.delivery.api.account.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by KimKyungHo on 2023-12-15(015)
 */

@Data
@Builder
public class AccountMeResponse {

    private String email;

    private String name;

    private LocalDateTime registeredAt;
}
