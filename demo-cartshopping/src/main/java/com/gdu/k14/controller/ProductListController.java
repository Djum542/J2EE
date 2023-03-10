package com.gdu.k14.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gdu.k14.entity.Product;
@WebServlet(urlPatterns = {"/productList"})
public class ProductListController extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        List<Product> ds = new ArrayList<Product>();
        req.setAttribute("products", ds);
        RequestDispatcher forward = req.getRequestDispatcher("/WEB-INF/views/productlist.jsp");
        forward.forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // // TODO Auto-generated method stub
        // super.doPost(req, resp);
        doGet(req, resp);
    }
}
