package com.raya.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HomeController {
    @GetMapping("/songForm")
    public String loadFormPage(Model model){
        model.addAttribute("song",new Song());
        return "songForm";
    }

    @PostMapping("/songForm")
    public String loadPage(@ModelAttribute Song song, Model model){
        model.addAttribute("song",song);
        return "confirmSong";
    }
}
