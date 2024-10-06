package com.example.studen.library.system.services;

import com.example.studen.library.system.Enums.genera;
import com.example.studen.library.system.Requestdto.Bookdto;
import com.example.studen.library.system.Requestdto.Transactiondto;
import com.example.studen.library.system.controller.TransactionController;
import com.example.studen.library.system.converter.Bookconverter;
import com.example.studen.library.system.model.Book;
import com.example.studen.library.system.model.Card;
import com.example.studen.library.system.model.Transaction;
import com.example.studen.library.system.model.author;
import com.example.studen.library.system.repository.Bookdatabase;
import com.example.studen.library.system.repository.authorconnection;
import com.example.studen.library.system.repository.cardSave;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

//import javax.smartcardio.Card;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Bookservices {
    Logger loger= LoggerFactory.getLogger(Bookservices.class);
    @Autowired
    Bookdatabase bookdatabase;
    @Autowired
    authorconnection authorconnectio_n;
    @Autowired
    cardSave card;
    @Autowired
    Transaction transaction;
    @Autowired
//    TransactionController transactionController
    public String Save(Bookdto bookdto)  {
        Book book= Bookconverter.BookConverterinto(bookdto);
        loger.info("book saving is processing wait....");
//        author auth=authorconnectio_n.findById(bookdto.getAuthor_id()).get();
        loger.info("author is adding to the the book wait....");

            author auth=authorconnectio_n.findById(bookdto.getAuthor_id()).get();
            book.setAuthor(auth);
            loger.info("author is added");



         bookdatabase.save(book);
        return book.getName()+" saved ";





    }


    public String save(Bookdto bookdto) {
        return "saved";
    }

    public List<Book> getPagenation(int pageno, int size,String name) {
        Page<Book> page=bookdatabase.findAll(PageRequest.of(pageno, size,Sort.by("name").ascending()));

        return page.getContent();
    }
    public Book getTitle(String title) {
        loger.info("application to database is connected");
        return bookdatabase.findByName(title);
    }

    public String addBookToCard(Bookdto bookdto) throws ParseException {
        boolean k1=card.existsById(bookdto.getCard_num());
        if(k1){
            Transactiondto transactiondto=new Transactiondto();
            transactiondto.setCard_id(bookdto.getCard_num());
            TransactionSevices transactionSevices=new TransactionSevices();
            String response=transactionSevices.add(transactiondto);
            return response;
        }

        return "No data Found";
    }



}

