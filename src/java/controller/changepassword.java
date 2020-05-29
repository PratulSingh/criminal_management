/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ABHAY
 */
public class changepassword extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            HttpSession session=request.getSession();
            String oldpass=request.getParameter("oldpass");
            String newpass=request.getParameter("newpass");
            
          try
          {
               Class.forName("com.mysql.jdbc.Driver");
               Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ocrms","root","");
               PreparedStatement ps=con.prepareStatement("select police_id,password from registration where password='"+oldpass+"' and police_id='"+session.getAttribute("sas")+"'");
               ResultSet rs= ps.executeQuery();
               if(rs.next())
               {
                   PreparedStatement ps1=con.prepareStatement("update registration set password='"+newpass+"' where police_id='"+session.getAttribute("sas")+"'");
                   int a=ps1.executeUpdate();
                   if(a>0)
                   {
                       response.sendRedirect("home.jsp?update");
                   }
               }
               else
               {
                   response.sendRedirect("home.jsp?incorrect");
               }
               
          }
          catch(Exception ex)
          {
              out.println(ex.toString());
          }
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
