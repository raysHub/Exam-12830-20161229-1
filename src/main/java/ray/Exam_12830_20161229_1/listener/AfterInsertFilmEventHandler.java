package ray.Exam_12830_20161229_1.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import ray.Exam_12830_20161229_1.event.AfterInsertEvent;

@Component
public class AfterInsertFilmEventHandler implements ApplicationListener<AfterInsertEvent> {

    @Override
    public void onApplicationEvent(AfterInsertEvent event) {
        System.out.println("After Insert Film Data");
    }
}
