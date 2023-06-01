package com.crud.StudentManagement.service;

import com.crud.StudentManagement.model.Student;
import com.crud.StudentManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentsService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        List<Student> student = new ArrayList<>();
        studentRepository.findAll().forEach(student1 -> student.add(student1));
        return student;
    }

    public Student getStudentById(long id){

        return studentRepository.findById(id).get();
    }

    public void saveOrUpdate(Student student){
        studentRepository.save(student);
    }

    public void delete(long id){
        studentRepository.deleteById(id);
    }

    public void update(Student student, long id){
        studentRepository.save(student);
    }
}
