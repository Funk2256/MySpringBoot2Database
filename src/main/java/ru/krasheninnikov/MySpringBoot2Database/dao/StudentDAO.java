package ru.krasheninnikov.MySpringBoot2Database.dao;

import org.springframework.stereotype.Repository;
import ru.krasheninnikov.MySpringBoot2Database.entity.Student;

import java.util.List;

@Repository
public interface StudentDAO {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);
}
