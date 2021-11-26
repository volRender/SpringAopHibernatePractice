package training;

import org.springframework.stereotype.Component;

//@Component("catBean")
public class Cat implements Pet {
    @Override
    public void call() {
        System.out.println("Meow!");
    }
}
