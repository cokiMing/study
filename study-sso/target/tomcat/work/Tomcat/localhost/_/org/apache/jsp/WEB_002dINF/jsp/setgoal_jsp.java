/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-03-31 10:19:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class setgoal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"/css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\" />\r\n");
      out.write("<link href=\"/css/bootstrap-responsive.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"/css/loginextends.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery-1.8.2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/bootstrap.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/common.js\"></script>\r\n");
      out.write("<title>Set Your Goal!</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".tablesize{\r\n");
      out.write("   margin-top:100px;\r\n");
      out.write("   width: 500px !important;\r\n");
      out.write("   background-image: url(\"/img/bgpic.jpg\");\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\r\n");
      out.write("  <form id=\"goalform\">\r\n");
      out.write("    <table class=\"table tablesize table-bordered\" align=\"center\">\r\n");
      out.write("    <thead>\r\n");
      out.write("       <tr><th>SET YOUR GOAL</th></tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("       <tr>\r\n");
      out.write("         <td>I plan to study&nbsp;\r\n");
      out.write("         <input type=\"text\" placeholder=\"?\" style=\"max-width: 50px\" name=\"dhour\" value=\"3\" id=\"dhourid\">&nbsp;\r\n");
      out.write("          hours everyday</td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("         <td>I plan to study &nbsp;\r\n");
      out.write("         <input type=\"text\" placeholder=\"?\" style=\"max-width: 50px\" name=\"whour\" value=\"21\" id=\"whourid\">&nbsp; \r\n");
      out.write("         hours everyweek</td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("         <td>I plan to study &nbsp;\r\n");
      out.write("         <input type=\"text\" placeholder=\"?\" style=\"max-width: 50px\" name=\"mhour\" value=\"90\" id=\"mhourid\">&nbsp; \r\n");
      out.write("         hours everymonth</td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr><td><button class=\"btn btn-large\" id=\"goalSubmit\">Submit</button></td></tr>\r\n");
      out.write("    </table>\r\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "commonwindows.jsp", out, false);
      out.write("\t\r\n");
      out.write("\t</form>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write(" var GOALFORM = {\r\n");
      out.write("\t\t formcheck: function(){\r\n");
      out.write("\t\t\t if($(\"#dhourid\").val()==\"\"){\r\n");
      out.write("\t\t\t\t var html=\"<p style='font-size: 20px !important;'>day hour can't be null!</p>\";\r\n");
      out.write("\t\t\t\t   $('.modal-body').html(html);\r\n");
      out.write("\t\t\t\t   $('#myModal').modal('show');\r\n");
      out.write("\t\t\t\t return false;\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t\t if($(\"#whourid\").val()==\"\"){\r\n");
      out.write("\t\t\t\t var html=\"<p style='font-size: 20px !important;'>week hour can't be null!</p>\";\r\n");
      out.write("\t\t\t\t   $('.modal-body').html(html);\r\n");
      out.write("\t\t\t\t   $('#myModal').modal('show');\r\n");
      out.write("\t\t\t\t return false;\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t\t if($(\"#mhourid\").val()==\"\"){\r\n");
      out.write("\t\t\t\t var html=\"<p style='font-size: 20px !important;'>month hour can't be null!</p>\";\r\n");
      out.write("\t\t\t\t   $('.modal-body').html(html);\r\n");
      out.write("\t\t\t\t   $('#myModal').modal('show');\r\n");
      out.write("\t\t\t\t return false;\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t\t return true;\r\n");
      out.write("\t\t },\r\n");
      out.write("         setGoal:function(){\r\n");
      out.write("        \t $.post(\"/sso/setgoal\",$(\"#goalform\").serialize(),function(data){\r\n");
      out.write("        \t\t if(data.status==200){\r\n");
      out.write("        \t\t\t var html=\"<p style='font-size: 20px !important;'>Login Success!</p>\";\r\n");
      out.write("\t\t\t\t\t   $('.modal-body').html(html);\r\n");
      out.write("\t\t\t\t\t   $('#myModalLabel').text(\"Success!\");\r\n");
      out.write("\t\t\t\t\t   $('#myModal').modal('show');\r\n");
      out.write("        \t\t }\r\n");
      out.write("        \t\t if(data.status==400){\r\n");
      out.write("        \t\t\t var html=\"<p style='font-size: 20px !important;'>\"+data.msg+\"</p>\"\r\n");
      out.write("\t\t\t\t\t   $('.modal-body').html(html);\r\n");
      out.write("\t\t\t\t\t   $('#myModalLabel').text(\"Login Failed!\");\r\n");
      out.write("\t\t\t\t\t   $('#myModal').modal('toggle');\r\n");
      out.write("        \t\t }\r\n");
      out.write("        \t });\r\n");
      out.write("         },\r\n");
      out.write("\t\t doSubmit:function(){\r\n");
      out.write("\t\t\t if(this.formcheck()){\r\n");
      out.write("\t\t\t\t this.setGoal();\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t }\r\n");
      out.write(" }\r\n");
      out.write("   $(\"#goalSubmit\").click(function(){\r\n");
      out.write("\t   GOALFORM.doSubmit();\r\n");
      out.write("   });\r\n");
      out.write("\r\n");
      out.write("\r\n");
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