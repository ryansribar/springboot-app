package org.example.springbootapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        // Add any attributes needed for the landing page here
        model.addAttribute("title", "Welcome to My Personal Website");
        model.addAttribute("description", "This is a brief introduction to my personal " +
                "website where you can find more about me and my projects");
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About Me");
        model.addAttribute("description", "Hi, my name is Ryan Sribar. I am a third year " +
                "Computer Science and Economics student at the University of Virginia.");
        return "about";
    }
}

