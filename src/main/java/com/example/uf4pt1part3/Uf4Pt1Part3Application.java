package com.example.uf4pt1part3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Uf4Pt1Part3Application {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hola Oriol";
    }

    @RequestMapping("/imprimirArray")
    @ResponseBody
    String[] array1() {
        String cotxes[] = {"Astra", "Fiesta", "Focus"};
        return cotxes;
    }

    public static void main(String[] args) {
        SpringApplication.run(Uf4Pt1Part3Application.class, args);
    }

}
