package kr.amaranth.memorydb.book.service;

import kr.amaranth.memorydb.book.entity.BookEntity;
import kr.amaranth.memorydb.book.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by KimKyungHo on 2023-12-06(006)
 */

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookEntity create(BookEntity book) {
        return bookRepository.save(book);
    }

    public List<BookEntity> findAll() {
        return bookRepository.findAll();
    }

}
