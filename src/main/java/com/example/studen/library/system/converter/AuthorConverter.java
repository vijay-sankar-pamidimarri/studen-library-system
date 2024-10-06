package com.example.studen.library.system.converter;

import com.example.studen.library.system.Requestdto.Authordto;
import com.example.studen.library.system.model.author;

public class AuthorConverter {
    public static author SaveAuthor(Authordto k1){
        author aut=new author();
        aut.setName(k1.getName());
        aut.setAge(k1.getAge());
        aut.setCountry(k1.getCountry());
        return aut;

    }
}
