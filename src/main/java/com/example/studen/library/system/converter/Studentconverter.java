package com.example.studen.library.system.converter;

import com.example.studen.library.system.Requestdto.studentdto;
import com.example.studen.library.system.model.student;

public class Studentconverter {
    public static student converter(studentdto stu){
      student st1=new student();
      st1.setName(stu.getName());
      st1.setAge(stu.getAge());
      st1.setEmail(stu.getEmail());
      st1.setGender(stu.getGender());
      return st1;
    }

}
