<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
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
    <link href="../admin/Images/css1/css.css" rel="stylesheet" type="text/css">
</head>
<body>
    <form id="form1" runat="server">
    <div>
   
<table class="table" cellspacing="1" cellpadding="2" width="99%" align="center" 
border="0">
  <tbody>
    <tr>
      <th class="bg_tr" align="left" height="25">车辆管理列表</th>
    </tr>
    <tr>
      <td height="23" align="center" class="td_bg"><p>&nbsp;</p>
      <table width="98%" border="0" cellpadding="1" cellspacing="1" bgcolor="#3498DA" >
        <tr>
          <td width="76" align="center" bgcolor="#FFFFFF">ID</td>
          <td width="150" align="center" bgcolor="#FFFFFF">名称</td>
          <td width="150" align="center" bgcolor="#FFFFFF">价格</td>
          <td width="150" align="center" bgcolor="#FFFFFF">数量</td>
          <td width="149" align="center" bgcolor="#FFFFFF">操作</td>
        </tr>
		<c:forEach items="${goodsList}" var="obj" varStatus="con">
        <tr>
          <td align="center" bgcolor="#FFFFFF">&nbsp;${obj.gid }</td>
          <td align="center" bgcolor="#FFFFFF">&nbsp;${obj.name}</td>
          <td align="center" bgcolor="#FFFFFF">&nbsp;${obj.price}</td>
          <td align="center" bgcolor="#FFFFFF">&nbsp;${obj.num}</td>
          <td align="center" bgcolor="#FFFFFF">
          <a href="goodsdelete_admin/${obj.gid }" onClick="return confirm('确定删除吗？')">删除</a>&nbsp;&nbsp;<a href="goodstoupdate_admin/${obj.gid }">修改</a>
          </td>
        </tr>
		</c:forEach>
      </table>      
      <p>&nbsp;</p></td>
      </tr>
  </tbody>
</table>

    </div>
    </form>
</body>
</html>
