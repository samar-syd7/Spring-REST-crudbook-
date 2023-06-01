package com.crud.StudentManagement.controller;

import com.crud.StudentManagement.model.Student;
import com.crud.StudentManagement.repository.StudentRepository;
import com.crud.StudentManagement.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController

public class StudentController {
    @Autowired
    StudentsService studentsService;

    @GetMapping("/student")
    private List<Student> getAllStudents(){
        return studentsService.getAllStudents();
    }

    @GetMapping("/student/{id}")
    private Student getStudent(@PathVariable("id") long id){
        return studentsService.getStudentById(id);
    }

    @DeleteMapping("/student/{id}")
    private void deleteStudent(@PathVariable("id") long id){
        studentsService.delete(id);
    }

    @PostMapping("/students")
    private long saveStudent(@RequestBody Student student){
        studentsService.saveOrUpdate(student);
        return student.getId();
    }

    @PutMapping("/students")
    private Student update(@RequestBody Student student){
        studentsService.saveOrUpdate(student);
        return student;
    }

}
