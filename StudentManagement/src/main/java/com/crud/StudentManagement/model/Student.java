package com.crud.StudentManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="student_details")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="student_id")
    private long id;
    @Column(name="student_age")
    private int age;
    @Column(name="student_city")
    private String city;
    @Column(name = "student_name")
    private String name;
    @Column(name = "student_book")
    private String book;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
    
    

}
