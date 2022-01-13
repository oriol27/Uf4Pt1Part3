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

    public static void main(String[] args) {
        SpringApplication.run(Uf4Pt1Part3Application.class, args);
    }

}
