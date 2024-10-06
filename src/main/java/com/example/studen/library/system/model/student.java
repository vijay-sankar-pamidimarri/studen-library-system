package com.example.studen.library.system.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity//creates the filds in the tabls
@Table(name = "StudentDetails")//creates the table
public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "gender")
    private String gender;
    @Column(name = "age")
    private int age;

    @JsonManagedReference
    @OneToOne(mappedBy = "stud",cascade = CascadeType.ALL)
    private Card card;
//    @Column(name = "id")
}
