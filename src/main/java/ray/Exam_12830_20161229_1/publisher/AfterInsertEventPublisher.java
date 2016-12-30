package ray.Exam_12830_20161229_1.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import ray.Exam_12830_20161229_1.event.AfterInsertEvent;

@Component
public class AfterInsertEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publish() {
        AfterInsertEvent event = new AfterInsertEvent(this);
        publisher.publishEvent(event);
    }

}
