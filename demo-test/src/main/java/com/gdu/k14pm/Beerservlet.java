package com.gdu.k14pm;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Beerservlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //super.doGet(req, resp);
        resp.setContentType("text/html");
        PrintWriter ouWriter = resp.getWriter();
        System.out.println("Beer selection");
        String c = req.getParameter("color");
        System.out.println("<br> got"+c);
        Beerexpert be = new Beerexpert();
        List result = be.getbrand(c);
        Iterator it = result.iterator();
        while (it.hasNext()) {
            System.out.println("<br> try:"+it.next());
            req.setAttribute("styles", result);
            RequestDispatcher view = req.getRequestDispatcher("result.jsp");
            view.forward(req, resp);
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //super.doPost(req, resp);
    }
}
