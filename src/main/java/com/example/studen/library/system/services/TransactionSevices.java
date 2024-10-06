package com.example.studen.library.system.services;

import com.example.studen.library.system.Enums.TransactionName;
import com.example.studen.library.system.Requestdto.Transactiondto;
import com.example.studen.library.system.converter.TransactionConverter;
import com.example.studen.library.system.model.Book;
import com.example.studen.library.system.model.Card;
import com.example.studen.library.system.model.Transaction;
import com.example.studen.library.system.repository.Bookdatabase;
import com.example.studen.library.system.repository.cardSave;
import com.example.studen.library.system.repository.transactiondatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@Service
public class TransactionSevices {
    @Autowired
    transactiondatabase transactiondatabas_e;
    @Autowired
    cardSave cardsave;
    @Autowired
    Bookdatabase boookdatabase;
    public String add(Transactiondto transactiondto) throws ParseException {
        Transaction transaction= TransactionConverter.SaveTransaction(transactiondto);
        Card card=cardsave.findById(transactiondto.getCard_id()).get();
        Book book=boookdatabase.findById(transactiondto.getBook_id()).get();
        double fine=0.00;
        transaction.setBook(book);
        transaction.setCard(card);
        if(transactiondto.getName().equals(TransactionName.PURCHASE)){
            Date due=new SimpleDateFormat("DD-MM-yyy").parse(LocalDate.now().plusDays(7).toString());
            transaction.setDuedate(due);
            transaction.setFine(0);
        }

        transactiondatabas_e.save(transaction);
        return transactiondto.getName()+" saved";

    }

}
