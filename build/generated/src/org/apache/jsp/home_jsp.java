package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/homeheader.jsp");
    _jspx_dependants.add("/footer.jsp");
    _jspx_dependants.add("/cridetails.jsp");
    _jspx_dependants.add("/searchfir.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_redirect_url_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_dataSource;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_redirect_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_redirect_url_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_sql_query_var_dataSource.release();
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("        <link href=\"style/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"style/js/jquery-1.9.1.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"style/css/mycss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"style/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"style/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"style/css/animate.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"style/js/validator.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <title>Home</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> Home</title>\n");
      out.write("        <style>\n");
      out.write("            .modal-header, h4, .close {\n");
      out.write("                background-color: #5cb85c;\n");
      out.write("                color:white !important;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 30px;\n");
      out.write("            }\n");
      out.write("            .modal-footer {\n");
      out.write("                background-color: #f9f9f9;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <link href=\"style/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"usercss/mycss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"style/js/jquery-1.9.1.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url(Images/indian-flag-2.jpg); background-size: cover\">\n");
      out.write("\n");
      out.write("        <!-- mobile view -->\n");
      out.write("        <section>\n");
      out.write("            <header>\n");
      out.write("\n");
      out.write("                <div class=\"nav navbar-default\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"navbar-header\">\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle \" data-toggle=\"collapse\" data-target=\"#menu\">\n");
      out.write("                                <span class=\"sr-only\">toggle navigation</span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <a class=\"navbar-brand menu\" style=\"color: #ffffff;font-size: large;\" href=\"home.jsp\">Criminal Record Management System</a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                       \n");
      out.write("\n");
      out.write("                        <!-- nav-bar links -->\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"menu\">\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                <li class=\"menu dropdown\"><a style=\"font-size: larger; color: whitesmoke; background: transparent\"  class=\"glyphicon glyphicon-cog\" data-toggle=\"dropdown\" href=\"#\"><span class=\"caret\"></span></a>\n");
      out.write("                                    <ul class=\"dropdown-menu dropdown-menu-left\">\n");
      out.write("                                        <li class=\"menu\"><a href=\"\"  data-toggle=\"modal\" data-target=\"#policeprofile\"><b>Account</b></a></li>\n");
      out.write("                                        <li class=\"menu\"><a href=\"\" data-toggle=\"modal\" data-target=\"#pass\"><b>Security</b></a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <li class=\"menu dropdown \" ><a style=\"font-size: larger; color: whitesmoke; background: transparent;\" class=\"glyphicon glyphicon-user\" data-toggle=\"dropdown\" href=\"#\"><span class=\"caret\"> </span></a>\n");
      out.write("                                    <ul class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                                        <li><a style=\"font-size: large\" ><b>Welcome User:</b></a></li>\n");
      out.write("                                        <li><a >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.sas}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\n");
      out.write("                                        <li class=\"menu\"><a class=\"glyphicon glyphicon-log-out\" href=\"logout\" style=\"font-size: large\"><b> SignOut</b></a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("            </header>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("                                        \n");
      out.write("    <!-- Police Profile Modal start -->\n");
      out.write("                <div style=\"top: 10%\" class=\"modal fade\" id=\"policeprofile\" role=\"dialog\">\n");
      out.write("                    <div class=\"modal-dialog\" style=\"width: 80%\">\n");
      out.write("\n");
      out.write("        <!-- Modal content-->\n");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_sql_query_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    \n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                <h4 class=\"modal-title\">Police Officer Profile</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <form action=\"policeprofile\" method=\"post\" role=\"form\">\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <input type=\"submit\" value=\"Update\" class=\"btn btn-info btn-block\">\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write(" \n");
      out.write("                </div>    \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("                \n");
      out.write("                <!-- Police Profile modal End -->\n");
      out.write("                \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"style/js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"style/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("        <link href=\"style/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"style/js/jquery-1.9.1.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"style/css/mycss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"style/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"style/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"style/css/animate.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"style/js/validator.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        ");
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
      out.write("        ");
      if (_jspx_meth_sql_setDataSource_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("         ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
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
      out.write("                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
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
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
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
      out.write("        ");
      if (_jspx_meth_sql_setDataSource_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("                  <!-- FIR details Modal start -->\n");
      out.write("                <div style=\"top: 10%\" class=\"modal fade\" id=\"firdetails\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("        <!-- Modal content-->\n");
      out.write("\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                <h4 class=\"modal-title\">FIR Details</h4>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <form  role=\"form\">\n");
      out.write("                         ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <a href=\"home.jsp\" class=\"btn btn-info btn-block\">OK</a>\n");
      out.write("                        \n");
      out.write("                    </form>\n");
      out.write(" \n");
      out.write("                </div>    \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("                \n");
      out.write("                <!-- FIR details modal End -->\n");
      out.write("\n");
      out.write("            \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("        \n");
      out.write("        <!-- change password modal start -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"modal fade\" id=\"pass\" role=\"dialog\" style=\"margin-top: 5%\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("        <!-- Modal content-->\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\" style=\"padding:35px 50px;\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                <h4><span class=\"glyphicon glyphicon-lock\"></span> Change Password</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\" style=\"padding:40px 50px;\">\n");
      out.write("\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <form action=\"changepassword\" method=\"post\" role=\"form\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"password\" name=\"oldpass\"  class=\"form-control input-sm\" placeholder=\"Enter Old Password\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"password\" name=\"newpass\"  class=\"form-control input-sm\" placeholder=\"Enter New Password\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"password\" name=\"confirmpass\"  class=\"form-control input-sm\" placeholder=\"Confirm Password\">\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"submit\" value=\"Submit\" class=\"btn btn-info btn-block\">\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                    ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- change password modal end  -->\n");
      out.write("\n");
      out.write("<section>\n");
      out.write("    <header  style=\"padding-left:  5px; padding-top: 50px;\"   class=\"panel-body\">\n");
      out.write("        <div style=\"padding-left:  0px;\" class=\"col-lg-2\">\n");
      out.write("            <div style=\"padding-left:  0px;\" class=\"container-fluid\">\n");
      out.write("                <div class=\" panel panel-default\">\n");
      out.write("                     <div class=\"panel-heading\">\n");
      out.write("                        <a class=\"panel-title\" style=\"text-decoration: none\" href=\"\" data-toggle=\"modal\" data-target=\"#searchcri\">Search Criminal </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <a class=\"panel-title\" style=\"text-decoration: none\" href=\"\" data-toggle=\"modal\" data-target=\"#fir\">File FIR </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <a class=\"panel-title\" style=\"text-decoration: none\" href=\"\"data-toggle=\"modal\" data-target=\"#searchfir\" >Search FIR </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <a class=\"panel-title\" style=\"text-decoration: none\" href=\"criminalreg.html\">Register Criminal </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("         <div class=\"col-lg-7 \">\n");
      out.write("            <div class=\"panel\" style=\"min-height: 500px\">\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                ");
      if (_jspx_meth_sql_setDataSource_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    \n");
      out.write("              ");
      if (_jspx_meth_c_if_8(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_if_9(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_if_10(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_if_11(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                   \n");
      out.write("            </div> \n");
      out.write("</div>\n");
      out.write("    </header>\n");
      out.write("   \n");
      out.write("</section>\n");
      out.write("                \n");
      out.write("                <!--Registration fail Modal start -->\n");
      out.write("\n");
      out.write("<div style=\"top: 30%\" class=\"modal fade\" id=\"crimefail\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("        <!-- Modal content-->\n");
      out.write("\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                <h4 class=\"modal-title\">criminal Registration Failed</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                <center><p> <input type=\"button\" value=\"OK\" class=\"btn btn-lg btn-info\" data-dismiss=\"modal\" /></p></center>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write(" <!--Registration fail Modal end -->\n");
      out.write(" \n");
      out.write(" \n");
      out.write("        <!--Registration success Modal start -->\n");
      out.write("\n");
      out.write("<div style=\"top: 30%\" class=\"modal fade\" id=\"crimesucc\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("        <!-- Modal content-->\n");
      out.write("\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                <h4 class=\"modal-title\">criminal Registration Successful</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                <center><p> <input type=\"button\" value=\"OK\" class=\"btn btn-lg btn-info\" data-dismiss=\"modal\" /></p></center>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("         \n");
      out.write("<!-- criminal registration success modal end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- fir Registration success Modal start -->\n");
      out.write("\n");
      out.write("<div style=\"top: 30%\" class=\"modal fade\" id=\"firsucc\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("        <!-- Modal content-->\n");
      out.write("\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                <h3 class=\"modal-title\">FIR FILED</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                <center><p> <input type=\"button\" value=\"OK\" class=\"btn btn-lg btn-info\" data-dismiss=\"modal\" /></p></center>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("         \n");
      out.write("<!--  fir registration success modal end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--fir  Registration unsuccess Modal start -->\n");
      out.write("\n");
      out.write("<div style=\"top: 30%\" class=\"modal fade\" id=\"firfail\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("        <!-- Modal content-->\n");
      out.write("\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                <h4 class=\"modal-title\">FIR NOT FILED</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                <center><p> <input type=\"button\" value=\"OK\" class=\"btn btn-lg btn-info\" data-dismiss=\"modal\" /></p></center>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("         \n");
      out.write("<!--fir registration unsuccess modal end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- FIR Modal start -->\n");
      out.write("                <div style=\"top: 10%\" class=\"modal fade\" id=\"fir\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("        <!-- Modal content-->\n");
      out.write("\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                <h4 class=\"modal-title\">File FIR</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <form action=\"fir\" method=\"post\" role=\"form\">\n");
      out.write("                         \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Type of FIR</label>   <input type=\"text\" required=\"re\" name=\"tfir\"  class=\"form-control input-sm\" >\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" name=\"report\"  required=\"re\" class=\"form-control input-lg\" placeholder=\"Enter Report\">\n");
      out.write("                        </div>\n");
      out.write("                         <div class=\"form-group\">\n");
      out.write("                             <label>Status of FIR</label>    <input type=\"text\" required=\"re\" name=\"status\"  class=\"form-control input-sm\" >\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"submit\" value=\"Submit\" class=\"btn btn-info btn-block\">\n");
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
      out.write("                <!-- FIR modal End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("                 <!-- search FIR Modal start -->\n");
      out.write("                <div style=\"top: 10%\" class=\"modal fade\" id=\"searchfir\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("        <!-- Modal content-->\n");
      out.write("\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                <h4 class=\"modal-title\">Search FIR</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <form action=\"home.jsp\" method=\"post\" role=\"form\">\n");
      out.write("                         \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Date Of FIR</label>   <input type=\"text\" required=\"re\" placeholder=\"YYYY-MM-DD\" name=\"dfir\"  class=\"form-control input-sm\" >\n");
      out.write("                        </div>\n");
      out.write("                   \n");
      out.write("                         <div class=\"form-group\">\n");
      out.write("                            <label>Type Of Crime</label>   <input type=\"text\" name=\"tcrime\"  class=\"form-control input-sm\" >\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"submit\" value=\"Submit\" class=\"btn btn-info btn-block\">\n");
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
      out.write("                <!-- search FIR modal End -->\n");
      out.write("\n");
      out.write("                \n");
      out.write("                  <!-- search criminal Modal start -->\n");
      out.write("                <div style=\"top: 10%\" class=\"modal fade\" id=\"searchcri\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("        <!-- Modal content-->\n");
      out.write("\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                <h4 class=\"modal-title\">Search Criminal</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <form action=\"home.jsp\" method=\"get\" role=\"form\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" name=\"name\" required=\"re\" placeholder=\"Enter criminal name \" class=\"form-control input-sm\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" name=\"state\" placeholder=\"Enter Crime State\"  class=\"form-control input-sm\" >\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                               <input type=\"text\" placeholder=\"Enter Crime City\" name=\"city\"  class=\"form-control input-sm\" >\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("                        <input type=\"submit\" value=\"Submit\" class=\"btn btn-info btn-block\">\n");
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
      out.write("                <!-- Search criminal modal End -->\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                     <!--criminal registration successful message start -->\n");
      out.write("                    \n");
      out.write("                    ");
      if (_jspx_meth_c_if_12(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    <!--criminal registration successful  message end -->\n");
      out.write("                    \n");
      out.write("                    <!--crime registration unsuccessful error message start -->\n");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_13(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!--criminal registration unsuccessful error message end -->\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("\n");
      out.write("                 <!--fir registration successful message start -->\n");
      out.write("                    \n");
      out.write("                    ");
      if (_jspx_meth_c_if_14(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    <!--fir registration successful  message end -->\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                 <!--fir registration unsuccessful message start -->\n");
      out.write("                    \n");
      out.write("                    ");
      if (_jspx_meth_c_if_15(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    <!--fir registration unsuccessful  message end -->\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                    <!--criminal details modal start -->\n");
      out.write("                    \n");
      out.write("                    ");
      if (_jspx_meth_c_if_16(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    <!--criminal details modal end -->\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                     <!--fir details modal start -->\n");
      out.write("                    \n");
      out.write("                    ");
      if (_jspx_meth_c_if_17(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    <!--firdetails modal end -->\n");
      out.write("                \n");
      out.write("                \n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.sas eq null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_c_redirect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_redirect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:redirect
    org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_redirect_0 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _jspx_tagPool_c_redirect_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
    _jspx_th_c_redirect_0.setPageContext(_jspx_page_context);
    _jspx_th_c_redirect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_redirect_0.setUrl("index.jsp?expire=Session Expred Please Login Again..");
    int _jspx_eval_c_redirect_0 = _jspx_th_c_redirect_0.doStartTag();
    if (_jspx_th_c_redirect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
      return true;
    }
    _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
    return false;
  }

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setVar("res");
    _jspx_th_sql_setDataSource_0.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:mysql://localhost:3306/ocrms");
    _jspx_th_sql_setDataSource_0.setUser("root");
    _jspx_th_sql_setDataSource_0.setPassword("");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_sql_query_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent(null);
    _jspx_th_sql_query_0.setVar("ar");
    _jspx_th_sql_query_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${res}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_0[0]++;
          _jspx_th_sql_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("    SELECT * FROM registration where police_id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.sas}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('\n');
          int evalDoAfterBody = _jspx_th_sql_query_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_0[0]--;
      }
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("row");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ar.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        \n");
          out.write("                       <table>\n");
          out.write("<tr>\n");
          out.write("<td style=\"padding: 10px;\" ><label style=\"font-family:  bold; margin-top: 10px;\" >Name:</label></td>\n");
          out.write("<td style=\"padding: 10px;\"><input  name=\"fname\" type=\"text\" class=\"form-control\" placeholder=\"First name\" disabled=\"ds\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.fname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"width: 250px;margin-left: 25px;\" ></td>\n");
          out.write("<td style=\"padding: 10px;\"><input  name=\"mname\" type=\"text\" class=\"form-control\" placeholder=\"Middle name\"  disabled=\"ds\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.mname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"width: 250px;\" ></td>\n");
          out.write("<td style=\"padding: 10px;\"><input  name=\"lname\" type=\"text\" class=\"form-control\" placeholder=\"Last name\" disabled=\"ds\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.lname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"width: 250px;\" ></td>\n");
          out.write("</tr>\n");
          out.write("<tr>\n");
          out.write("<td style=\"padding: 10px;\" ><label style=\"font-family: bold; margin-top: 10px;\" >Father's Name:</label></td>\n");
          out.write("<td style=\"padding: 10px;\"><input name=\"ffname\" type=\"text\" class=\"form-control\" placeholder=\"First name\"  disabled=\"ds\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ffname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"width: 250px;margin-left: 25px;\" ></td>\n");
          out.write("<td style=\"padding: 10px;\"><input name=\"fmname\" type=\"text\"  disabled=\"ds\" class=\"form-control\" placeholder=\"Middle name\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.fmname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"width: 250px;\" ></td>\n");
          out.write("<td style=\"padding: 10px;\"><input  name=\"flname\" type=\"text\"  disabled=\"ds\" class=\"form-control\" placeholder=\"Last name\"  value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.flname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"style=\"width: 250px;\" ></td>\n");
          out.write("</tr>\n");
          out.write("<tr>\n");
          out.write("<td style=\"padding: 10px;\" ><label style=\"font-family:  bold; margin-top: 10px;\" >Date Of Birth :</label></td>\n");
          out.write("<td style=\"padding: 10px;\"> <input type=\"date\" name=\"dob\"  disabled=\"ds\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.dob}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"form-control\" style=\"width: 250px;margin-left: 25px;\"></td>\n");
          out.write("</tr>\n");
          out.write("<tr>\n");
          out.write("<td style=\"padding: 10px;\" ><label style=\"font-family:  bold; margin-top: 10px;\" >Email:</label></td>\n");
          out.write("<td style=\"padding: 10px;\"><input  name=\"email\" type=\"email\"  class=\"form-control\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" placeholder=\"ex:-police@gmail.com\" style=\"width: 250px;margin-left: 25px;\" ></td>\n");
          out.write("</tr>\n");
          out.write("<tr>\n");
          out.write("<td style=\"padding: 10px;\" ><label style=\"font-family:   bold; margin-top: 10px;\" >Gender:</label></td>\n");
          out.write("    <td ><input type=\"radio\"  disabled=\"ds\" name=\"gender\" value=\"Male\" checked=\"ch\" style=\"margin-left:35px;margin-top:10px; \"/>Male\n");
          out.write("<input type=\"radio\"   disabled=\"ds\"  name=\"gender\" value=\"Female\" style=\"margin-left:20px;margin-top:10px;\" />Female</td>\n");
          out.write("</tr>\n");
          out.write("\n");
          out.write("<tr>\n");
          out.write("<td style=\"padding: 10px;\" ><label style=\"font-family:  bold; margin-top: 10px;\" >Contact Number:</label></td>\n");
          out.write("<td style=\"padding: 10px;\"><input  name=\"contact\"value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.contact}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" type=\"text\" class=\"form-control\" placeholder=\"9199999999\" style=\"width: 250px; margin-left: 25px;\" ></td>\n");
          out.write("</tr>\n");
          out.write("</table>\n");
          out.write("<fieldset style=\"margin-top: 30px; \" >\n");
          out.write("<legend>Address :</legend>\n");
          out.write("<table>\n");
          out.write(" <tr>\n");
          out.write("<td style=\"padding: 10px;\" ><label style=\"font-family:  bold; margin-top: 10px;\" >Address:</label></td>\n");
          out.write("<td style=\"padding: 10px;\"><input name=\"peradd\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.per_address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" type=\"text\" class=\"form-control\" placeholder=\"Enter Address\" style=\"width: 250px;margin-left: 75px;\"></td>\n");
          out.write("</tr>\n");
          out.write("<tr>\n");
          out.write("<td style=\"padding: 10px;\"><label style=\"font-family:  bold; margin-top: 10px;\" >State:</label></td>\n");
          out.write("<td style=\"padding: 10px;\"><input type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.per_state}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"perstate\" class=\"form-control\" placeholder=\"Enter State\" style=\"width: 250px;margin-left: 75px;\"></td>\n");
          out.write("</tr>\n");
          out.write("<tr>\n");
          out.write("<td style=\"padding: 10px;\" ><label style=\"font-family: bold; margin-top: 10px;\" >City:</label></td>\n");
          out.write("<td style=\"padding: 10px;\"><input type=\"text\"value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.per_city}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"percity\" class=\"form-control\" placeholder=\"Enter City\" style=\"width: 250px;margin-left: 75px;\"></td>\n");
          out.write("</tr>\n");
          out.write("<tr>\n");
          out.write("<td style=\"padding: 10px;\" ><label style=\"font-family:  bold; margin-top: 10px;\" >Pincode:</label></td>\n");
          out.write("<td style=\"padding: 10px;\"><input  name=\"ppincode\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.per_pincode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" type=\"text\" class=\"form-control\" placeholder=\"802102\" style=\"width: 250px;margin-left: 75px;\" ></td>\n");
          out.write("</tr>\n");
          out.write("</table>\n");
          out.write("</fieldset>\n");
          out.write("    \n");
          out.write("\n");
          out.write("    \n");
          out.write("    <fieldset style=\"margin-top: 30px;\">\n");
          out.write("\n");
          out.write("<td style=\"padding: 10px;\" ><label style=\"font-family:  bold; margin-top: 10px;\" >Service id:</label></td>\n");
          out.write("<td style=\"padding: 10px;\"><input  name=\"serviceid\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.police_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"  disabled=\"ds\" type=\"text\" class=\"form-control\" placeholder=\"802102\" style=\"width: 250px; margin-left: 0px;\"></td>\n");
          out.write("\n");
          out.write("</tr>\n");
          out.write("\n");
          out.write("<tr>\n");
          out.write("<td ><br><br><br></td>\n");
          out.write("<td ><br></td>\n");
          out.write("</tr>\n");
          out.write("<tr>\n");
          out.write("<td></td>\n");
          out.write("</tr>\n");
          out.write("</table>\n");
          out.write("<table>\n");
          out.write("<tr>\n");
          out.write("<td ><br><br><br></td>\n");
          out.write("<td ><br></td>\n");
          out.write("</tr>\n");
          out.write("</table>\n");
          out.write("                       ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_sql_setDataSource_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_1 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_1.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_1.setParent(null);
    _jspx_th_sql_setDataSource_1.setVar("try");
    _jspx_th_sql_setDataSource_1.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_1.setUrl("jdbc:mysql://localhost:3306/ocrms");
    _jspx_th_sql_setDataSource_1.setUser("root");
    _jspx_th_sql_setDataSource_1.setPassword("");
    int _jspx_eval_sql_setDataSource_1 = _jspx_th_sql_setDataSource_1.doStartTag();
    if (_jspx_th_sql_setDataSource_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_1);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_1);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cri_id ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("         ");
        if (_jspx_meth_sql_query_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_sql_query_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_1 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_1.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_sql_query_1.setVar("des");
    _jspx_th_sql_query_1.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${try}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_1 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_1 = _jspx_th_sql_query_1.doStartTag();
      if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_1[0]++;
          _jspx_th_sql_query_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_1.doInitBody();
        }
        do {
          out.write("\n");
          out.write("             SELECT * FROM crirecord where criminal_id=10\n");
          out.write("         ");
          int evalDoAfterBody = _jspx_th_sql_query_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_1[0]--;
      }
      if (_jspx_th_sql_query_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_1.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("row");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${des.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
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
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_sql_setDataSource_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_2 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_2.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_2.setParent(null);
    _jspx_th_sql_setDataSource_2.setVar("vas");
    _jspx_th_sql_setDataSource_2.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_2.setUrl("jdbc:mysql://localhost:3306/ocrms");
    _jspx_th_sql_setDataSource_2.setUser("root");
    _jspx_th_sql_setDataSource_2.setPassword("");
    int _jspx_eval_sql_setDataSource_2 = _jspx_th_sql_setDataSource_2.doStartTag();
    if (_jspx_th_sql_setDataSource_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_2);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_2);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.fir_id ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_sql_query_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_sql_query_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_2 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_2.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_sql_query_2.setVar("asd");
    _jspx_th_sql_query_2.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vas}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_2 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_2 = _jspx_th_sql_query_2.doStartTag();
      if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_2[0]++;
          _jspx_th_sql_query_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_2.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                SELECT *  FROM fir where fir_id=10\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_sql_query_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_2[0]--;
      }
      if (_jspx_th_sql_query_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_2.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("row");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${asd.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <div class=\"form-group\">\n");
          out.write("                            <label>Date & Time of FIR</label>   <input type=\"datetime\" value='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.fir_date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("' disabled=\"de\"  class=\"form-control input-sm\" >\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"form-group\">\n");
          out.write("                            <label>FIR Filed by Officer</label>   <input type=\"text\" value='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.fir_officer}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("' disabled=\"de\"   class=\"form-control input-sm\" >\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"form-group\">\n");
          out.write("                            <label>Type of FIR</label>   <input type=\"text\" value='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.fir_type}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("' disabled=\"de\" class=\"form-control input-sm\" >\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"form-group\">\n");
          out.write("                            <input type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.report}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" disabled=\"de\" class=\"form-control input-lg\" >\n");
          out.write("                        </div>\n");
          out.write("                         <div class=\"form-group\">\n");
          out.write("                             <label>Status of FIR</label>    <input type=\"text\" value='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.fir_status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'   disabled=\"de\" class=\"form-control input-sm\" >\n");
          out.write("                        </div>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.incorrect ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("    \n");
        out.write("                        <script>\n");
        out.write("                            $(document).ready(function() {\n");
        out.write("                                $(\"#pass\").modal();\n");
        out.write("\n");
        out.write("                            });\n");
        out.write("                        </script>\n");
        out.write("\n");
        out.write("                        <div class=\"alert-danger\"><h3>Old Password Not Matched</h3></div>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.update ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("    \n");
        out.write("                        <script>\n");
        out.write("                            $(document).ready(function() {\n");
        out.write("                                $(\"#pass\").modal();\n");
        out.write("\n");
        out.write("                            });\n");
        out.write("                        </script>\n");
        out.write("\n");
        out.write("                        <div class=\"alert-success\"><h3>Password Changed Successfully</h3></div>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_sql_setDataSource_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_3 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_3.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_3.setParent(null);
    _jspx_th_sql_setDataSource_3.setVar("show");
    _jspx_th_sql_setDataSource_3.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_3.setUrl("jdbc:mysql://localhost:3306/ocrms");
    _jspx_th_sql_setDataSource_3.setUser("root");
    _jspx_th_sql_setDataSource_3.setPassword("");
    int _jspx_eval_sql_setDataSource_3 = _jspx_th_sql_setDataSource_3.doStartTag();
    if (_jspx_th_sql_setDataSource_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_3);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_3);
    return false;
  }

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.name ne null and param.city ne null and param.state ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_sql_query_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_sql_query_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_3 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_3.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_sql_query_3.setVar("result");
    _jspx_th_sql_query_3.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_3 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_3 = _jspx_th_sql_query_3.doStartTag();
      if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_3[0]++;
          _jspx_th_sql_query_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_3.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                    SELECT fname,lname,perstate,percity,criminal_id from crirecord where fname LIKE '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%' and percity LIKE '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.city}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%' and perstate LIKE '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.state}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%'\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_sql_query_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_3[0]--;
      }
      if (_jspx_th_sql_query_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_3.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent(null);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.name  ne null and param.city ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_sql_query_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_sql_query_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_4 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_4.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_sql_query_4.setVar("result");
    _jspx_th_sql_query_4.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_4 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_4 = _jspx_th_sql_query_4.doStartTag();
      if (_jspx_eval_sql_query_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_4[0]++;
          _jspx_th_sql_query_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_4.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                    SELECT fname,lname,perstate,percity,criminal_id from crirecord where fname LIKE '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%' and percity LIKE '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.city}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%' \n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_sql_query_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_4[0]--;
      }
      if (_jspx_th_sql_query_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_4.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent(null);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.name   ne null and param.state ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_sql_query_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_7, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_sql_query_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_5 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_5.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_sql_query_5.setVar("result");
    _jspx_th_sql_query_5.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_5 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_5 = _jspx_th_sql_query_5.doStartTag();
      if (_jspx_eval_sql_query_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_5[0]++;
          _jspx_th_sql_query_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_5.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                    SELECT fname,lname,perstate,percity, criminal_id from crirecord where fname LIKE '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%'  and perstate LIKE '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.state}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%'\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_sql_query_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_5[0]--;
      }
      if (_jspx_th_sql_query_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_5.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_5);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent(null);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.dfir ne null and param.tfir ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_sql_query_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }

  private boolean _jspx_meth_sql_query_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_6 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_6.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_sql_query_6.setVar("asd");
    _jspx_th_sql_query_6.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_6 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_6 = _jspx_th_sql_query_6.doStartTag();
      if (_jspx_eval_sql_query_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_6[0]++;
          _jspx_th_sql_query_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_6.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                SELECT *  FROM fir where fir_date LIKE '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.dfir}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%' and fir_type LIKE '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.tfir}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%' \n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_sql_query_6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_6[0]--;
      }
      if (_jspx_th_sql_query_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_6.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_6);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent(null);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.dfir ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_sql_query_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
    return false;
  }

  private boolean _jspx_meth_sql_query_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_7 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_7.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_sql_query_7.setVar("asd");
    _jspx_th_sql_query_7.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_7 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_7 = _jspx_th_sql_query_7.doStartTag();
      if (_jspx_eval_sql_query_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_7[0]++;
          _jspx_th_sql_query_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_7.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                SELECT *  FROM fir where fir_date LIKE '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.dfir}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%' \n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_sql_query_7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_7[0]--;
      }
      if (_jspx_th_sql_query_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_7.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_7);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent(null);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${asd ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_forEach_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_10, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_c_forEach_3.setVar("row");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${asd.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <div class=\"panel-heading\">\n");
          out.write("                        <a class=\"form-control input-lg\" style=\"border-radius:2px \" href=\"home.jsp?fir_id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.fir_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&firdetails\" ><h5><label>FIR Date & Time:</label>  ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.fir_date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("   <label>Type of FIR:</label> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.fir_type}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("    </h5></a>\n");
          out.write("                    </div>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_11.setPageContext(_jspx_page_context);
    _jspx_th_c_if_11.setParent(null);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
    if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_c_forEach_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_11, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_11);
    _jspx_th_c_forEach_4.setVar("row");
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <div class=\"panel-heading\">\n");
          out.write("                        <a class=\"form-control input-lg\" style=\"border-radius:2px \" href=\"home.jsp?cri_id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.criminal_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&cridetails\" ><h5><label>Criminal Name:</label>  ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.fname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.lname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("   <label>Criminal State:</label> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.perstate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("    <label>Criminal City:</label>   ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.percity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("   <label>Type of crime:</label> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.tcrime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5></a>\n");
          out.write("                    </div>\n");
          out.write("                    \n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_12.setPageContext(_jspx_page_context);
    _jspx_th_c_if_12.setParent(null);
    _jspx_th_c_if_12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.crimesucc ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_12 = _jspx_th_c_if_12.doStartTag();
    if (_jspx_eval_c_if_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("    \n");
        out.write("                        <script>\n");
        out.write("                            $(document).ready(function() {\n");
        out.write("                                $(\"#crimesucc\").modal();\n");
        out.write("\n");
        out.write("                            });\n");
        out.write("                        </script>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
    return false;
  }

  private boolean _jspx_meth_c_if_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_13.setPageContext(_jspx_page_context);
    _jspx_th_c_if_13.setParent(null);
    _jspx_th_c_if_13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.crimefail ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_13 = _jspx_th_c_if_13.doStartTag();
    if (_jspx_eval_c_if_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("    \n");
        out.write("                        <script>\n");
        out.write("                            $(document).ready(function() {\n");
        out.write("                                $(\"#crimefail\").modal();\n");
        out.write("\n");
        out.write("                            });\n");
        out.write("                        </script>\n");
        out.write("                        \n");
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
    return false;
  }

  private boolean _jspx_meth_c_if_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_14 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_14.setPageContext(_jspx_page_context);
    _jspx_th_c_if_14.setParent(null);
    _jspx_th_c_if_14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.firsucc ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_14 = _jspx_th_c_if_14.doStartTag();
    if (_jspx_eval_c_if_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("    \n");
        out.write("                        <script>\n");
        out.write("                            $(document).ready(function() {\n");
        out.write("                                $(\"#firsucc\").modal();\n");
        out.write("\n");
        out.write("                            });\n");
        out.write("                        </script>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
    return false;
  }

  private boolean _jspx_meth_c_if_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_15 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_15.setPageContext(_jspx_page_context);
    _jspx_th_c_if_15.setParent(null);
    _jspx_th_c_if_15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.firfail ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_15 = _jspx_th_c_if_15.doStartTag();
    if (_jspx_eval_c_if_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("    \n");
        out.write("                        <script>\n");
        out.write("                            $(document).ready(function() {\n");
        out.write("                                $(\"#firfail\").modal();\n");
        out.write("\n");
        out.write("                            });\n");
        out.write("                        </script>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
    return false;
  }

  private boolean _jspx_meth_c_if_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_16 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_16.setPageContext(_jspx_page_context);
    _jspx_th_c_if_16.setParent(null);
    _jspx_th_c_if_16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cridetails ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_16 = _jspx_th_c_if_16.doStartTag();
    if (_jspx_eval_c_if_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("    \n");
        out.write("                        <script>\n");
        out.write("                            $(document).ready(function() {\n");
        out.write("                                $(\"#criminaldetails\").modal();\n");
        out.write("\n");
        out.write("                            });\n");
        out.write("                        </script>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_16);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_16);
    return false;
  }

  private boolean _jspx_meth_c_if_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_17 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_17.setPageContext(_jspx_page_context);
    _jspx_th_c_if_17.setParent(null);
    _jspx_th_c_if_17.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.firdetails ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_17 = _jspx_th_c_if_17.doStartTag();
    if (_jspx_eval_c_if_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("    \n");
        out.write("                        <script>\n");
        out.write("                            $(document).ready(function() {\n");
        out.write("                                $(\"#firdetails\").modal();\n");
        out.write("\n");
        out.write("                            });\n");
        out.write("                        </script>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_17);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_17);
    return false;
  }
}
