package com.example.uf4pt1part3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class ListController {
    @GetMapping("/imprimirArray")
    public String llistat(Model model) {
        model.addAttribute("list", Arrays.asList("Astra", "Fiesta", "Focus"));
        return "list";
    }
}
