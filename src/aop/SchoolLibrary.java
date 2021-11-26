package aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary {

    public void getBook(int age) {
        System.out.println("Попытка вернуть книгу из SchoolLibrary");
    }
}
