package kr.amaranth.springjpa.user.db;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by KimKyungHo on 2023-12-07(007)
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
