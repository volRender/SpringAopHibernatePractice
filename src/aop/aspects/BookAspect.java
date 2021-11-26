package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class BookAspect {

    @Before("aop.aspects.PointcutReference.expressionAll()")
    public void beforeGetBookAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature: " + methodSignature);
        System.out.println(methodSignature.getMethod());
        System.out.println(methodSignature.getReturnType());
        System.out.println(methodSignature.getName());

        if(methodSignature.getName().equals("addBook")) {
            Object[] args = joinPoint.getArgs();
            for(Object obj: args) {
                if(obj instanceof Book) {
                    Book book = (Book) obj;
                    System.out.println("Book: " + obj);
                }
                else if(obj instanceof String) {
                    System.out.println("String: " + obj);
                }
            }
        }

        System.out.println("beforeGetBookAdvice()");
    }
}
