package com.example.studentmanagement.service;

import com.example.studentmanagement.model.Student;
import com.example.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public Student createStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student getStudentById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Student updateStudent(String id, Student student) {
        student.setId(id);
        return repository.save(student);
    }

    @Override
    public void deleteStudent(String id) {
        repository.deleteById(id);
    }
}
