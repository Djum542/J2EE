package com.gdu.k14pm.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Home extends HttpServlet{
    @RequestMapping("home")
    public String savefrom(HttpServletRequest request) {
        return "home";
    }
}
