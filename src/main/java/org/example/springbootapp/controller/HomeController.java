package org.example.springbootapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        // Add any attributes needed for the landing page here
        model.addAttribute("title", "Home");
        model.addAttribute("description", "This is a brief introduction to my personal " +
                "website where you can find more about me and my projects");
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About");
        model.addAttribute("description", "Hello, my name is Ryan Sribar. I'm from Northern " +
                "Virginia and currently attend the University of Virginia studying Computer Science and Economics.");
        return "about";
    }
}

