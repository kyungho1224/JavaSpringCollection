package kr.amaranth.springbootpractice.logic;

import java.util.List;

/**
 * Created by KimKyungHo on 2023-11-29(029)
 */
public interface Sort <T extends Comparable<T>> {
    List<T> sort(List<T> list);
}
