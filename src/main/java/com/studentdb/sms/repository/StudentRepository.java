package com.studentdb.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentdb.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
