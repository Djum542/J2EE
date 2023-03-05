package com.gdu.k14pm01.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gdu.k14pm01.bean.Productclothes;
import com.gdu.k14pm01.entity.Dao;

public class ProductController extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // // TODO Auto-generated method stub
        // super.doGet(req, resp);
        resp.setContentType("text/html;charset=UTF-8");
        Dao dao = new Dao();
        List<Productclothes> list = dao.getAllProduct();
        //lay danh sach
        req.setAttribute("listJSp", list);
        RequestDispatcher dipa = req.getRequestDispatcher("index.html");
        dipa.forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // // TODO Auto-generated method stub
        // super.doPost(req, resp);
        doGet(req, resp);
    }
}
