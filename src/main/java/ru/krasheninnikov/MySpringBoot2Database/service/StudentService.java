package ru.krasheninnikov.MySpringBoot2Database.service;

import org.springframework.stereotype.Service;
import ru.krasheninnikov.MySpringBoot2Database.entity.Student;

import java.util.List;

@Service
public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);
}
