package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Home</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
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
      out.write("        <style>\n");
      out.write("            .header {\n");
      out.write("                color: #999999;\n");
      out.write("                font-size: 27px;\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bigicon {\n");
      out.write("                font-size: 30px;\n");
      out.write("                color: #666666;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        \n");
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
      out.write("    </head>\n");
      out.write("        <body data-spy='scroll' data-target='.nav' data-offset='50'>\n");
      out.write("        <!-- mobile view -->\n");
      out.write("        <section>\n");
      out.write("            <header class=\" navbar-fixed-top\">\n");
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
      out.write("                            <a class=\"navbar-brand menu  \" style=\"color: black;font-size: large\"> Criminal Record</a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- nav-bar links -->\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"menu\">\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                <li class=\"menu\"><a href=\"#\" style=\"color: black\">About us</a></li>\n");
      out.write("                                <li class=\"menu\"><a href=\"#contact\" style=\"color: black; background: transparent\">Contact us</a></li>\n");
      out.write("                                <li style=\"margin-top: 4%\" class=\"btn btn-success\" ><a style=\"color: whitesmoke;\"  data-toggle=\"modal\" data-target=\"#login\" href=\"\">Get Started</a></li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("        <div class=\"panel-body\"  style=\"background-image: url(Images/effort.jpg); background-size: cover; height: 100%\" >\n");
      out.write("            \n");
      out.write("            \n");
      out.write("       <div  class=\"bottom\" style=\"margin-top:40%\">\n");
      out.write("        <center><a data-toggle=\"modal\" data-target=\"#login\" href=\"\"><button class=\"btn btn-success\" >GET STARTED</button></a></center>\n");
      out.write("\n");
      out.write("        <!-- Modal -->\n");
      out.write("        <div class=\"modal fade\" id=\"login\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("                <!-- Modal content-->\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\" style=\"padding:35px 50px;\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                        <h4><span class=\"glyphicon glyphicon-lock\"></span> Login</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\" style=\"padding:40px 50px;\">\n");
      out.write("                        <form action=\"loginpolice\" method=\"post\" role=\"form\" data-toggle=\"validator\">\n");
      out.write("                            <div class=\"form-group has-feedback\">\n");
      out.write("                                <label for=\"usrname\"><span class=\"glyphicon glyphicon-user\"></span> Username</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" required=\"\" data-error=\"Please Enter Correct Service ID\" name=\"user\" placeholder=\"Enter Service ID\">\n");
      out.write("                                <span class=\"glyphicon form-control-feedback\"></span>\n");
      out.write("                                <div class=\"help-block with-errors\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group has-feedback\">\n");
      out.write("                                <label for=\"psw\"><span class=\"glyphicon glyphicon-eye-open\"></span> Password</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"pass\" data-minlength=\"6\" maxlength=\"15\" required=\"\" data-error=\"Minimum of 6 Characters\" placeholder=\"Enter password\">\n");
      out.write("                                <span class=\"glyphicon form-control-feedback\"></span>\n");
      out.write("                                <div class=\"help-block with-errors\"></div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-success btn-block\"><span class=\"glyphicon glyphicon-off\"></span> Login</button>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                        <!-- Incorrect Username and Password error message start -->\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <!-- Incorrect Username and Password error message end--> \n");
      out.write("\n");
      out.write("\n");
      out.write("                        <!-- Session expire error message start -->\n");
      out.write("                        \n");
      out.write("                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        <!-- Session expire error message end -->\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-danger btn-default pull-left\" data-dismiss=\"modal\"><span class=\"glyphicon glyphicon-remove\"></span> Cancel</button>\n");
      out.write("                        <p>Not a member? <a href=\"policeregistration.html\">Sign Up</a></p>\n");
      out.write("                        <p><a href=\"#\" data-toggle=\"modal\" data-target=\"#forgotpass\" data-dismiss=\"modal\">Forgot Password?</a></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- login modal end -->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("        <!--Registration success Modal start -->\n");
      out.write("\n");
      out.write("<div style=\"top: 30%\" class=\"modal fade\" id=\"registersuccess\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("        <!-- Modal content-->\n");
      out.write("\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                <h4 class=\"modal-title\">Registration Successful</h4>\n");
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
      out.write("<!-- registration success modal end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--Registration fail Modal start -->\n");
      out.write("\n");
      out.write("<div style=\"top: 30%\" class=\"modal fade\" id=\"registerfail\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("        <!-- Modal content-->\n");
      out.write("\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                <h4 class=\"modal-title\">Registration Failed</h4>\n");
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
      out.write("     <!-- forgot password modal start -->\n");
      out.write("\n");
      out.write("<div class=\"modal fade\" id=\"forgotpass\" role=\"dialog\" style=\"margin-top: 5%\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("        <!-- Modal content-->\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\" style=\"padding:35px 50px;\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                <h4><span class=\"glyphicon glyphicon-lock\"></span> Forget Password</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\" style=\"padding:40px 50px;\">\n");
      out.write("\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <form action=\"mail\" method=\"post\" role=\"form\" data-toggle=\"validator\">\n");
      out.write("                        <div class=\"form-group has-feedback\">\n");
      out.write("                            <input type=\"email\" name=\"user\" required=\"\" data-error=\"Please Enter Your Username\" class=\"form-control input-sm\" placeholder=\"Email Address\">\n");
      out.write("                            <span class=\"glyphicon form-control-feedback\"></span>\n");
      out.write("                            <div class=\"help-block with-errors\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"submit\" value=\"Submit\" class=\"btn btn-info btn-block\">\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    <!-- server side validation for forgot password start-->\n");
      out.write("                    \n");
      out.write("                    ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    <!-- server side validation for forgot password end-->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- forgot password modal end  -->\n");
      out.write("\n");
      out.write("\n");
      out.write("       \n");
      out.write("         \n");
      out.write("<!-- registration fail modal end -->\n");
      out.write("\n");
      out.write(" <!--registration unsuccessful error message start -->\n");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!--registration unsuccessful error message end -->\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <!--registration successful message start -->\n");
      out.write("                    \n");
      out.write("                    ");
      if (_jspx_meth_c_if_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    <!--registration successful  message end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.error ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("    \n");
        out.write("                            <script>\n");
        out.write("                                $(document).ready(function() {\n");
        out.write("                                    $(\"#login\").modal();\n");
        out.write("\n");
        out.write("                                });\n");
        out.write("                            </script>\n");
        out.write("                            <div class=\"alert-danger\"><h2>Incorrect Username And Password</h2></div>\n");
        out.write("\n");
        out.write("                        ");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.expire ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("    \n");
        out.write("                            <script>\n");
        out.write("                                $(document).ready(function() {\n");
        out.write("                                    $(\"#login\").modal();\n");
        out.write("\n");
        out.write("                                });\n");
        out.write("                            </script>\n");
        out.write("                         <div class=\"alert-danger\"><h2>Session Expire Login Again.. </h2></div>\n");
        out.write("                        ");
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

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.emailnull ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("    \n");
        out.write("                        <script>\n");
        out.write("                            $(document).ready(function() {\n");
        out.write("                                $(\"#forgotpass\").modal();\n");
        out.write("\n");
        out.write("                            });\n");
        out.write("                        </script>\n");
        out.write("                        <div class=\"alert-danger\"><h2>Please Enter Username First..</h2></div>\n");
        out.write("\n");
        out.write("                    ");
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

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.invalid ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("    \n");
        out.write("                        <script>\n");
        out.write("                            $(document).ready(function() {\n");
        out.write("                                $(\"#forgotpass\").modal();\n");
        out.write("\n");
        out.write("                            });\n");
        out.write("                        </script>\n");
        out.write("                        <div class=\"alert-danger\"><h2>Email Id Not Valid</h2></div>\n");
        out.write("\n");
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
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.valid ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("    \n");
        out.write("                        <script>\n");
        out.write("                            $(document).ready(function() {\n");
        out.write("                                $(\"#forgotpass\").modal();\n");
        out.write("\n");
        out.write("                            });\n");
        out.write("                        </script>\n");
        out.write("                        <div class=\"alert-danger\"><h2>Password is send to your email</h2></div>\n");
        out.write("\n");
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

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.failreg ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("    \n");
        out.write("                        <script>\n");
        out.write("                            $(document).ready(function() {\n");
        out.write("                                $(\"#registerfail\").modal();\n");
        out.write("\n");
        out.write("                            });\n");
        out.write("                        </script>\n");
        out.write("                        \n");
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

  private boolean _jspx_meth_c_if_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent(null);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.successreg ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("    \n");
        out.write("                        <script>\n");
        out.write("                            $(document).ready(function() {\n");
        out.write("                                $(\"#registersuccess\").modal();\n");
        out.write("\n");
        out.write("                            });\n");
        out.write("                        </script>\n");
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
}
