package com.gdu.k14pm.controller;

import java.io.IOException;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gdu.k14pm.bean.Product;
import com.gdu.k14pm.conn.SQLserverconn;
import com.gdu.k14pm.model.Connections;
import com.gdu.k14pm.model.MyUtils;
import com.gdu.k14pm.util.DBUtil;
@WebServlet(urlPatterns = {"/productlist"})
public class ProductListServlet extends HttpServlet{
    // private static final long serialVersionUID = 1L;

	// public ProductListServlet() {
	// 	super();
	// }

	// @Override
	// protected void doGet(HttpServletRequest request, HttpServletResponse response)
	// 		throws ServletException, IOException {
	// 	Connection conn = MyUtils.getStoredConnection(request);

	// 	String errorString = null;
	// 	List<Product> list = null;
	// 	try {
	// 		list = DBUtil.queryProduct(conn);
	// 	} catch (SQLException e) {
	// 		e.printStackTrace();
	// 		errorString = e.getMessage();
	// 	}
	// 	// Store info in request attribute, before forward to views
	// 	request.setAttribute("errorString", errorString);
	// 	request.setAttribute("productList", list);
		
	// 	// Forward to /WEB-INF/views/productListView.jsp
	// 	RequestDispatcher dispatcher = request.getServletContext()
	// 			.getRequestDispatcher("/WEB-INF/views/productListView.jsp");
	// 	dispatcher.forward(request, response);
	// }

	// @Override
	// protected void doPost(HttpServletRequest request, HttpServletResponse response)
	// 		throws ServletException, IOException {
	// 	doGet(request, response);
	// }
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher foRequestDispatcher = req.getRequestDispatcher("/WEB-INF/view/productlistview.jsp");
		Connections conn = null;
		try {
			conn = SQLserverconn.getSQLServerConnection_JTDS();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String errorString = null;
		List<Product> list = new ArrayList<Product>();
		try {
			list = DBUtil.queryProduct(conn);
		} catch (SQLException e) {
			e.printStackTrace();
			errorString = e.getMessage();
		}
		// Store info in request attribute, before forward to views
		req.setAttribute("errorString", errorString);
		req.setAttribute("productList", list);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
