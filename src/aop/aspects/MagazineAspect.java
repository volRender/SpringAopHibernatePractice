package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class MagazineAspect {


    @Before("aop.aspects.PointcutReference.expressionAll()")
    public void beforeMagazineAdvice() {
        System.out.println("beforeMagazineAdvice()");
    }
}
