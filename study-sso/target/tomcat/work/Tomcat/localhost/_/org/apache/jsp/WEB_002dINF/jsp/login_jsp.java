/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-03-31 13:14:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<link href=\"/css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\" />\r\n");
      out.write("<link href=\"/css/bootstrap-responsive.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"/css/loginextends.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery-1.8.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/common.js\"></script>\r\n");
      out.write("<title>登录到爱学网</title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container indexbg\">\r\n");
      out.write("    <div class=\"row corner\">\r\n");
      out.write("    <div class=\"span12\" style=\"height: 180px\">\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("       <div class=\"row\">\r\n");
      out.write("\t\t<div class=\"span2\"></div>\r\n");
      out.write("\t\t<div class=\"span5 offset9\">\r\n");
      out.write("\t\t<form id=\"formLogin\">\t\r\n");
      out.write("\t\t\t<table class=\"table table-bordered\">\r\n");
      out.write("\t\t\t\t<thead >\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th colspan=\"2\">Login to LoveStudy</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tbody class=\"mainbody\">\r\n");
      out.write("\t\t\t\t     <tr>\r\n");
      out.write("\t\t\t\t     <td style=\"width:120px\" class=\"no-part-border123\">ACCOUNT</td>\r\n");
      out.write("\t\t\t\t     <td class=\"no-part-border341\">\r\n");
      out.write("\t\t\t\t     <input type=\"text\" name=\"name\" id=\"nameid\" \r\n");
      out.write("\t\t\t\t     data-toggle=\"popover\" data-title=\"LOOK HEAR!\" data-content=\"username can't be null!\"\r\n");
      out.write("\t\t\t\t     placeholder=\"Type Your Account\"/>\r\n");
      out.write("\t\t\t\t     </td>\r\n");
      out.write("\t\t\t\t     </tr>\r\n");
      out.write("\t\t\t\t     <tr>\r\n");
      out.write("\t\t\t\t     <td style=\"width:120px\" class=\"no-part-border12\">PASSWORD</td>\r\n");
      out.write("\t\t\t\t     <td class=\"no-part-border41\">\r\n");
      out.write("\t\t\t\t     <input type=\"password\" name=\"password\" id=\"passwordid\" placeholder=\"Type Your Password\"/>\r\n");
      out.write("\t\t\t\t     </td>\r\n");
      out.write("\t\t\t\t     </tr>\r\n");
      out.write("\t\t\t\t     <tr><td colspan=\"2\" class=\"no-part-border123\" style=\"text-align: left !important\"  >\r\n");
      out.write("\t\t\t\t     <input type=\"checkbox\" checked=\"checked\" name=\"remember\" value=\"1\"\r\n");
      out.write("\t\t\t\t     data-toggle=\"tooltip\"  data-placement=\"left\"  data-trigger=\"hover\" title=\"please don't check this option in public occations\"/>\r\n");
      out.write("\t\t\t\t     <font >&nbsp;&nbsp;Remember me in 3 days</font></td></tr>\r\n");
      out.write("\t\t\t\t     <tr>\r\n");
      out.write("\t\t\t\t      <td colspan=\"2\">\r\n");
      out.write("\t\t\t\t        <button class=\"btn btn-primary btn-large no-part-border4\"\r\n");
      out.write("\t\t\t\t          type=\"button\" style=\"width: 200px\" id=\"login\">Login</button>\r\n");
      out.write("\t\t\t\t        <a>register now!</a>  \r\n");
      out.write("\t\t\t\t      </td>\r\n");
      out.write("\t\t\t\t     </tr>\t\t\t\t     \r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"span5\">\r\n");
      out.write("\t\t  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "commonwindows.jsp", out, false);
      out.write("\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("   var LOGIN = {\r\n");
      out.write("\t\t   logincheck:function(){\r\n");
      out.write("\t\t\t   var html = \" <p style='font-size: 20px !important;'>Account or password is Null!</p>\";\r\n");
      out.write("\t\t\t   if($(\"#nameid\").val()==\"\" || $(\"#passwordid\").val()==\"\"){\r\n");
      out.write("\t\t\t\t   $('.modal-body').html(html);\r\n");
      out.write("\t\t\t\t   $('#myModal').modal('show');\r\n");
      out.write("\t\t\t\t   return false;\r\n");
      out.write("\t\t\t   }\r\n");
      out.write("\t\t\t   return true;\r\n");
      out.write("\t\t   },\r\n");
      out.write("\t\t   login:function(){\r\n");
      out.write("\t\t\t   $.post(\"/sso/login\",$(\"#formLogin\").serialize(),function(data){\r\n");
      out.write("\t\t\t\t   if(data.status == 200){\r\n");
      out.write("\t\t\t\t\t   var html=\"<p style='font-size: 20px !important;'>Login Success!</p>\";\r\n");
      out.write("\t\t\t\t\t   $('.modal-body').html(html);\r\n");
      out.write("\t\t\t\t\t   $('#myModalLabel').text(\"Success!\");\r\n");
      out.write("\t\t\t\t\t   $('#myModal').modal('show');\r\n");
      out.write("\t\t\t\t\t   location.href = \"/sso/goal\";\r\n");
      out.write("\t\t\t\t   }\r\n");
      out.write("\t\t\t\t   if(data.status == 400){\r\n");
      out.write("\t\t\t\t\t   var html=\"<p style='font-size: 20px !important;'>\"+data.msg+\"</p>\"\r\n");
      out.write("\t\t\t\t\t   $('.modal-body').html(html);\r\n");
      out.write("\t\t\t\t\t   $('#myModalLabel').text(\"Login Failed!\");\r\n");
      out.write("\t\t\t\t\t   $('#myModal').modal('show');\r\n");
      out.write("\t\t\t\t   }\r\n");
      out.write("\t\t\t   });\r\n");
      out.write("\t\t   }\r\n");
      out.write("   }\r\n");
      out.write("   $(function(){\r\n");
      out.write("\t   if(getCookie('token')!=null){\r\n");
      out.write("\t\t   var html=\"<p style='font-size: 20px !important;'>Login Success!</p>\";\r\n");
      out.write("\t\t   $('.modal-body').html(html);\r\n");
      out.write("\t\t   $('#myModalLabel').text(\"Login..Please Wait\");\r\n");
      out.write("\t\t   $('#myModal').modal('show');\r\n");
      out.write("\t\t   sleep(2000);\r\n");
      out.write("\t\t   location.href = \"/sso/goal\";\r\n");
      out.write("\t   }\r\n");
      out.write("\t   $(\"#login\").click(function(){\r\n");
      out.write("\t\t   if(LOGIN.logincheck()){\t\t   \r\n");
      out.write("\t\t      LOGIN.login();\r\n");
      out.write("\t\t   }\r\n");
      out.write("\t   });\r\n");
      out.write("\t   window.onkeydown=function(){\r\n");
      out.write("\t　　 if(13 == event.keyCode){\r\n");
      out.write("\t\t   if(LOGIN.logincheck()){\t\t   \r\n");
      out.write("\t\t       LOGIN.login();\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t　　   }\r\n");
      out.write("\t　　} \r\n");
      out.write("   });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
