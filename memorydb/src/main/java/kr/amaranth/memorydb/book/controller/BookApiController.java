package kr.amaranth.memorydb.book.controller;

import kr.amaranth.memorydb.book.entity.BookEntity;
import kr.amaranth.memorydb.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by KimKyungHo on 2023-12-06(006)
 */

@RestController
@RequestMapping("/api/book")
@RequiredArgsConstructor
public class BookApiController {

    private final BookService bookService;

    @PostMapping("")
    public BookEntity create(
            @RequestBody BookEntity bookEntity
    ) {
        return bookService.create(bookEntity);
    }

    @GetMapping("/all")
    public List<BookEntity> findAll(

    ) {
        return bookService.findAll();
    }

}
