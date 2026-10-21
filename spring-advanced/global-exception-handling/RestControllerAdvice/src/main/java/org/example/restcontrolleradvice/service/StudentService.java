package org.example.restcontrolleradvice.service;

import org.example.restcontrolleradvice.model.Product;
import org.example.restcontrolleradvice.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public Student getStudent(String id) {
        if (id.equals("1")) {
            return new Student("1", "John Doe", false);
        } else {
            throw new RuntimeException(
                    "Student with id " + id + " not found");
        }
    }
}
