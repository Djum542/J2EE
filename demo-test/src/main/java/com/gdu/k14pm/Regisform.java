package com.gdu.k14pm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Regisform extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("Name");
        String email = req.getParameter("Email");
        String facebook = req.getParameter("Facebook");
        String shortbio = req.getParameter("Shortbio");
        String html = "<br>"+"<html>"+"<head>"+"<title>Result Page</title>"+"</head>"+"<body>"+"Firstname:"+name+"<br>"+"Email:"+email+"<br>"+"Facebook URL:"+facebook+"<br>"+"Short Bio"+shortbio+"<br>"+"</body>"+"<html>";
        out.println(html);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub

    }
}
