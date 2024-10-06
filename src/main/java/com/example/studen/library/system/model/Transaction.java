package com.example.studen.library.system.model;

import com.example.studen.library.system.Enums.TransactionName;
import com.example.studen.library.system.Enums.Transactionstatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity//creates the filds in the tabls
@Table(name = "Transaction")//creates the table
@Builder
public class Transaction {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private  int id;
 private TransactionName name;
 private int fine;
 @CreationTimestamp
 private Date takeon;
 @UpdateTimestamp
 private Date duedate;
 @Enumerated(value = EnumType.STRING)
 private Transactionstatus status;
 @ManyToOne
 @JoinColumn(name="Book_id")
 private Book book;
 @ManyToOne
 @JoinColumn(name = "Card_id")
 private Card card;

}
