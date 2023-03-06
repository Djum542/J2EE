package com.gdu.k14pm01.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gdu.k14pm01.bean.CartItem;
import com.gdu.k14pm01.entity.CartModel;
import com.gdu.k14pm01.entity.Dao;
@WebServlet(urlPatterns = {"/cart"})
public class CartController extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // // TODO Auto-generated method stub
        // super.doGet(req, resp);
        CartModel cart = new CartModel();
        List<CartItem> list = cart.getCart();
        //lay danh sach
        req.setAttribute("listJSp", list);
        RequestDispatcher dipa = req.getRequestDispatcher("cart.html");
        dipa.forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // // TODO Auto-generated method stub
        // super.doPost(req, resp);
        doGet(req, resp);
    }
}
