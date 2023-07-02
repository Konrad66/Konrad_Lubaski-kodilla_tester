package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Konrad", new Teacher("Aaron")));
        students.add(new Student("Wiktoria", new Teacher("Aaron")));
        students.add(new Student("Sylwia", null));
        students.add(new Student("Barbara", new Teacher("Kamil")));
        students.add(new Student("Beata", null));
        students.add(new Student("John", new Teacher("Kamil")));

        for (Student student : students){
            Optional<Teacher> teacherOptional = Optional.ofNullable(student.getTeacher());
            teacherOptional.ifPresentOrElse((k) -> System.out.println(student), () -> System.out.println("<undefined>"));
        }
    }
}