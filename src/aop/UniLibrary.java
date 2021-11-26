package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary {

    public void addBook(String name, Book book) {
        System.out.println("Попытка добавить книгу в UniLibrary ");
    }

    public void addMagazine() {
        System.out.println("Попытка добавить журнал в UniLibrary");
    }

    public String returnBook() {
        System.out.println("Попытка вернуть книгу в UniLibrary ");
        return "Идиот";
    }

    public void returnMagazine() {
        System.out.println("Попытка вернуть журнал в UniLibrary");
    }

}
