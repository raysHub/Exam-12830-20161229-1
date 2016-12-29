package ray.Exam_12830_20161229_1.event;

import org.springframework.context.ApplicationEvent;

public class InsertEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1L;

    private String message;

    public InsertEvent(Object source) {
        super(source);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
