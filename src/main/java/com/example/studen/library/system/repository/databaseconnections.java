package com.example.studen.library.system.repository;

import com.example.studen.library.system.model.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface databaseconnections extends JpaRepository<student,Integer> {
}
