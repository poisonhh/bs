<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="style.css" rel="stylesheet" type="text/css" />

</head>

<body>
 <jsp:include flush="true" page="top.jsp"></jsp:include>
<br />
<table width="1004" border="0" align="center" cellpadding="0" cellspacing="0"  bgcolor="#FFFFFF">
  <tr>
    <td width="243" height="505" valign="top" class="leftbg" >
	 <jsp:include flush="true" page="left.jsp"></jsp:include>
    </td>
    <td width="726" valign="top"><table width="700" border="0" align="center" cellpadding="0" cellspacing="0"  class="right_box">
      <tr>
        <td height="39" align="center" class="subject"><a href="<%=request.getContextPath() %>/rooms.do?m=info&amp;r_id=${obj.r_id }">${obj.r_name }</a></td>
      </tr>
      <tr>
        <td height="455" valign="top" class="content">

			
		
			    <table width="600" border="0" align="center">
                  <tr>
                    <td width="305" rowspan="6"><img  src="${resObj.picurl }"  width="284" height="261" class="img" /></td>
                    <td width="285" height="35">&nbsp;<a href="<%=request.getContextPath() %>/cartadd_admin?mvo.goods.gid=${resObj.gid }"><img src="images/order.jpg"  border="0"/></a></td>
                  </tr>
                  <tr>
                    <td height="33">价格：${resObj.price }元/天</td>
                  </tr>
                  <tr>
                    <td height="34">名称：${resObj.name}</td>
                  </tr>
                    <tr>
                    <td height="31">数量：${resObj.num }</td>
                  </tr>
                  <tr>
                    <td height="201" valign="top">${resObj.content }</td>
                  </tr>
                </table>
		 
			
		
		</td>
      </tr>
    </table></td>
  </tr>

</table>
 <jsp:include flush="true" page="foot.jsp"></jsp:include>
</body>
</html>
