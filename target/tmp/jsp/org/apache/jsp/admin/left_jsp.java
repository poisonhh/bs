/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.8.v20150217
 * Generated at: 2017-05-13 06:49:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class left_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");

      String path = request.getContextPath();
      String basePath = request.getScheme() + "://"
                  + request.getServerName() + ":" + request.getServerPort()
                  + path + "/";

      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" >\r\n");
      out.write("<head runat=\"server\">\r\n");
      out.write("    <title>无标题页</title>\r\n");
      out.write("    <link href=\"Images/css1/left_css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <SCRIPT language=JavaScript>\r\n");
      out.write("function showsubmenu(sid)\r\n");
      out.write("{\r\n");
      out.write("whichEl = eval(\"submenu\" + sid);\r\n");
      out.write("if (whichEl.style.display == \"none\")\r\n");
      out.write("{\r\n");
      out.write("eval(\"submenu\" + sid + \".style.display=\\\"\\\";\");\r\n");
      out.write("}\r\n");
      out.write("else\r\n");
      out.write("{\r\n");
      out.write("eval(\"submenu\" + sid + \".style.display=\\\"none\\\";\");\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("</head>\r\n");
      out.write("<body  bgcolor=\"16ACFF\">\r\n");
      out.write("    <form id=\"form1\" runat=\"server\">\r\n");
      out.write("    <div>\r\n");
      out.write("    <table width=\"98%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" background=\"../admin/Images/tablemde.jpg\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"5\" background=\"../admin/Images/tableline_top.jpg\" bgcolor=\"#16ACFF\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><TABLE width=\"97%\" \r\n");
      out.write("border=0 align=right cellPadding=0 cellSpacing=0 class=leftframetable>\r\n");
      out.write("      <TBODY>\r\n");
      out.write("       \r\n");
      out.write("      ");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD height=\"25\" style=\"background:url(../admin/Images/left_tt.gif) no-repeat\">\r\n");
      out.write("            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <TD width=\"20\"></TD>\r\n");
      out.write("          <TD class=STYLE1 style=\"CURSOR: hand\" onclick=showsubmenu(1); height=25>用户管理</TD>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("          </TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD><TABLE id=submenu1 cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("              <TBODY>\r\n");
      out.write("                <TR>\r\n");
      out.write("                  <TD width=\"2%\"><IMG src=\"../admin/Images/closed.gif\"></TD>\r\n");
      out.write("                  <TD height=23><A href=\"adminadd_admin\" \r\n");
      out.write("            target=main>录入管理员</A></TD>\r\n");
      out.write("                </TR>\r\n");
      out.write("                <TR>\r\n");
      out.write("                  <TD><IMG src=\"../admin/Images/closed.gif\"></TD>\r\n");
      out.write("                  <TD height=23><A href=\"adminlist_admin\" \r\n");
      out.write("            target=main>管理员维护</A></TD>\r\n");
      out.write("                </TR>\r\n");
      out.write("         \r\n");
      out.write("                   <TR>\r\n");
      out.write("                  <TD><IMG src=\"../admin/Images/closed.gif\"></TD>\r\n");
      out.write("                  <TD height=23><A href=\"memberslist_admin\" \r\n");
      out.write("            target=main>用户管理</A></TD>\r\n");
      out.write("                </TR>\r\n");
      out.write("         \r\n");
      out.write("       \r\n");
      out.write("           \r\n");
      out.write("              </TBODY>\r\n");
      out.write("          </TABLE></TD>\r\n");
      out.write("        </TR>\r\n");
      out.write("      </TBODY>\r\n");
      out.write("    </TABLE></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td height=\"5\" background=\"../admin/Images/tableline_bottom.jpg\" bgcolor=\"#9BC2ED\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"5\" background=\"../admin/Images/tableline_top.jpg\" bgcolor=\"#9BC2ED\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><TABLE class=leftframetable cellSpacing=0 cellPadding=0 width=\"97%\" align=right \r\n");
      out.write("border=0>\r\n");
      out.write("      <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD height=\"25\" style=\"background:url(../admin/Images/left_tt.gif) no-repeat\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <TD width=\"20\"></TD>\r\n");
      out.write("          <TD class=STYLE1 style=\"CURSOR: hand\" onclick=showsubmenu(4); \r\n");
      out.write("    height=25>新闻管理</TD>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </table></TD>\r\n");
      out.write("          </TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD><TABLE id=submenu4 cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("              <TBODY>\r\n");
      out.write("                      <TR>\r\n");
      out.write("                  <TD width=\"2%\"><IMG src=\"../admin/Images/closed.gif\"></TD>\r\n");
      out.write("                  <TD height=23><A href=\"newsadd_admin\" \r\n");
      out.write("            target=main>添加新闻</A> </TD>\r\n");
      out.write("                </TR>\r\n");
      out.write("                   \r\n");
      out.write("                     <TR>\r\n");
      out.write("                  <TD width=\"2%\"><IMG src=\"../admin/Images/closed.gif\"></TD>\r\n");
      out.write("                  <TD height=23><A href=\"newslist_admin\" \r\n");
      out.write("            target=main>新闻管理</A> </TD>\r\n");
      out.write("                </TR>\r\n");
      out.write("              \r\n");
      out.write("              </TBODY>\r\n");
      out.write("          </TABLE></TD>\r\n");
      out.write("        </TR>\r\n");
      out.write("      </TBODY>\r\n");
      out.write("    </TABLE></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"5\" background=\"../admin/Images/tableline_bottom.jpg\" bgcolor=\"#9BC2ED\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write(" \r\n");
      out.write("  \r\n");
      out.write("      <tr>\r\n");
      out.write("    <td height=\"5\" background=\"../admin/Images/tableline_top.jpg\" bgcolor=\"#9BC2ED\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><TABLE class=leftframetable cellSpacing=0 cellPadding=0 width=\"97%\" align=right \r\n");
      out.write("border=0>\r\n");
      out.write("      <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD height=\"25\" style=\"background:url(../admin/Images/left_tt.gif) no-repeat\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <TD width=\"20\"></TD>\r\n");
      out.write("          <TD class=STYLE1 style=\"CURSOR: hand\" onclick=showsubmenu(5); \r\n");
      out.write("    height=25>车辆管理</TD>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </table></TD>\r\n");
      out.write("          </TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD><TABLE id=submenu5 cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("              <TBODY>\r\n");
      out.write("                      <TR>\r\n");
      out.write("                  <TD width=\"2%\"><IMG src=\"../admin/Images/closed.gif\"></TD>\r\n");
      out.write("                  <TD height=23><A href=\"caradd_admin\" \r\n");
      out.write("            target=main>车辆录入</A> </TD>\r\n");
      out.write("                </TR>\r\n");
      out.write("                   \r\n");
      out.write("                     <TR>\r\n");
      out.write("                  <TD width=\"2%\"><IMG src=\"../admin/Images/closed.gif\"></TD>\r\n");
      out.write("                  <TD height=23><A href=\"carlist_admin\" \r\n");
      out.write("            target=main>车辆管理</A> </TD>\r\n");
      out.write("                </TR>\r\n");
      out.write("                \r\n");
      out.write("                 <TR>\r\n");
      out.write("                  <TD width=\"2%\"><IMG src=\"../admin/Images/closed.gif\"></TD>\r\n");
      out.write("                  <TD height=23><A href=\"goodsadd_admin\" \r\n");
      out.write("            target=main>商品添加</A> </TD>\r\n");
      out.write("                </TR>\r\n");
      out.write("                \r\n");
      out.write("                <TR>\r\n");
      out.write("                  <TD width=\"2%\"><IMG src=\"../admin/Images/closed.gif\"></TD>\r\n");
      out.write("                  <TD height=23><A href=\"goodslist_admin\" \r\n");
      out.write("            target=main>商品管理</A> </TD>\r\n");
      out.write("                </TR>        \r\n");
      out.write("              \r\n");
      out.write("              </TBODY>\r\n");
      out.write("          </TABLE></TD>\r\n");
      out.write("        </TR>\r\n");
      out.write("      </TBODY>\r\n");
      out.write("    </TABLE></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"5\" background=\"../admin/Images/tableline_bottom.jpg\" bgcolor=\"#9BC2ED\"></td>\r\n");
      out.write("  </tr>            \r\n");
      out.write("            \r\n");
      out.write("          <tr>\r\n");
      out.write("    <td height=\"5\" background=\"../admin/Images/tableline_top.jpg\" bgcolor=\"#9BC2ED\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><TABLE class=leftframetable cellSpacing=0 cellPadding=0 width=\"97%\" align=right \r\n");
      out.write("border=0>\r\n");
      out.write("      <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD height=\"25\" style=\"background:url(../admin/Images/left_tt.gif) no-repeat\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <TD width=\"20\"></TD>\r\n");
      out.write("          <TD class=STYLE1 style=\"CURSOR: hand\" onclick=showsubmenu(6); \r\n");
      out.write("    height=25>订单管理</TD>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </table></TD>\r\n");
      out.write("          </TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD><TABLE id=submenu6 cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("              <TBODY>\r\n");
      out.write("                            \r\n");
      out.write("                     <TR>\r\n");
      out.write("                  <TD width=\"2%\"><IMG src=\"../admin/Images/closed.gif\"></TD>\r\n");
      out.write("                  <TD height=23><A href=\"oderslist_admin\" \r\n");
      out.write("            target=main>订单管理</A> </TD>\r\n");
      out.write("                </TR>\r\n");
      out.write("              \r\n");
      out.write("              </TBODY>\r\n");
      out.write("          </TABLE></TD>\r\n");
      out.write("        </TR>\r\n");
      out.write("      </TBODY>\r\n");
      out.write("    </TABLE></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"5\" background=\"../admin/Images/tableline_bottom.jpg\" bgcolor=\"#9BC2ED\"></td>\r\n");
      out.write("  </tr>         \r\n");
      out.write("            \r\n");
      out.write("           <tr>\r\n");
      out.write("    <td height=\"5\" background=\"../admin/Images/tableline_top.jpg\" bgcolor=\"#9BC2ED\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><TABLE class=leftframetable cellSpacing=0 cellPadding=0 width=\"97%\" align=right \r\n");
      out.write("border=0>\r\n");
      out.write("      <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD height=\"25\" style=\"background:url(../admin/Images/left_tt.gif) no-repeat\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <TD width=\"20\"></TD>\r\n");
      out.write("          <TD class=STYLE1 style=\"CURSOR: hand\" onclick=showsubmenu(7); \r\n");
      out.write("    height=25>栏目管理</TD>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </table></TD>\r\n");
      out.write("          </TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD><TABLE id=submenu7 cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("              <TBODY>\r\n");
      out.write("                      <TR>\r\n");
      out.write("                  <TD width=\"2%\"><IMG src=\"../admin/Images/closed.gif\"></TD>\r\n");
      out.write("                  <TD height=23><A href=\"abouttoupdate_admin/2\" \r\n");
      out.write("            target=main>联系我们</A> </TD>\r\n");
      out.write("                </TR>\r\n");
      out.write("                   \r\n");
      out.write("                     <TR>\r\n");
      out.write("                  <TD width=\"2%\"><IMG src=\"../admin/Images/closed.gif\"></TD>\r\n");
      out.write("                  <TD height=23><A href=\"abouttoupdate_admin/1\" \r\n");
      out.write("            target=main>关于我们</A> </TD>\r\n");
      out.write("                </TR>\r\n");
      out.write("              \r\n");
      out.write("              </TBODY>\r\n");
      out.write("          </TABLE></TD>\r\n");
      out.write("        </TR>\r\n");
      out.write("      </TBODY>\r\n");
      out.write("    </TABLE></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"5\" background=\"../admin/Images/tableline_bottom.jpg\" bgcolor=\"#9BC2ED\"></td>\r\n");
      out.write("  </tr>         \r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                            \r\n");
      out.write("             \r\n");
      out.write("      </TBODY>\r\n");
      out.write("    </TABLE></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"5\" background=\"../admin/Images/tableline_bottom.jpg\" bgcolor=\"#9BC2ED\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("    </div>\r\n");
      out.write("    </form>\r\n");
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
