package ray.Exam_12830_20161229_1.event;

import org.springframework.context.ApplicationEvent;

public class BeforeInsertEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1L;

    public BeforeInsertEvent(Object source) {
        super(source);
    }

}
