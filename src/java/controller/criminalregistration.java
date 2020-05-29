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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class criminalregistration extends HttpServlet {

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
            String ffname=request.getParameter("ffname");
            String fmname=request.getParameter("fmname");
            String flname=request.getParameter("flname");
            String violation=request.getParameter("violation");
            String type=request.getParameter("type");
            String contact=request.getParameter("contact");
            
           
            
            String peradd=request.getParameter("peradd");
            String perstate=request.getParameter("perstate");
            String percity=request.getParameter("percity");
            String ppincode=request.getParameter("ppincode");

            
             try
        {
             Class.forName("com.mysql.jdbc.Driver");
               Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ocrms","root","");
               PreparedStatement ps=con.prepareStatement("insert into crirecord(fname,mname,lname,ffname,fmname,flname,violation,contact,dob,perstate,percity,perpincode,peradd) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
               ps.setString(1,fname);
               ps.setString(2,mname );
               ps.setString(3,lname );
               ps.setString(4,ffname);
               ps.setString(5,fmname);
               ps.setString(6,flname);
               
               
               ps.setString(7,violation );
               ps.setString(8,contact );
               ps.setString(9,dob );
              
               
             
               ps.setString(10,perstate );
               ps.setString(11, percity );
               ps.setString(12,ppincode );
               ps.setString(13,peradd );
              
               int a=ps.executeUpdate();
               if(a>0)
               {
                   response.sendRedirect("home.jsp?crimesucc");
               }
               else
               {
                   response.sendRedirect("home.jsp?crimefail");
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
