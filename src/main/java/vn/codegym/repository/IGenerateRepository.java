package vn.codegym.repository;

import java.util.List;

/*TODO: Bước 5: Tạo repository
 *   Interface IGenerateRepository: chứa các phương thức chung.
 * */
public interface IGenerateRepository<T> {
    List<T> findAll();

    T findById(Long id);

    void save(T t);

    void remove(Long id);
}
