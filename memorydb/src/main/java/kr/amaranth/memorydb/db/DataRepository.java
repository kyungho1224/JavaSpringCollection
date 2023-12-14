package kr.amaranth.memorydb.db;

import java.util.List;
import java.util.Optional;

/**
 * Created by KimKyungHo on 2023-12-05(005)
 */
public interface DataRepository<T, ID> extends Repository<T, ID> {

    // create, update
    T save(T data);

    // read
    Optional<T> findById(ID id);

    List<T> findAll();

    // delete
    void delete(ID id);
}
