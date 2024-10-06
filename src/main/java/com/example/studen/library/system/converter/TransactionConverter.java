package com.example.studen.library.system.converter;

import com.example.studen.library.system.Enums.TransactionName;
import com.example.studen.library.system.Requestdto.Authordto;
import com.example.studen.library.system.Requestdto.Transactiondto;
import com.example.studen.library.system.model.Transaction;
import com.example.studen.library.system.model.author;

public class TransactionConverter {

    public static Transaction SaveTransaction(Transactiondto transactiondto){
        Transaction transaction=Transaction.builder().name(transactiondto.getName()).build();
        return  transaction;


    }
}

