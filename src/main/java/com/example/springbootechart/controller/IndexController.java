package com.example.springbootechart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    /*@RequestMapping("/chart")
    public String showPage() {
        return "chart";
    }*/
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page, Model model) {
        System.out.println(page);
        model.addAttribute("msg","Hello Thymeleaf");
        return page;
    }
}


