/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.8.v20150217
 * Generated at: 2017-05-13 06:50:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class car_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" >\r\n");
      out.write("<head runat=\"server\">\r\n");
      out.write("    <title>无标题页</title>\r\n");
      out.write("    <link href=\"../admin/Images/css1/css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <form id=\"form1\" runat=\"server\">\r\n");
      out.write("    <div>\r\n");
      out.write("   \r\n");
      out.write("<table class=\"table\" cellspacing=\"1\" cellpadding=\"2\" width=\"99%\" align=\"center\" \r\n");
      out.write("border=\"0\">\r\n");
      out.write("  <tbody>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th class=\"bg_tr\" align=\"left\" height=\"25\">车辆管理列表</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"23\" align=\"center\" class=\"td_bg\"><p>&nbsp;</p>\r\n");
      out.write("      <table width=\"98%\" border=\"0\" cellpadding=\"1\" cellspacing=\"1\" bgcolor=\"#3498DA\" >\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td width=\"76\" align=\"center\" bgcolor=\"#FFFFFF\">ID</td>\r\n");
      out.write("          <td width=\"216\" align=\"center\" bgcolor=\"#FFFFFF\">颜色</td>\r\n");
      out.write("          <td width=\"149\" align=\"center\" bgcolor=\"#FFFFFF\">品牌</td>\r\n");
      out.write("          <td width=\"216\" align=\"center\" bgcolor=\"#FFFFFF\">类型</td>\r\n");
      out.write("          <td width=\"149\" align=\"center\" bgcolor=\"#FFFFFF\">车牌号</td>\r\n");
      out.write("          <td width=\"216\" align=\"center\" bgcolor=\"#FFFFFF\">购入时间</td>\r\n");
      out.write("          <td width=\"149\" align=\"center\" bgcolor=\"#FFFFFF\">描述</td>\r\n");
      out.write("          <td width=\"149\" align=\"center\" bgcolor=\"#FFFFFF\">操作</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      </table>      \r\n");
      out.write("      <p>&nbsp;</p></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("  </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /admin/car_list.jsp(33,2) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${carList}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
    // /admin/car_list.jsp(33,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("obj");
    // /admin/car_list.jsp(33,2) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("con");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("        <tr>\r\n");
          out.write("          <td align=\"center\" bgcolor=\"#FFFFFF\">&nbsp;");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("          <td align=\"center\" bgcolor=\"#FFFFFF\">&nbsp;");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.color}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("          <td align=\"center\" bgcolor=\"#FFFFFF\">&nbsp;");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.brand}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("          <td align=\"center\" bgcolor=\"#FFFFFF\">&nbsp;");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.model}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("          <td align=\"center\" bgcolor=\"#FFFFFF\">&nbsp;");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.carnumber}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("          <td align=\"center\" bgcolor=\"#FFFFFF\">&nbsp;");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.buytime}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("          <td align=\"center\" bgcolor=\"#FFFFFF\">&nbsp;");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.cardetail}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("          <td align=\"center\" bgcolor=\"#FFFFFF\">\r\n");
          out.write("          <a href=\"cardelete_admin/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" onClick=\"return confirm('确定删除吗？')\">删除</a>&nbsp;&nbsp;<a href=\"carupdate_admin/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\">修改</a>\r\n");
          out.write("          </td>\r\n");
          out.write("        </tr>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
