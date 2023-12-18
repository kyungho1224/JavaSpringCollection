package org.delivery.api.account;

import lombok.RequiredArgsConstructor;
import org.delivery.api.account.model.AccountMeResponse;
import org.delivery.api.common.api.Api;
import org.delivery.db.account.AccountRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Created by KimKyungHo on 2023-12-15(015)
 */

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/account")
public class AccountApiController {

    private final AccountRepository accountRepository;

    @GetMapping("/me")
    public Api<AccountMeResponse> me() {

        var response = AccountMeResponse.builder()
                .name("김밀크")
                .email("milk@kakao.com")
                .registeredAt(LocalDateTime.now()).build();

        return Api.OK(response);
    }

}
