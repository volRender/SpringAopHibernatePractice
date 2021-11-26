package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundAdvice {

    @Around("execution(* returnBook())")
    public Object aroundAdviceReturnBook(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Начало работы Around-advice");
        Object targetResult = proceedingJoinPoint.proceed();
        targetResult = "Мастер и Маргарита";
        System.out.println("Конец работы Around-advice");
        return targetResult;
    }

}
