package kr.amaranth.simpleboard.board.controller;

import jakarta.validation.Valid;
import kr.amaranth.simpleboard.board.db.BoardEntity;
import kr.amaranth.simpleboard.board.db.BoardRepository;
import kr.amaranth.simpleboard.board.model.BoardDto;
import kr.amaranth.simpleboard.board.model.BoardRequest;
import kr.amaranth.simpleboard.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by KimKyungHo on 2023-12-07(007)
 * 5. BoardApiController
 */

@RestController
@RequestMapping("api/board")
@RequiredArgsConstructor
public class BoardApiController {

    private final BoardService boardService;
    private final BoardRepository boardRepository;

    @PostMapping("")
    public BoardDto create(
            @Valid
            @RequestBody BoardRequest boardRequest
    ) {
        return boardService.create(boardRequest);
    }

    @GetMapping("/id/{id}")
    public BoardDto view(
            @PathVariable Long id
    ) {
        return boardService.view(id);
    }

    @GetMapping("/ids/{id}")
    public List<BoardEntity> all(
            @PathVariable Long id
    ) {
        return boardRepository.findAll();
    }

}