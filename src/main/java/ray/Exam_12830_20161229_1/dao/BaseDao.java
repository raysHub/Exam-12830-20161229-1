package ray.Exam_12830_20161229_1.dao;

import ray.Exam_12830_20161229_1.dto.Film;

public interface BaseDao {

    void insert(Film film);

    // 预留
    int delete(Integer id);

    // 预留
    int update(Film film);

    // 预留
    int select(Film film);

}
