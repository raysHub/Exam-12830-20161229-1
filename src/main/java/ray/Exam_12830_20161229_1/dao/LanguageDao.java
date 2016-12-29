package ray.Exam_12830_20161229_1.dao;

import org.springframework.stereotype.Component;

@Component
public interface LanguageDao extends BaseDao {

    public int findLanguageId(Integer id);
    
}
