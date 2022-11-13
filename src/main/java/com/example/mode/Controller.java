package com.example.mode;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Home page");
        return "home";
    }

    @GetMapping("/pricing")
    public String pricing(Model model) {
        model.addAttribute("title", "Home page");
        return "pricing";
    }

    @GetMapping("/FAQs")
    public String FAQs(Model model) {
        model.addAttribute("title", "Home page");
        return "FAQs";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Home page");
        return "about";
    }

    @GetMapping("/Orion")
    public String Orion(Model model) {
        model.addAttribute("title", "Home page");
        return "Orion";
    }

    @GetMapping("/Sirius")
    public String Sirius(Model model) {
        model.addAttribute("title", "Home page");
        return "Sirius";
    }

    @GetMapping("/Zeta")
    public String Zeta(Model model) {
        model.addAttribute("title", "Home page");
        return "Zeta";
    }
}
