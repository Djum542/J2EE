package com.gdu.k14pm01.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.text.Caret;

import com.gdu.k14pm01.bean.Cart;
import com.gdu.k14pm01.model.Cartmodel;

import io.netty.handler.codec.http.HttpRequest;

@WebServlet(urlPatterns = {"/cart"})
public class CartController extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // // TODO Auto-generated method stub
        // super.doGet(req, resp);
        String straction = req.getParameter("action");
        if (straction != null && !straction.equals("")) {
            if (straction.equals("add")) {
                addTocart(req);

            } else if (straction.equals("update")) {
                updatecart(req);
            }else if (straction.equals("delete")) {
                deletecart(req);
            }
        }
        resp.sendRedirect("/WEB-INF/views/cartview.jsp");
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // // TODO Auto-generated method stub
        // super.doPost(req, resp);
        doGet(req, resp);
    }
    protected void deletecart(HttpServletRequest request){
        HttpSession session = request.getSession();
        String strItem = request.getParameter("itemIndex");
        Cartmodel car = null;
        Object obj = session.getAttribute("car");
        if (obj != null) {
            car = (Cartmodel) obj;
        } else {
            car = new Cartmodel();
        }
        car.deleteCartItem(strItem);
    }
    protected void updatecart(HttpServletRequest request){
        HttpSession session = request.getSession();
        String strQuantity = request.getParameter("iQuantity");
        String strItem = request.getParameter("itemindex");
        Cartmodel car = null;
        Object obj = session.getAttribute("car");
        if (obj!= null) {
            car = (Cartmodel) obj;
        } else {
            car = new Cartmodel();
            
        }
        car.updateCartItem(strItem, strQuantity);
    }
    protected void addTocart(HttpServletRequest request){
        HttpSession session = request.getSession();
        
        String strModel = request.getParameter("model");
        String strDescrip = request.getParameter("description");
        String strPrice = request.getParameter("price");
        String strQuantity = request.getParameter("quantity");
        Cartmodel cart = null;
        Object obj = session.getAttribute("car");
        if (obj != null) {
            cart = (Cartmodel) obj;
        }else{
            cart = new Cartmodel();
            session.setAttribute("cart", cart);
        }
        cart.addCartItem(0, 0, strModel,0, 0, 0, strDescrip, strQuantity, strPrice);
    }
}
