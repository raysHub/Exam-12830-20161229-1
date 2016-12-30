package ray.Exam_12830_20161229_1.event;

import org.springframework.context.ApplicationEvent;

public class AfterInsertEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1L;

    public AfterInsertEvent(Object source) {
        super(source);
    }

}
