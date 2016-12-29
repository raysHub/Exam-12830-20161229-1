package ray.Exam_12830_20161229_1.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import ray.Exam_12830_20161229_1.event.InsertEvent;

@Component
public class InsertEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publish() {
        InsertEvent event = new InsertEvent(this);
        // transmit message here
        event.setMessage("My event published");
        publisher.publishEvent(event);
    }

}
