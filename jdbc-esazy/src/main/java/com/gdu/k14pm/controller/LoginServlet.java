package com.gdu.k14pm.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gdu.k14pm.bean.UserAccount;
import com.gdu.k14pm.model.MyUtils;
import com.gdu.k14pm.util.DBUtil;
@WebServlet(urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //super.doGet(req, resp);
        RequestDispatcher dispatcher = this.getServletContext().getNamedDispatcher("/WEB-INF/view/loginview.jsp");
        dispatcher.forward(req, resp);
        // khi nut submit duoc nhan vaf dien day du thong tin user va password
        String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		String rememberMeStr = req.getParameter("rememberMe");
		boolean remember = "Y".equals(rememberMeStr);

		UserAccount user = null;
		boolean hasError = false;
		String errorString = null;

		if (userName == null || password == null || userName.length() == 0 || password.length() == 0) {
			hasError = true;
			errorString = "Required username and password!";
		} else {
			Connection conn = MyUtils.getStoredConnection(req);
			try {
				// Find the user in the DB.
				user = DBUtil.findUser(conn, userName, password);

				if (user == null) {
					hasError = true;
					errorString = "User Name or password invalid";
				}
			} catch (SQLException e) {
				e.printStackTrace();
				hasError = true;
				errorString = e.getMessage();
			}
		}
		// If error, forward to /WEB-INF/views/login.jsp
		if (hasError) {
			user = new UserAccount();
			user.setUserName(userName);
			user.setPassword(password);

			// Store information in request attribute, before forward.
			req.setAttribute("errorString", errorString);
			req.setAttribute("user", user);

			// Forward to /WEB-INF/views/login.jsp
			RequestDispatcher dispatche = this.getServletContext().getRequestDispatcher("/WEB-INF/views/loginView.jsp");

			dispatche.forward(req, resp);
		}
		// If no error
		// Store user information in Session
		// And redirect to userInfo page.
		else {
			HttpSession session = req.getSession();
			MyUtils.storeLoginedUser(session, user);

			// If user checked "Remember me".
			if (remember) {
				MyUtils.storeUserCookie(resp, user);
			}
			// Else delete cookie.
			else {
				MyUtils.deleteUserCookie(resp);
			}

			// Redirect to userInfo page.
			resp.sendRedirect(req.getContextPath() + "/userInfo");
		}
	}
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //super.doPost(req, resp);
        doGet(req, resp);
    }
}
