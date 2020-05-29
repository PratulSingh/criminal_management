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


public class policereg extends HttpServlet {

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
            String fname=request.getParameter("fname");
            String mname=request.getParameter("mname");
            String lname=request.getParameter("lname");
            String dob=request.getParameter("dob");
            
            String gender=request.getParameter("gender");
            String contact=request.getParameter("contact");
            String peradd=request.getParameter("peradd");
            String perstate=request.getParameter("perstate");
            String percity=request.getParameter("percity");
            String ppincode=request.getParameter("ppincode");
            String serviceid=request.getParameter("serviceid");
            String pass=request.getParameter("password");
         
          
            try
                
           {
               Class.forName("com.mysql.jdbc.Driver");
               Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ocrms","root","");
               PreparedStatement ps1=con.prepareStatement("select police_id from registration where police_id='"+serviceid+"'");
               ResultSet rs=ps1.executeQuery();
               if(rs.next())
               {
                   response.sendRedirect("policeregistration.html?idexists");
               }
               PreparedStatement ps= con.prepareStatement("insert into registration values(?,?,?,?,?,?,?,?,?,?,?,?)");
               
               ps.setString(1, serviceid);
               ps.setString(2, fname);
               ps.setString(3, mname);
               ps.setString(4, lname);
               ps.setString(5, dob);
              
               ps.setString(6, contact);
               ps.setString(7, perstate);
               ps.setString(8, percity);
               ps.setString(9, ppincode);
               ps.setString(10, peradd);
           
               ps.setString(11, gender);
              
               ps.setString(12, pass);
               int a=ps.executeUpdate();
               if(a>0)
               {
                   response.sendRedirect("index.jsp?successreg");
               }
              else
               {
                   response.sendRedirect("index.jsp?failreg");
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
