package com.gdu.k14pm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Helloservlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       ServletOutputStream out = resp.getOutputStream();
       out.println("<html>");
       out.println("<head><title>Hello Servlet</title></head>");
       out.println("<body>");
       out.println("<h3>Hello World</h3>");
       out.println("This is my first Servlet");
       out.println("</body>");
       out.println("<html>");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
       
    }
}
