package com.Demo.StudentJPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Demo.StudentJPA.Model.Student;

public interface StudRepo extends JpaRepository<Student, Long>{

}
