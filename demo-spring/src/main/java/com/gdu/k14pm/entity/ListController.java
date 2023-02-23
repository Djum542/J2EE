package com.gdu.k14pm.entity;

import javax.servlet.http.HttpServlet;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
@Controller
public class ListController{
    @ModelAttribute("major")
    public Map<String, String> getMajor() {
        Map<String, String> major = new HashMap<>();
        major.put("APP", "Ứng dụng phần mềm");
        major.put("WEB", "Thiết kế trang web");
        return major;
    }
}
