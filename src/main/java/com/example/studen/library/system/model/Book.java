package com.example.studen.library.system.model;

import com.example.studen.library.system.Enums.Bookstatus;
import com.example.studen.library.system.Enums.genera;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
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
@Table(name = "Book")//creates the table
@Builder
public  class Book {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "gener")
    @Enumerated(value = EnumType.STRING)
    private genera gener;
    @Column(name = "issued_on")
    @CreationTimestamp
    private Date issued_on;
    @Column(name = "passed_on")
    @UpdateTimestamp
    private Date posted_on;
    @Enumerated(value = EnumType.STRING)
    private Bookstatus b_status;
    @ManyToOne
    @JoinColumn(name = "card_id")
    @JsonIgnore
    private Card card;
    @ManyToOne
    @JoinColumn(name = "Author_id")
    @JsonIgnore
    private author author;
    @OneToMany(mappedBy = "book",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Transaction> transaction;


}
