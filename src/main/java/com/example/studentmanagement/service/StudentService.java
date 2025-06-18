package com.example.studentmanagement.service;

import com.example.studentmanagement.model.Student;
import java.util.List;

public interface StudentService {
    Student createStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(String id);
    Student updateStudent(String id, Student student);
    void deleteStudent(String id);
}
