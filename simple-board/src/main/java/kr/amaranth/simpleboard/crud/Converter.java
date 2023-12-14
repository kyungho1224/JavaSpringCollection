package kr.amaranth.simpleboard.crud;

/**
 * Created by KimKyungHo on 2023-12-13(013)
 */
public interface Converter<DTO, ENTITY> {

    DTO toDto(ENTITY entity);

    ENTITY toEntity(DTO dto);
}
