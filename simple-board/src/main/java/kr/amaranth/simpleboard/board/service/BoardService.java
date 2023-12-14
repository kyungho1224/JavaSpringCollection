package kr.amaranth.simpleboard.board.service;

import kr.amaranth.simpleboard.board.db.BoardEntity;
import kr.amaranth.simpleboard.board.db.BoardRepository;
import kr.amaranth.simpleboard.board.model.BoardDto;
import kr.amaranth.simpleboard.board.model.BoardRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by KimKyungHo on 2023-12-07(007)
 * 4. BoardService
 * - Controller 에서 들어온 요청을 처리 (비즈니스 로직을 수행)
 */

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;
    private final BoardConverter boardConverter;

    public BoardDto create(
            BoardRequest boardRequest
    ) {
        var entity = BoardEntity.builder()
                .boardName(boardRequest.getBoardName())
                .status("REGISTERED")
                .build();
        var saveEntity = boardRepository.save(entity);
        return boardConverter.toDto(saveEntity);
    }

    public BoardDto view(Long id) {
        var entity = boardRepository.findById(id).get();
        return boardConverter.toDto(entity);
    }
}
