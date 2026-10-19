package org.example.restcontrolleradvice.controller;

import org.example.restcontrolleradvice.model.Product;
import org.example.restcontrolleradvice.model.Student;
import org.example.restcontrolleradvice.service.ProductService;
import org.example.restcontrolleradvice.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    Student getStudent(@PathVariable String id) {
        return studentService.getStudent(id);
    }
}
