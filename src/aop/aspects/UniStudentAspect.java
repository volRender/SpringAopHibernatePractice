package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniStudentAspect {

    @Before("execution(* get*())")
    public void BeforeUniStudentAdvice() {
        System.out.println("BEFORE!!!");
    }

    @AfterReturning(pointcut = "execution(* get*())", returning = "students")
    public void AfterReturningUniStudentAdvice(List<Student> students) {

        Student student = students.get(0);
        String name = student.getNameSurname();
        name = "Mr. " + name;
        student.setNameSurname(name);
        Double avgGrade = student.getAvgGrade();
        avgGrade = avgGrade+1;
        student.setAvgGrade(avgGrade);
        System.out.println("AFTER RETURNING!!!");
    }

//    @AfterThrowing(pointcut = "execution(* get*())", throwing = "exception")
//    public void AfterThrowingUniStudentAdvice(Throwable exception) {
//        System.out.println("@AfterThrowing " + exception);
//    }

    @After("execution(* get*())")
    public void AfterUniStudentAdvice() {
        System.out.println("@After");
    }

}
