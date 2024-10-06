package com.example.studen.library.system.Requestdto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class Authordto {

    private String name;

    private String country;

    private int age;
}
