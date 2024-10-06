package com.example.studen.library.system.controller;

import com.example.studen.library.system.Enums.genera;
import com.example.studen.library.system.Requestdto.Bookdto;
import com.example.studen.library.system.model.Book;
import com.example.studen.library.system.services.Bookservices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Book")
public class BookController {
    Logger loger= LoggerFactory.getLogger(BookController.class);
    @Autowired
    Bookservices bookservices;


    @PostMapping("/addbook")

    public ResponseEntity<?> booksave(@RequestBody Bookdto bookdto) {
        loger.info("adding book data");
        try {
            String response = bookservices.save(bookdto);
            loger.info("book data is saved");
            return ResponseEntity.ok(response);

        } catch (Exception e) {
            return ResponseEntity.ok("some exception is occured" + e.getMessage());
        }
    }
    @GetMapping("/findall")
    public ResponseEntity<?> getAll(@RequestParam("pageno")int pageno,@RequestParam("pagesize") int size,@RequestParam("name") String name){
        try{
            List<Book> k1=bookservices.getPagenation(pageno,size,name);
            return ResponseEntity.ok(k1);
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Request is bad or Date Not found"+e.getMessage());
        }
    }
    @GetMapping("/get")
    public Book getAll(@RequestParam("name")String name){
        loger.info("application is started");
       return bookservices.getTitle(name);
    }
    @PostMapping("/BUY BOOK")
    public String k1(@RequestBody Bookdto bookdto){
        try{
            String book=bookservices.addBookToCard(bookdto);
            return bookdto.getName()+" saved";
        }catch (Exception e){
            return "Some exception is occured";
        }
    }




}
