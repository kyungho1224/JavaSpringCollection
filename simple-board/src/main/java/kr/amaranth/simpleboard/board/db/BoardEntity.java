package kr.amaranth.simpleboard.board.db;

import jakarta.persistence.*;
import kr.amaranth.simpleboard.post.db.PostEntity;
import lombok.*;
import org.hibernate.annotations.OrderBy;
import org.hibernate.annotations.Where;

import java.util.List;

/**
 * Created by KimKyungHo on 2023-12-07(007)
 * 1. BoardEntity
 * - MySQL table, column
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity(name = "board")
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String boardName;

    private String status;

    @OneToMany(
            mappedBy = "board"
    )
    @Builder.Default
    @Where(clause = "status = 'REGISTERED'")
    @OrderBy(clause = "id desc")
    private List<PostEntity> postList = List.of();
}
