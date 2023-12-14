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
public class Api<T> {

    private T body;

    private Pagination pagination;
}
