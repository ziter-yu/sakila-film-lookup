package com.ipp.sakila_film.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String root() {

        return "redirect:/sakila";
    }

}
