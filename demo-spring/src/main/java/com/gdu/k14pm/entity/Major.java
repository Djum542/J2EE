package com.gdu.k14pm.entity;
import java.util.*;

import org.springframework.web.bind.annotation.ModelAttribute;;
public class Major {
    private String id;
    private String name;
    public Major(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    @ModelAttribute("majors")
    public List<Major> getMajors() {
    List<Major> majors = new ArrayList<>();
    majors.add(new Major("APP", "Ứng dụng phần mềm"));
    majors.add(new Major("WEB", "Thiết kế trang web"));
    return majors;
    }

}
