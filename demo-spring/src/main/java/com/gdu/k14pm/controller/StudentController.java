package com.gdu.k14pm.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gdu.k14pm.entity.Student;

@Controller
// @RequestMapping("/student-mgr")
public class StudentController extends HttpServlet{
    @RequestMapping("show-form")
    public String showform() {
        return "student";
    } 
}
    // //Dat kieu du lieu get
    // @RequestMapping(value = "show-form", method = RequestMethod.GET)
    // public String showForm(){
    //     return "student";
    // }
    // // Dat kieu post
    // @RequestMapping(value = "save-data", method = RequestMethod.POST)  
    // public String saveForm(HttpServletRequest request) {
    //     String name = request.getParameter("name");
    //     String mark = request.getParameter("mark");
    //     String maior = request.getParameter("major");
    //     request.setAttribute("name", name);
    //     request.setAttribute("mark", mark);
    //     request.setAttribute("major", maior);
    //     return "save";
    // }
    // @RequestMapping()
    // public String index(ModelMap model) {
    //     model.addAttribute("model","Ban goi");
    //     return "student-mgr";
    // }
    // @RequestMapping(params = "btnInsert")
    // public String insert(ModelMap model){
    //     model.addAttribute("model", "Ban goi insert");
    //     return "student-mgr";
    // }
    // @RequestMapping(params = "btnDelete")
    // public String delete(ModelMap model){
    //     model.addAttribute("model", "Ban goi delete");
    //     return "student-mgr";
    // }
    // @RequestMapping(params = "btnUpdate")
    // public String update(ModelMap model){
    //     model.addAttribute("model", "Ban goi update");
    //     return "student-mgr";
    // }
    // @RequestMapping(params = "btnEdit")
    // public String edit(ModelMap model){
    //     model.addAttribute("model", "Ban goi edit");
    //     return "student-mgr";
    // }
    // @RequestMapping(params = "btnInsert")
    // public String insert(ModelMap model, @RequestParam("name")String name, @RequestParam("mark")String mark, @RequestParam("major") String major) {
    //     model.addAttribute("name", name);
    //     model.addAttribute("mark", mark);
    //     model.addAttribute("major", major);
    //     return "student";
    // }
    // @RequestMapping(params = "btnUpdate")
    // public String update(ModelMap model, Student student) {
    //     model.addAttribute("student", student);
    //     return "save2";
    
    // @RequestMapping("index")
    // public String index(ModelMap model) {
    //     Student student = new Student("Nguyen Van Teo", 9.5, "WEB");
    //     model.addAttribute("student", student);
    //     return "student";
    // }
    

