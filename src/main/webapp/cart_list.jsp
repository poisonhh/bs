<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>汽车租赁系统</title>
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
        <td height="39" align="center" class="subject">候选框列表</td>
      </tr>
      <tr>
        <td height="455" align="center" valign="top" class="content">
		
		
		
		        <table width="690" border="0" cellpadding="1" cellspacing="1" bgcolor="#018EC3">
                  <tr>
                    <td width="136" bgcolor="#FFFFFF">&nbsp; 车辆名称</td>
                    <td width="136" bgcolor="#FFFFFF">&nbsp;租车价格</td>
                    <td width="136" bgcolor="#FFFFFF">&nbsp;购买数量</td>    
                    <td width="130" bgcolor="#FFFFFF">&nbsp;图片</td>
					 <td width="136" bgcolor="#FFFFFF">&nbsp;用户</td>
                  </tr>
              <c:forEach items="${cartList}" var="obj" varStatus="con">	
                  <tr>
                    <td bgcolor="#FFFFFF">&nbsp;${obj.goods.name}</td>
                    <td bgcolor="#FFFFFF">&nbsp;${obj.goods.price}元/天</td> 
                    <td bgcolor="#FFFFFF">&nbsp;${obj.buynum}</td>
                    <td bgcolor="#FFFFFF">&nbsp;<img src="${obj.goods.picurl}" with="80" height="60"/></td>					
                    <td bgcolor="#FFFFFF">&nbsp;<a href="cartdelete_admin/${obj.cid}">删除</a> &nbsp;&nbsp;<a href="oderstoadd_admin/${obj.cid}">结账</a> </td>

                  </tr>
                  </c:forEach>
                </table>
		  	<!--  
				<p style="text-align:center">
			<jsp:include page="/pageinfo.jsp">
									<jsp:param value="cart_list" name="path"/>  </jsp:include>
				</p>			
		-->
		        <p style="text-align:center">&nbsp; </p></td>
      </tr>
    </table></td>
  </tr>

</table>
 <jsp:include flush="true" page="foot.jsp"></jsp:include>
</body>
</html>
