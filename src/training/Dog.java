package training;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("dogBean")
public class Dog implements Pet {
    @Override
    public void call() {
        System.out.println("Bow!");
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("init-method");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("destroy-method");
//    }
}
