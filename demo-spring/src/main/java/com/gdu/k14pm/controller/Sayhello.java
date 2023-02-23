package com.gdu.k14pm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Sayhello {
    @RequestMapping("say-hello")
    public String sayhello() {
        return "hello";
    }
}
