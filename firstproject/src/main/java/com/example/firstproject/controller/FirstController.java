package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "최근면3");
        return "greetings";
    }

    @GetMapping("/bye")
    public String seeYouTommorow(Model model) {
        model.addAttribute("nickname", "최근면3");
        return "goodbye";
    }
}
