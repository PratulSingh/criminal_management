package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homeheader_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/footer.jsp");
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
      out.write("    <body style=\"background-image: url(Images/background1.jpg); background-size: cover\">\n");
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
          out.write("<legend>Permanent Address :</legend>\n");
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
          out.write("<fieldset style=\"margin-top: 30px;\">\n");
          out.write("<legend>Local Address :</legend>\n");
          out.write("<table>\n");
          out.write(" <tr>\n");
          out.write("<td style=\"padding: 10px;\" ><label style=\"font-family: bold; margin-top: 10px;\" >Address:</label></td>\n");
          out.write("<td style=\"padding: 10px;\"><input name=\"localadd\"  type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.local_address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"class=\"form-control\" placeholder=\"Enter Address\" style=\"width: 250px; margin-left: 75px;\"></td>\n");
          out.write("</tr>\n");
          out.write("<tr>\n");
          out.write("<td style=\"padding: 10px;\"><label style=\"font-family:  bold; margin-top: 10px;\" >State:</label></td>\n");
          out.write("<td style=\"padding: 10px;\"><input type=\"text\" name=\"localstate\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.local_state}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"form-control\" placeholder=\"Enter State\" style=\"width: 250px;margin-left: 75px;\"></td>\n");
          out.write("</tr>\n");
          out.write("<tr>\n");
          out.write("<td style=\"padding: 10px;\" ><label style=\"font-family: bold; margin-top: 10px;\" >City:</label></td>\n");
          out.write("<td style=\"padding: 10px;\"><input type=\"text\" name=\"localcity\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.local_city}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"form-control\" placeholder=\"Enter City\" style=\"width: 250px;margin-left: 75px;\"></td>\n");
          out.write("</tr>\n");
          out.write("<tr>\n");
          out.write("<td style=\"padding: 10px;\" ><label style=\"font-family:  bold; margin-top: 10px;\" >Pincode:</label></td>\n");
          out.write("<td style=\"padding: 10px;\"><input  name=\"localpincode\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.local_pincode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" type=\"text\" class=\"form-control\" placeholder=\"802102\" style=\"width: 250px;margin-left: 75px;\" ></td>\n");
          out.write("</tr>\n");
          out.write("</table>\n");
          out.write("</fieldset>\n");
          out.write("    \n");
          out.write("    <fieldset style=\"margin-top: 30px;\">\n");
          out.write("<legend>Service detail</legend>\n");
          out.write("<table>\n");
          out.write("<tr>\n");
          out.write("<td style=\"padding: 10px;\" ><label style=\"font-family:  bold; margin-top: 10px;\" >Joined in:</label></td>\n");
          out.write("<td style=\"padding: 10px;\"> <input type=\"date\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.s_date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"sdate\" class=\"form-control\" style=\"width: 250px;\"></td> \n");
          out.write(" <tr>\n");
          out.write("<td style=\"padding: 10px;\" ><label style=\"font-family:  bold; margin-top: 10px;\" >Department:</label></td>\n");
          out.write("<td style=\"padding: 10px;\"><input type=\"text\"value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.department}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"department\" class=\"form-control\" style=\"width: 250px;\" > </td>\n");
          out.write(" </tr>\n");
          out.write("  <tr>\n");
          out.write("<td style=\"padding: 10px;\" ><label style=\"font-family:  bold; margin-top: 10px;\" >Joined Post:</label></td>\n");
          out.write("<td style=\"padding: 10px;\"><input type=\"text\" name=\"joinpost\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.join_post}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"form-control\" style=\"width: 250px;\" > </td>\n");
          out.write(" </tr>\n");
          out.write("  <tr>\n");
          out.write("<td style=\"padding: 10px;\" ><label style=\"font-family:  bold; margin-top: 10px;\" >Current Post:</label></td>\n");
          out.write("<td style=\"padding: 10px;\"><input type=\"text\" name=\"currpost\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.curr_post}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"class=\"form-control\" style=\"width: 250px;\" > </td>\n");
          out.write(" </tr>\n");
          out.write("<tr>\n");
          out.write("<td style=\"padding: 10px;\" ><label style=\"font-family:  bold; margin-top: 10px;\" >First Work Place:</label></td>\n");
          out.write("\n");
          out.write("<td style=\"padding: 10px;\"><input type=\"text\" name=\"fwstate\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.fw_state}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"class=\"form-control\" placeholder=\"Enter State\" style=\"width: 250px;\"></td>\n");
          out.write("<td style=\"padding: 10px;\"><input type=\"text\" name=\"fwcity\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.fw_city}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"form-control\" placeholder=\"Enter City\" style=\"width: 250px;\"></td>\n");
          out.write("<td style=\"padding: 10px;\"><input type=\"text\" name=\"fwps\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.fw_ps}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"class=\"form-control\" placeholder=\"Enter Police Station\" style=\"width: 250px;\"></td>\n");
          out.write("</tr>\n");
          out.write("<tr>\n");
          out.write("<td style=\"padding: 10px;\" ><label style=\"font-family:  bold; margin-top: 10px;\" >Current Work Place:</label></td>\n");
          out.write("<td style=\"padding: 10px;\" ><input type=\"text\" name=\"cwstate\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.cw_state}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"form-control\" placeholder=\"Enter State\" style=\"width: 250px;\"></td>\n");
          out.write("<td style=\"padding: 10px;\"><input type=\"text\" name=\"cwcity\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.cw_city}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"class=\"form-control\" placeholder=\"Enter City\" style=\"width: 250px;\" ></td>\n");
          out.write("<td style=\"padding: 10px;\"><input type=\"text\" name=\"cwps\"  value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.cw_ps}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"class=\"form-control\" placeholder=\"Enter Police Station\" style=\"width: 250px;\"></td>\n");
          out.write("</tr>\n");
          out.write("<tr>\n");
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
}
