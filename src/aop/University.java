package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    List<Student> students = new ArrayList<>();

    public void addStudent() {
        Student student = new Student("Daniil Litvishko", 21, 7.5);
        students.add(student);
    }

    public List<Student> getStudents() {
        System.out.println("А вот и студенты: ");
        System.out.println(students);
        return students;
    }

}
