package com.example.studen.library.system.services;

import com.example.studen.library.system.Requestdto.studentdto;
import com.example.studen.library.system.converter.Studentconverter;
import com.example.studen.library.system.model.Card;
import com.example.studen.library.system.model.student;
import com.example.studen.library.system.repository.cardSave;
import com.example.studen.library.system.repository.databaseconnections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import re

@Service
public class servicesOfstudent {
    @Autowired
    databaseconnections connection;
    @Autowired
    cardSave c3;
    public String addDetails(studentdto s){
       student c= Studentconverter.converter(s);
       Card card=new Card();
       card.setId(c.getId());
       card.setStud(c);
       c.setCard(card);
       connection.save(c);
       return c.getName()+" saved sucessfully";
    }
    public String deleteall(){
        connection.deleteAll();
        return "Deleted";
    }


}
