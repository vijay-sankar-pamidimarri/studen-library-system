package com.example.studen.library.system.converter;

import com.example.studen.library.system.Requestdto.Bookdto;
import com.example.studen.library.system.model.Book;

public class Bookconverter {
    public static  Book BookConverterinto(Bookdto bookdto){
       Book book=Book.builder().gener(bookdto.getGener()).name(bookdto.getName()).build();
        return book;
    }
}
