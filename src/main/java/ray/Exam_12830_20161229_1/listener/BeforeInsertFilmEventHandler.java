package ray.Exam_12830_20161229_1.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import ray.Exam_12830_20161229_1.event.BeforeInsertEvent;

@Component
public class BeforeInsertFilmEventHandler implements ApplicationListener<BeforeInsertEvent> {

    @Override
    public void onApplicationEvent(BeforeInsertEvent event) {
        System.out.println("Before Insert Film Data");
    }
}
