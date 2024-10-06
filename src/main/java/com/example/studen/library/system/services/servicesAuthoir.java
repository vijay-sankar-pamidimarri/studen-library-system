package com.example.studen.library.system.services;

import com.example.studen.library.system.Requestdto.Authordto;
import com.example.studen.library.system.converter.AuthorConverter;
import com.example.studen.library.system.model.Book;
import com.example.studen.library.system.model.author;
import com.example.studen.library.system.repository.authorconnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class servicesAuthoir {
    @Autowired
    authorconnection authordata;
    public String Save(Authordto authordto){
        author a= AuthorConverter.SaveAuthor(authordto);
        authordata.save(a);
        return a.getName()+" saved ";
    }

}
