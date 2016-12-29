package ray.Exam_12830_20161229_1.dao;

import ray.Exam_12830_20161229_1.dto.Film;

public interface FilmDao extends BaseDao {

    @Override
    public void insert(Film film);

}
