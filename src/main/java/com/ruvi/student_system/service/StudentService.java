package com.ruvi.student_system.service;

import com.ruvi.student_system.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> getAllStudents();
}
