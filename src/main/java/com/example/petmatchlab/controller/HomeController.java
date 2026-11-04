package com.example.petmatchlab.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Bienvenido al catálogo de mascotas");
        model.addAttribute("projectName", "PetMatch Lab"); 
        return "home";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/unknown")
    public String unknown() {
        return "unknown";
    }
}