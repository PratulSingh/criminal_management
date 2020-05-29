package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cridetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <!-- criminal details Modal start -->\n");
      out.write("                <div style=\"top: 10%\" class=\"modal fade\" id=\"criminaldetails\" role=\"dialog\">\n");
      out.write("                    <div class=\"modal-dialog\" style=\"width: 80%\">\n");
      out.write("\n");
      out.write("        <!-- Modal content-->\n");
      out.write("\n");
      out.write("        <sql:setDataSource var=\"try\" driver=\"com.mysql.jdbc.Driver\"\n");
      out.write("                                   url=\"jdbc:mysql://localhost:3306/ocrms\"\n");
      out.write("                                   user=\"root\" password=\"\"/>\n");
      out.write("         <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cri_id ne null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("         <sql:query var=\"des\" dataSource=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${try}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("             SELECT * FROM crirecord where criminal_id=10\n");
      out.write("         </sql:query>\n");
      out.write("        </c:if>\n");
      out.write("        \n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                <h4 class=\"modal-title\">Criminal Details</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <form action=\"\" method=\"post\" role=\"form\">\n");
      out.write("                        <table>\n");
      out.write("                            <c:forEach var=\"row\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${des.rows}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("<tr>\n");
      out.write("<td style=\"padding: 10px;\" ><label style=\"font-family:  bold; margin-top: 10px;\" >Name:</label></td>\n");
      out.write("<td style=\"padding: 10px;\"><input  name=\"fname\" disabled=\"de\" type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.fname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"First name\" style=\"width: 250px;margin-left: 5px;\" ></td>\n");
      out.write("<td style=\"padding: 10px;\"><input  name=\"mname\" disabled=\"de\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.mname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" placeholder=\"Middle name\" style=\"width: 250px;\" ></td>\n");
      out.write("<td style=\"padding: 10px;\"><input  name=\"lname\" type=\"text\" disabled=\"de\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.lname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" placeholder=\"Last name\" style=\"width: 250px;\" ></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td style=\"padding: 10px;\" ><label style=\"font-family: bold; margin-top: 10px;\" >Father's Name:</label></td>\n");
      out.write("<td style=\"padding: 10px;\"><input name=\"ffname\" disabled=\"de\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ffname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" class=\"form-control\" placeholder=\"First name\" style=\"width: 250px;margin-left: 5px;\" ></td>\n");
      out.write("<td style=\"padding: 10px;\"><input name=\"fmname\" disabled=\"de\" type=\"text\"value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.fmname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" placeholder=\"Middle name\" style=\"width: 250px;\" ></td>\n");
      out.write("<td style=\"padding: 10px;\"><input  name=\"flname\" disabled=\"de\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.flname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" class=\"form-control\" placeholder=\"Last name\" style=\"width: 250px;\" ></td>\n");
      out.write("</tr>\n");
      out.write(" <tr>\n");
      out.write("<td style=\"padding: 10px;\" ><label style=\"font-family:  bold; margin-top: 10px;\" >Type of Crime:</label></td>\n");
      out.write("<td style=\"padding: 10px;\"><input  name=\"type\" disabled=\"de\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.tcrime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" class=\"form-control\" placeholder=\"Crime Type\" style=\"width: 250px; margin-left: 5px;\" ></td>\n");
      out.write(" </tr>\n");
      out.write(" <tr>\n");
      out.write("<td style=\"padding: 10px;\" ><label style=\"font-family:  bold; margin-top: 10px;\" >Section Violation:</label></td>\n");
      out.write("<td style=\"padding: 10px;\"><input  type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.violation}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  disabled=\"de\" name=\"violation\" class=\"form-control\" placeholder=\"Ex:-Section-703\" style=\"width: 250px; margin-left: 5px;\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td style=\"padding: 10px;\" ><label style=\"font-family:  bold; margin-top: 10px;\" >Contact Number:</label></td>\n");
      out.write("<td style=\"padding: 10px;\"><input  name=\"contact\"value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.contact}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" disabled=\"de\"  type=\"text\" class=\"form-control\" placeholder=\"9199999999\" style=\"width: 250px; margin-left: 5px;\" ></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td style=\"padding: 10px;\" ><label style=\"font-family:  bold; margin-top: 10px;\" >Date Of Birth :</label></td>\n");
      out.write("<td style=\"padding: 10px;\"> <input type=\"date\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.dob}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  disabled=\"de\" name=\"dob\" class=\"form-control\" style=\"width: 250px;margin-left: 5px;\"></td>\n");
      out.write("</tr>\n");
      out.write(" \n");
      out.write(" \n");
      out.write("</table>\n");
      out.write("<fieldset style=\"margin-top: 30px;\">\n");
      out.write("<legend> Criminal Address :</legend>\n");
      out.write("<table>\n");
      out.write("<tr>\n");
      out.write("<td style=\"padding: 10px;\" ><label style=\"font-family:  bold; margin-top: 10px;\" >Address:</label></td>\n");
      out.write("<td style=\"padding: 10px;\"><input name=\"peradd\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.peradd}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" disabled=\"de\"  type=\"text\"  class=\"form-control\" placeholder=\"Enter Address\" style=\"width: 250px;margin-left: 75px;\"></td>\n");
      out.write("</tr> \n");
      out.write("<tr>\n");
      out.write("<td style=\"padding: 10px;\"><label style=\"font-family:  bold; margin-top: 10px;\" >State:</label></td>\n");
      out.write("<td style=\"padding: 10px;\"><input type=\"text\" name=\"perstate\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.perstate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" disabled=\"de\" class=\"form-control\" placeholder=\"Enter State\" style=\"width: 250px;margin-left: 75px;\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td style=\"padding: 10px;\" ><label style=\"font-family: bold; margin-top: 10px;\" >City:</label></td>\n");
      out.write("<td style=\"padding: 10px;\"><input type=\"text\" name=\"percity\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.percity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" disabled=\"de\" class=\"form-control\" placeholder=\"Enter City\" style=\"width: 250px;margin-left: 75px;\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td style=\"padding: 10px;\" ><label style=\"font-family:  bold; margin-top: 10px;\" >Pincode:</label></td>\n");
      out.write("<td style=\"padding: 10px;\"><input  name=\"ppincode\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.perpincode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" disabled=\"de\" class=\"form-control\" placeholder=\"802102\" style=\"width: 250px;margin-left: 75px;\" ></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</fieldset>\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td ><br><br><br></td>\n");
      out.write("<td ><br></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td></td><td></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td ><br><br><br></td>\n");
      out.write("<td ><br></td>\n");
      out.write("</tr>\n");
      out.write("</c:forEach>\n");
      out.write("</table>\n");
      out.write("<a  href=\"home.jsp \" class=\"btn btn-info btn-block\">OK</a>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write(" \n");
      out.write("                </div>    \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("                \n");
      out.write("                <!-- criminal details modal End -->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
