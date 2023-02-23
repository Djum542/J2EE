package com.gdu.k14.controller;

import java.io.IOException;
import java.net.http.HttpRequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gdu.k14.entity.CartBean;

public class CartController extends HttpServlet{
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String strAction = req.getParameter("action");
        if (strAction != null && !strAction.equals("")) {
            if (strAction.equals("add")) {
                addTocart(req);

            } else if(strAction.equals("Update")){
                updateCart(req);
            }else if (strAction.equals("Delete")) {
                deleteCart(req);
            }
        }
        resp.sendRedirect("getsser");
        
    }
    protected void deleteCart(HttpServletRequest request){
        HttpSession session = request.getSession();
        String strItemIndex = request.getParameter("getServletInfo()");
        CartBean cartBean = null;
        Object objCartBean = session.getAttribute("cart");
    }
    protected void addTocart(HttpServletRequest req){}
    protected void updateCart(HttpServletRequest req){}

}
