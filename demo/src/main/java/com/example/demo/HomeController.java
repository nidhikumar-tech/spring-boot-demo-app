package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        // Passing a variable called "message" to the HTML
        model.addAttribute("message", "Hello World! Your Spring Boot app is live. 🚀");
        return "hello"; // This looks for hello.html in the templates folder
    }
}
