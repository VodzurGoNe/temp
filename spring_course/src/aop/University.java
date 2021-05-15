package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student student1 = new Student("Zahar Petrov", 3, 4.5);
        Student student2 = new Student("Havoc Pacoc", 3, 7.5);
        Student student3 = new Student("Pisos Sison", 3, 2.5);

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents() {
        System.out.println("Начало работы метода getStudents");
//        System.out.println(students.get(3));
        System.out.println("Info");
        System.out.println(students);
        return students;
    }
}
