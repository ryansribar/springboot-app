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
                "website where you can find more about me, my projects, and my blog.");
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About Me");
        model.addAttribute("description", "This page contains information about me, my background, skills, and interests.");
        return "about";
    }
}

