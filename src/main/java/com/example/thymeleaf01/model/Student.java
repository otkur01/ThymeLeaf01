package com.example.thymeleaf01.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String state;


}
