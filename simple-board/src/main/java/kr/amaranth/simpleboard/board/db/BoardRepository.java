package kr.amaranth.simpleboard.board.db;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by KimKyungHo on 2023-12-07(007)
 * 2. BoardRepository
 * - JpaRepository 상속받아서 BoardEntity 연결
 */


public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}
