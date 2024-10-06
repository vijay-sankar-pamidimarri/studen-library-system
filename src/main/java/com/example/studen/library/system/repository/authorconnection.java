package com.example.studen.library.system.repository;

import org.springframework.stereotype.Repository;


import com.example.studen.library.system.model.author;
import com.example.studen.library.system.model.student;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface authorconnection extends JpaRepository<author,Integer> {
}
