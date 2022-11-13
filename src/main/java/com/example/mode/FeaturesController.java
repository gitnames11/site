package com.example.mode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FeaturesController {

    @GetMapping("/features")
    public String blog(Model model) {
        model.addAttribute("title", "The title of the blog");
        return "features";
    }
}
