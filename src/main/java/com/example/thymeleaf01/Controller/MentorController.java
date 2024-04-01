package com.example.thymeleaf01.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @RequestMapping("/register") //localhost:8080/mentor/register
    public String register(){

        return "student/register";
    }

    @RequestMapping("/drop") //localhost:8080/mentor/drop
    public String drop(){

        return "student/register";
    }

}