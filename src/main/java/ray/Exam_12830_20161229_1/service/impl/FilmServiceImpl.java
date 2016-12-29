package ray.Exam_12830_20161229_1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import ray.Exam_12830_20161229_1.dao.FilmDao;
import ray.Exam_12830_20161229_1.dao.LanguageDao;
import ray.Exam_12830_20161229_1.dto.Film;
import ray.Exam_12830_20161229_1.service.FilmService;

public class FilmServiceImpl implements FilmService {
    
    @Autowired
    private FilmDao filmDao;
    
    @Autowired
    private LanguageDao languageDao;

    public boolean insertFilm(Film film){
        // 用输入的语言ID去找language表，看有没有此ID，有就返回true，没有就返回false
        if(languageDao.findLanguageId(film.getLanguageId()) > 0){
            filmDao.insert(film);
            return true;
        }
        return false;
    }

    public FilmDao getFilmDao() {
        return filmDao;
    }

    public void setFilmDao(FilmDao filmDao) {
        this.filmDao = filmDao;
    }
}
