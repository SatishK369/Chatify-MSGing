package com.ext.chatifyinternalapigateway.controller;

import lombok.Data;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;

@RestController
@RequestMapping("/routes")
public class routes {


    @GetMapping("/refresh")
    public String refresh() {
        return "refresh";
    }
}
