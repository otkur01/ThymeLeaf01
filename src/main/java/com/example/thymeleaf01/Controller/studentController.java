package com.example.thymeleaf01.Controller;


import com.example.thymeleaf01.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class studentController {

    //@RequestMapping("/register") //localhost:8080/student/register
    @GetMapping("/register")
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());

        return "student/register";


    }

    @RequestMapping("/welcome") //localhost:8080/student/welcome?name=Ozzy
  // @PostMapping("/welcome")
    public String welcome(@RequestParam String name){
       // model.addAttribute("name",name);
        return "student/welcome";
    }

}
