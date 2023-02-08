package com.gdu;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

public class Uploadimgservlet extends HttpServlet{
    private static final long servialVerssionUID = 1L;
    private static final int BUFFER_SIZE = 4096;
    private static final String SAVE_DIR = "images";
    private String dbURL = "";
    private String dbUser = "sa";
    private String dbPass = "";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //super.doGet(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //super.doPost(req, resp);
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        InputStream inputStream = null;// luong du lieu 
        Part filepart = req.getPart("photo");
        String fileUploadName = "";
        if (filepart != null) {
            fileUploadName = filepart.getName();
            inputStream = filepart.getInputStream();

        }
        Connection conn = null;
        String message = null;
        String filePath = "E:/"+fileUploadName + ".ipg";// luu image cua co so du lieu vao file nay
        try {
            DriverManager.registerDriver(com.microsoft.sqlserver.jdbc.SQLServerDriver());
            conn = DriverManager.getConnection(dbURL,dbUser,dbPass);
            String spl = "INSERT INTO contacts (firstname, lastname,photo) value(?,?,?)";
            PreparedStatement statement = conn.prepareStatement(spl);
            statement.setString(1, firstname);
            statement.setString(2, lastname);
            if (inputStream != null) {
                statement.setBlob(3, inputStream);
            }
            int row = statement.executeUpdate();// thuwc hien upload
            if (row >0) {
                message = "File ipdate and saved into database";

            }
            // Doc co so du lieu
            String sql1 = "SELECT photo FROM contacts WHERE firstname = ? AND lastname = ?";
            statement = conn.prepareStatement(sql1);
            statement.setString(1, firstname);
            statement.setString(2, lastname);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                Blob blob = result.getBlob(sql1);
                inputStream = blob.getBinaryStream();
                OutputStream outputStream = new FileOutputStream(filePath);
                int bytesRead = -1;
                byte[] buffer = new byte[BUFFER_SIZE];
                while ((bytesRead = inputStream.read(buffer))!= 1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
                inputStream.close();
                outputStream.close();
            }
        } catch (Exception e) {
            // TODO: handle exception
            message = "ERROR:" +e.getMessage();
            e.printStackTrace();
        }finally{
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
            req.setAttribute("message", message);
            getServletContext().getRequestDispatcher("messageservlet").forward(req, resp);
            
        }

    }
}
