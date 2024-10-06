package com.example.studen.library.system.Requestdto;

import com.example.studen.library.system.Enums.genera;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bookdto {

    private String name;

    private genera gener;
    private int author_id;
    private int card_num;


}
