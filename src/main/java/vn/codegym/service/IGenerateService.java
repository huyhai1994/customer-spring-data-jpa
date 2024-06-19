package vn.codegym.service;

import java.util.List;

/*TODO:
*   Bước 6: Tạo service
        - Interface IGenerateService:
            chứa các phương thức chung
* */
public interface IGenerateService<T> {
    List<T> findAll();

    void save(T t);

    T findById(Long id);

    void remove(Long id);
}
