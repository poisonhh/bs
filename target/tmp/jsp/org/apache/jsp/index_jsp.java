/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.8.v20150217
 * Generated at: 2017-05-13 06:46:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/E:/maven/maven-dependcies/jstl/jstl/1.2/jstl-1.2.jar!/META-INF/c-1_0-rt.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("jar:file:/E:/maven/maven-dependcies/jstl/jstl/1.2/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("file:/E:/maven/maven-dependcies/jstl/jstl/1.2/jstl-1.2.jar", Long.valueOf(1491484563635L));
  }

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>汽车租赁系统</title>\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write(" <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/js/jquery.js\"></script>\r\n");
      out.write(" <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/js/scrollpic-pack.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, true);
      out.write("\r\n");
      out.write("<br />\r\n");
      out.write("<table width=\"1004\" style=\"margin-top:1px;\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"752\" height=\"415\" valign=\"top\" align=\"center\">\r\n");
      out.write("    \r\n");
      out.write("<table width=\"750\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#CCCCCC\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"239\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t<!-- 焦点图 begin -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"FocusPic\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"FP_arr_left\" id=\"FS_arr_left_01\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"FP_arr_right\" id=\"FS_arr_right_01\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"FP_cont\" id=\"FS_Cont_01\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"FP_pic\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div><img src=\"images/1.jpg\" galleryImg=\"no\" alt=\"\"  /></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"FP_pic\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div><img src=\"images/2.jpg\" galleryImg=\"no\" alt=\"\" /></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"FP_pic\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div><img src=\"images/3.jpg\" galleryImg=\"no\" alt=\"\" /></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"FP_pic\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div><img src=\"images/4.jpg\" galleryImg=\"no\" alt=\"\" /></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t<!--//--><![CDATA[//><!--\r\n");
      out.write("\t\t\t\t\tvar focusScroll_01 = new ScrollPic();\r\n");
      out.write("\t\t\t\t\tfocusScroll_01.scrollContId   = \"FS_Cont_01\"; //内容容器ID\r\n");
      out.write("\t\t\t\t\tfocusScroll_01.arrLeftId      = \"FS_arr_right_01\";//左箭头ID\r\n");
      out.write("\t\t\t\t\tfocusScroll_01.arrRightId     = \"FS_arr_left_01\"; //右箭头ID\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tfocusScroll_01.frameWidth     = 750;//显示框宽度\r\n");
      out.write("\t\t\t\t\tfocusScroll_01.pageWidth      =  750; //翻页宽度\r\n");
      out.write("\t\t\t\t\tfocusScroll_01.upright        = false; //垂直滚动\r\n");
      out.write("\t\t\t\t\tfocusScroll_01.speed          = 10; //移动速度(单位毫秒，越小越快)\r\n");
      out.write("\t\t\t\t\tfocusScroll_01.space          = 30; //每次移动像素(单位px，越大越快)\r\n");
      out.write("\t\t\t\t\tfocusScroll_01.autoPlay       = true; //自动播放\r\n");
      out.write("\t\t\t\t\tfocusScroll_01.autoPlayTime   = 2; //自动播放间隔时间(秒)\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tfocusScroll_01.initialize(); //初始化\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t//--><!]]>\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t<!-- 焦点图 end -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"246\" valign=\"top\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("        \r\n");
      out.write("     \t\r\n");
      out.write("\t\t\t <div id=\"info\"></div>\r\n");
      out.write("  <script>\r\n");
      out.write("  \r\n");
      out.write("  function GetInfo(){\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl:\"goods_ajax?time\"+new Date().toString(),\r\n");
      out.write("\t\ttype:'GET',\r\n");
      out.write("\t\tsuccess:function(){\r\n");
      out.write("\t\t\t$('#info').html(arguments[0]);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("  GetInfo();\r\n");
      out.write("  </script>\r\n");
      out.write("     \r\n");
      out.write("        \r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("      \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    </td>\r\n");
      out.write("    <td width=\"252\" valign=\"top\">\r\n");
      out.write("\t ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "right.jsp", out, true);
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "foot.jsp", out, true);
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
