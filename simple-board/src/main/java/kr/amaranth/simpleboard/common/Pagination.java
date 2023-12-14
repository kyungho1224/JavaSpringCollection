package kr.amaranth.simpleboard.common;

import lombok.*;

/**
 * Created by KimKyungHo on 2023-12-13(013)
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pagination {

    private Integer page;

    private Integer size;

    private Integer currentElements;

    private Integer totalPage;

    private Long totalElements;

}
