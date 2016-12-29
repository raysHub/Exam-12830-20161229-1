package ray.Exam_12830_20161229_1.aspect;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class MyAspect {

    /**
     * This is the method which I would like to execute before a selected method
     * execution.
     */
    public void beforeAdvice(JoinPoint jp) {
        System.out.println("Before" + jp.getSignature().getName() + " Event");
    }

    /**
     * This is the method which I would like to execute after a selected method
     * execution.
     */
    public void afterAdvice(JoinPoint jp) {
        System.out.println("After" + jp.getSignature().getName() + " Event");
    }


}
