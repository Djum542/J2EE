package com.gdu.k14pm.controller;

import javax.servlet.http.HttpServlet;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
@Controller
public class ListController{
    @ModelAttribute("major")
    public Map<String, String> getMajor() {
        Map<String, String> majors = new HashMap<>();
        majors.put("APP", "Ứng dụng phần mềm");
        majors.put("WEB", "Thiết kế trang web");
        return majors;
    }
}
