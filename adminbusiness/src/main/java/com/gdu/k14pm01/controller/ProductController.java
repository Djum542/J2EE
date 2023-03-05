package com.gdu.k14pm01.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gdu.k14pm01.bean.Product;
import com.gdu.k14pm01.model.ProductModel;
@WebServlet(urlPatterns = {"/product"})
public class ProductController extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // // TODO Auto-generated method stub
        // super.doGet(req, resp);
        List<Product>  list = ProductModel.queryProduct();
        req.setAttribute("list", list);
        
        RequestDispatcher diap = req.getServletContext().getRequestDispatcher("/WEB-INF/views/productview.jsp");
        diap.forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // // TODO Auto-generated method stub
        // super.doPost(req, resp);
        doGet(req, resp);
    }
}
