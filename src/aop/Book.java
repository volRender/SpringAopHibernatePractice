package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Идиот")
    private String name;

    @Value("Достоевский")
    private String author;

    @Value("18")
    private int age;

    public String getName() {
        return name;
    }
}
