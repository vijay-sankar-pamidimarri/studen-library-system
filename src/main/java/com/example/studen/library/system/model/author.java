package com.example.studen.library.system.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.annotation.Resource;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity//creates the filds in the tabls
@Table(name = "Author")//creates the table
public class author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private int id;
    @Column(name ="name")
    private String name;
    @Column(name ="country")
    private String country;
    @Column(name ="age")
    private int age;
    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)

    private List<Book> author_books;


}
