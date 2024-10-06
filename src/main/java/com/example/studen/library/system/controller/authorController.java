package com.example.studen.library.system.controller;

import com.example.studen.library.system.Requestdto.Authordto;
import com.example.studen.library.system.services.servicesAuthoir;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class authorController {
    @Autowired
    servicesAuthoir author;
    @PostMapping("/saveauthor")
    public String autor(@RequestBody Authordto authordto){
        String response=author.Save(authordto);
        return response;
    }



}
