package kr.amaranth.memorydb.book.repository;

import kr.amaranth.memorydb.book.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by KimKyungHo on 2023-12-06(006)
 */

public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
