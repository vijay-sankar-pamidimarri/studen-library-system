package com.example.studen.library.system.controller;

import com.example.studen.library.system.Requestdto.studentdto;
import com.example.studen.library.system.services.servicesOfstudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class Studencontroller {
    @Autowired
    servicesOfstudent student1 ;
    @PostMapping("/createaccount")
    public String add(@RequestBody studentdto studenadding){
        String k=student1.addDetails(studenadding);
        return k;
    }
    @DeleteMapping("/Deleteall")
    public String delete(){
        String k=student1.deleteall();
        return k;
    }

}
