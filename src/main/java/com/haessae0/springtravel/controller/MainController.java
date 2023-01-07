package com.haessae0.springtravel.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/GAW")
@RequiredArgsConstructor
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
