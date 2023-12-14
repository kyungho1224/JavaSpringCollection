package kr.amaranth.simpleboard.crud;

import jakarta.validation.Valid;
import kr.amaranth.simpleboard.common.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by KimKyungHo on 2023-12-13(013)
 */
public class CRUDApiAbstractApiController<DTO, ENTITY> implements CRUDInterface<DTO> {


    @Autowired(required = false)
    private CRUDAbstractService<DTO, ENTITY> crudAbstractService;

    @PostMapping("")
    @Override
    public DTO create(
            @Valid
            @RequestBody
            DTO dto
    ) {
        return crudAbstractService.create(dto);
    }

    @GetMapping("/id/{id}")
    @Override
    public Optional<DTO> read(
            @PathVariable
            Long id
    ) {
        return crudAbstractService.read(id);
    }

    @PutMapping("")
    @Override
    public DTO update(
            @Valid
            @RequestBody
            DTO dto
    ) {
        return crudAbstractService.update(dto);
    }

    @DeleteMapping("")
    @Override
    public void delete(
            @PathVariable
            Long id
    ) {
        crudAbstractService.delete(id);
    }

    @GetMapping("/all")
    @Override
    public Api<List<DTO>> list(
            @PageableDefault
            Pageable pageable
    ) {
        return crudAbstractService.list(pageable);
    }

}
