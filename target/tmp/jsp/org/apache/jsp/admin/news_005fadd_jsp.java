/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.8.v20150217
 * Generated at: 2017-05-13 06:50:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class news_005fadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("  <!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" >\r\n");
      out.write("<head >\r\n");
      out.write("    <title>无标题页</title>\r\n");
      out.write("    <link href=\"../admin/Images/css1/css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../js/jquery.js\"></script>\r\n");
      out.write("       <script type=\"text/javascript\" src=\"../xheditor/jquery-1.3.2.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../xheditor/common.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("<script type=\"text/javascript\" charset=\"gbk\" src=\"../xheditor/xheditor.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("\tfunction checkmadd(){\r\n");
      out.write("\t\tvar title = $(\"#title\").attr(\"value\");\r\n");
      out.write("\t\tif(title.length == 0){\r\n");
      out.write("\t\t\talert('题目不能为空');\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div>\r\n");
      out.write("\r\n");
      out.write("\t\t<table class=\"table\" cellspacing=\"1\" cellpadding=\"2\" width=\"99%\"\r\n");
      out.write("\t\t\talign=\"center\" border=\"0\">\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th class=\"bg_tr\" align=\"left\" height=\"25\">新闻添加</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td height=\"23\" align=\"center\" class=\"td_bg\"><p>&nbsp;</p>\r\n");
      out.write("\t\t\t\t\t\t<form action=\"newsadd_admin\" method=\"post\"\r\n");
      out.write("\t\t\t\t\t\t\tonsubmit=\"return checkmadd();\">\r\n");
      out.write("\t\t\t\t\t\t\t<table width=\"700\" border=\"0\" cellpadding=\"1\" cellspacing=\"1\"\r\n");
      out.write("\t\t\t\t\t\t\t\tbgcolor=\"#E4F1FA\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"133\" height=\"40\" align=\"right\" bgcolor=\"#FFFFFF\">名称：</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"460\" align=\"left\" bgcolor=\"#FFFFFF\"><label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"title\" id=\"title\" class=\"inputcss\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</label></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"133\" height=\"40\" align=\"right\" bgcolor=\"#FFFFFF\">内容：</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"460\" align=\"left\" bgcolor=\"#FFFFFF\"><label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(pageInit);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar editor;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction pageInit() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('#content')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.xheditor(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttrue,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttools : 'GStart,GEnd,Cut,Copy,Paste,Pastetext,Blocktag,Fontface,FontSize,Bold,Italic,Underline,Strikethrough,FontColor,BackColor,Removeformat,Align,List,Outdent,Indent,Link,Unlink,Emot,Media,Source,Img,GEnd'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\teditor = $('#content')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.xheditor(true)[0].xheditor;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</script> <textarea name=\"content\" id=\"content\" rows=\"50\" cols=\"70\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"height: 250px;\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</label></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td height=\"40\" align=\"right\" bgcolor=\"#FFFFFF\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td bgcolor=\"#FFFFFF\"><label> <input type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"Submit\" value=\"提交\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</label></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t<p>&nbsp;</p></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}