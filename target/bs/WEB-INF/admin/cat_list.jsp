<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>�ޱ���ҳ</title>
    <link href="/admin/Images/css1/css.css" rel="stylesheet" type="text/css">
</head>
<body>
    <form id="form1" runat="server">
    <div>
   
<table class="table" cellspacing="1" cellpadding="2" width="99%" align="center" 
border="0">
  <tbody>
    <tr>
      <th class="bg_tr" align="left" height="25">�������б�</th>
    </tr>
    <tr>
      <td height="23" align="center" class="td_bg"><p>&nbsp;</p>
      <table width="98%" border="0" cellpadding="1" cellspacing="1" bgcolor="#3498DA" >
        <tr>
          <td width="76" align="center" bgcolor="#FFFFFF">ID</td>
          <td width="216" align="center" bgcolor="#FFFFFF">����</td>
          <td width="149" align="center" bgcolor="#FFFFFF">����</td>
        </tr>
		<c:forEach items="${pi.list}" var="obj" varStatus="con">
        <tr>
          <td align="center" bgcolor="#FFFFFF">&nbsp;${obj.cid }</td>
          <td align="center" bgcolor="#FFFFFF">&nbsp;${obj.name}</td>
          <td align="center" bgcolor="#FFFFFF">
          <a href="<%=request.getContextPath() %>/catdelete_admin?mvo.cid=${obj.cid }" onClick="return confirm('ȷ��ɾ����')">ɾ��</a>&nbsp;&nbsp;<a href="cattoupdate_admin?mvo.cid=${obj.cid }">�޸�</a>
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
