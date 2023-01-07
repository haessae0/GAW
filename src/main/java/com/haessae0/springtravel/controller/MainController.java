package com.haessae0.springtravel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/GAW")
    public String index() {
        return "index";
    }
}
