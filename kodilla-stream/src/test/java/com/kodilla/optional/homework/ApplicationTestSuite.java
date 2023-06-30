package com.kodilla.optional.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTestSuite {

    private List<Student> createSampleStudentList() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Konrad", new Teacher("Aaaron")));
        students.add(new Student("Wiktoria", new Teacher("Aaron")));
        students.add(new Student("Sylwia", null));
        students.add(new Student("Barbara", new Teacher("Kamil")));
        students.add(new Student("Beata", null));
        students.add(new Student("John", new Teacher("Kamil")));
        return students;
    }

    @Test
    public void testCreateStudentList(){
        List<Student> students = createSampleStudentList();
        assertNotNull(students);
        assertEquals(6, students.size());
    }
}