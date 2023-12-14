package kr.amaranth.simpleboard.reply.controller;

import jakarta.validation.Valid;
import kr.amaranth.simpleboard.crud.CRUDApiAbstractApiController;
import kr.amaranth.simpleboard.reply.db.ReplyEntity;
import kr.amaranth.simpleboard.reply.model.ReplyDto;
import kr.amaranth.simpleboard.reply.model.ReplyRequest;
import kr.amaranth.simpleboard.reply.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by KimKyungHo on 2023-12-08(008)
 */

@RestController
@RequestMapping("/api/reply")
@RequiredArgsConstructor
public class ReplyApiController extends CRUDApiAbstractApiController<ReplyDto, ReplyEntity> {

/*    private final ReplyService replyService;

    @PostMapping("")
    public ReplyEntity create(
            @Valid
            @RequestBody ReplyRequest replyRequest
    ) {
        return replyService.create(replyRequest);
    }*/

}
