package com.example.studen.library.system.Requestdto;

import com.example.studen.library.system.Enums.TransactionName;
import lombok.Data;

@Data
public class Transactiondto {
private TransactionName name;
private int card_id;
private int book_id;
}
