package com.example.studen.library.system.controller;

import com.example.studen.library.system.Requestdto.Transactiondto;
import com.example.studen.library.system.services.TransactionSevices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    TransactionSevices trasactionServices;
    @PostMapping("/save")
    public String save(@RequestBody Transactiondto transactiondto) throws ParseException {
        String response=trasactionServices.add(transactiondto);
        return response;
    }
}
