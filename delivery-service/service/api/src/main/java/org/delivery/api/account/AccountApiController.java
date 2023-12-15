package org.delivery.api.account;

import lombok.RequiredArgsConstructor;
import org.delivery.db.account.AccountEntity;
import org.delivery.db.account.AccountRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by KimKyungHo on 2023-12-15(015)
 */

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/account")
public class AccountApiController {

    private final AccountRepository accountRepository;

    @GetMapping("")
    public void save() {
        var account = AccountEntity.builder().build();
        accountRepository.save(account);
    }
}
