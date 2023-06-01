package com.crud.StudentManagement.repository;

import com.crud.StudentManagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
