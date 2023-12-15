package org.delivery.db.account;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by KimKyungHo on 2023-12-15(015)
 */
public interface AccountRepository extends JpaRepository<AccountEntity, Long> {
}
