package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        String result = uniLibrary.returnBook();
        System.out.println(result);

//        University university = context.getBean("university", University.class);
//        university.addStudent();
//
//        try {
//            List<Student> students = university.getStudents();
//            System.out.println(students);
//        }
//        catch (Exception e) {
//            System.out.println("Словили exception");
//        }

//        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
//        Book book = context.getBean("book", Book.class);
//        uniLibrary.addBook("Daniil", book);
//        uniLibrary.addMagazine();

//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook(21);

        context.close();
    }
}
