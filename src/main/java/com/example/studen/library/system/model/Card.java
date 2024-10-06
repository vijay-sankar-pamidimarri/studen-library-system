package com.example.studen.library.system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity//creates the filds in the tabls
@Table(name = "CardOfStudent")//creates the table
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @CreationTimestamp
     @Column(name = "createdon")
    private Date createdon;
    @UpdateTimestamp
     @Column(name = "updatedon")
    private Date updatedon;
     @Column(name = "quantity")
    private int quantity;
     @OneToOne
     @JoinColumn(name = "student_id")
     private student stud;
     @OneToMany(mappedBy = "card",cascade = CascadeType.ALL)

    private List<Book> listOfBokks;
     @OneToMany(mappedBy = "card",cascade = CascadeType.ALL)

     private List<Transaction> tarnsaction_list;
}
