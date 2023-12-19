package org.delivery.db.user.enums;

import lombok.AllArgsConstructor;

/**
 * Created by KimKyungHo on 2023-12-18(018)
 */

@AllArgsConstructor
public enum UserStatus {

    REGISTERED("등록"),
    UNREGISTERED("해지"),
    ;

    private final String description;
}
