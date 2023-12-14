package kr.amaranth.memorydb.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by KimKyungHo on 2023-12-05(005)
 */


public abstract class Entity implements PrimaryKey {

    @Getter
    @Setter
    private Long id;
}
