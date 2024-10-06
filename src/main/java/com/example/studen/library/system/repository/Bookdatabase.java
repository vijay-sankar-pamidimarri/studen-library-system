package com.example.studen.library.system.repository;

import com.example.studen.library.system.Enums.genera;
import com.example.studen.library.system.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface Bookdatabase extends JpaRepository<Book,Integer> {
        @Query(nativeQuery = true ,value="Select * from Book where name=:title")
    public Book findByName(String title);

}
