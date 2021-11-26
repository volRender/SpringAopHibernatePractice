package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class PointcutReference {
    @Pointcut("execution(* aop.UniLibrary.abc*(..))")
    public void expressionAll() {
    }
}
