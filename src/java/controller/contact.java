/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.mail.*;
import javax.mail.internet.*;
/**
 *
 * @author MY HP
 */
public class contact extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
          String fname=request.getParameter("fname");
          String contact=request.getParameter("phone");
          String id=request.getParameter("policeid");
          String email=request.getParameter("email");
          String lname=request.getParameter("lname");
          String usermessage=request.getParameter("message");
          
               Properties prop=new Properties();
     prop.put("mail.smtp.host","smtp.gmail.com");
     prop.put("mail.smtp.socketFactory.port","465");
     prop.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
     prop.put("mail.smtp.auth","true");
     prop.put("mail.smtp.port","465");
    Session sess=Session.getInstance(prop,new javax.mail.Authenticator(){
  protected PasswordAuthentication getPasswordAuthentication()
  {
    return new PasswordAuthentication("pratul180395060296@gmail.com","qwerty@12345");

  }

});

   try
   {
    MimeMessage message=new MimeMessage(sess);
     message.setFrom(new InternetAddress("pratul180395@gmail.com"));
     message.addRecipient(Message.RecipientType.TO,new InternetAddress("pratul180395@gmail.com"));
    
     
     message.setSubject("Enquiry Mail");
      message.setText(" Name:"+fname+" " +lname+"\n Police Id:"+id+"\n Email Address: "+email+" \n Contact Number:"+contact+"\n Message:"+usermessage+"");

     Transport.send(message);
     response.sendRedirect("index.jsp?send=true");

   }catch(Exception ex){
out.println(ex.toString());
}
          
          
          
        }
        catch(Exception ex)
        {
            out.println(ex.toString());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
