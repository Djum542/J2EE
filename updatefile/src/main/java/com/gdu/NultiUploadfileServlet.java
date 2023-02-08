package com.gdu;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class NultiUploadfileServlet extends HttpServlet{
   private static final long serialVersionuid=1L;
   private static final String UPLOAD_DIRECTORY = "UPLOAD";
   private static final int THRESHOLD_SIZE = 1024*1024*3;
   private static final int MAX_FILE_SIZE = 1024*1024*10;
   private static final int REQUEST_FILE = 1024*1024*50;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        // super.doGet(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        // super.doPost(req, resp);
        if (!ServletFileUpload.isMultipartContent(req)) {
            resp.getWriter().println("Does not support");
            return;
        } else {
            System.out.println("ERROR 404");
        }
        DiskFileItemFactory factory = new DiskFileItemFactory();
        factory.setSizeThreshold(THRESHOLD_SIZE);
        factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
        ServletFileUpload upload = new ServletFileUpload();
        upload.setFileSizeMax(MAX_FILE_SIZE);
        upload.setSizeMax(REQUEST_FILE);
        // thu muc luu tru
        String uploadPath = getServletContext().getRealPath("")+File.separator+UPLOAD_DIRECTORY;
        //Tao thu muc meu chu ton tai
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        } else {
            System.out.println("Does not create file");

        }
        try {
            List formItems = upload.parseRequest(req);
            Iterator iter = formItems.iterator();
            while (iter.hasNext()) {
                FileItem item = (FileItem) iter.next();
                if (!item.isFormField()) {
                    String fileName = new File(item.getName()).getName();
                    String filePath = uploadPath+File.separator+fileName;
                    File storeFile = new File(filePath);
                    item.write(storeFile);
                }
            }
            req.setAttribute("messane", "Upload has been don successfull");
        } catch (Exception e) {
            // TODO: handle exception
            req.setAttribute("message", "There was an error:"+e.getMessage());
            e.printStackTrace();
        }
        getServletContext().getRequestDispatcher("MessageServlet").forward(req, resp);
    }
}
