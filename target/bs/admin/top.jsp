<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
      String path = request.getContextPath();
      String basePath = request.getScheme() + "://"
                  + request.getServerName() + ":" + request.getServerPort()
                  + path + "/";
%>
<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>无标题页</title>
    <link href="../admin/Images/css1/top_css.css" rel="stylesheet" type="text/css">
</head>
<body bgcolor="#03A8F6">
    <form id="form1" runat="server">
    <div>
    <table width="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td width="194" height="60" align="center" background="../admin/Images/top_logo.jpg"></td>
    <td align="center" style="background:url(../admin/Images/top_bg.jpg) no-repeat"><table cellspacing="0" cellpadding="0" border="0" width="100%" height="33">
      <tbody>
        <tr>
          <td width="30" align="left"><img onClick="switchBar(this)" height="15" alt="关闭左边管理菜单" src="../admin/Images/on-of.gif" width="15" border="0" /></td>
          <td width="320" align="left"><a class="top_link"  href="#" target="main"></a>&nbsp;&nbsp;欢迎  <%
	if(request.getSession().getAttribute("admin") != null){
		%>
			    管理员：&nbsp;&nbsp;${username }
                              
		<%
		
	}
%>
    <%
	if(request.getSession().getAttribute("stu") != null){
		%>
			  用户：&nbsp;&nbsp;${stu.name }<br>
                                   
		<%
		
	}
%>登陆系统 <a href="exit.jsp" target="_top">退出</a></td>
          <td width="80" align="right" nowrap="nowrap" class="topbar"></td>
          <td class="topbar"><a href="index.jsp" 
            target="_blank"><img title="返回首页" height="23" 
            src="../admin/Images/home.gif" width="33" 
        border="0" /></a>&nbsp;</td>
        </tr>
      </tbody>
    </table>
    </td>
  </tr>
  <tr height="6">
    <td bgcolor="#1F3A65" background="../admin/Images/top_bg.jpg"></td>
  </tr>
</table>
<script language="javascript">
<!--
var displayBar=true;
function switchBar(obj){
	if (displayBar)
	{
		parent.frame.cols="0,*";
		displayBar=false;
		obj.title="打开左边管理菜单";
	}
	else{
		parent.frame.cols="195,*";
		displayBar=true;
		obj.title="关闭左边管理菜单";
	}
}
//-->
</script>
    </div>
    </form>
</body>
</html>