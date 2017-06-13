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
<c:choose>
	<c:when test="${USERS == null}">
	   <script>
	     alert("请登陆后！！在查看");
   		window.location.href="<%=request.getContextPath()%>/index.jsp"; 
   </script>
		</c:when>
</c:choose>
 <jsp:include flush="true" page="top.jsp"></jsp:include>
<br />
<table width="1004" border="0" align="center" cellpadding="0" cellspacing="0"  bgcolor="#FFFFFF">
  <tr>
    <td width="243" height="505" valign="top" class="leftbg" >
	 <jsp:include flush="true" page="left.jsp"></jsp:include>
    </td>
    <td width="726" valign="top"><table width="700" border="0" align="center" cellpadding="0" cellspacing="0"  class="right_box">
      <tr>
        <td height="39" align="center" class="subject">订单列表</td>
      </tr>
      <tr>
        <td height="455" align="center" valign="top" class="content">
		
		
		
		        <table width="99%" border="0" cellpadding="1" cellspacing="1" bgcolor="#018EC3">
                  <tr>
                    <td width="81" bgcolor="#FFFFFF">订单号</td>
                    <td width="126" bgcolor="#FFFFFF">&nbsp;车辆名称</td>
                    <td width="134" bgcolor="#FFFFFF">&nbsp;车辆价格</td>
                    <td width="98" bgcolor="#FFFFFF">&nbsp;租车数量</td>    
                    <td width="113" bgcolor="#FFFFFF">&nbsp;租车日期</td>
					 <td width="49" align="center" bgcolor="#FFFFFF">状态</td>
					 <td width="68" align="center" bgcolor="#FFFFFF">&nbsp;操作</td>
                  </tr>
              <c:forEach items="${pi.list}" var="obj" varStatus="con">	
                  <tr>
                    <td bgcolor="#FFFFFF">${obj.orderID}</td>
                    <td bgcolor="#FFFFFF">&nbsp;${obj.goods.name}</td>
                    <td bgcolor="#FFFFFF">&nbsp;${obj.goods.price}元/天</td>
                    <td bgcolor="#FFFFFF">&nbsp;${obj.buynum}</td>
                    <td bgcolor="#FFFFFF">&nbsp;${obj.addtime}</td>					
                    <td bgcolor="#FFFFFF">
                    <c:if test="${obj.flag == 0}">
                			没取车               		</c:if>
                		<c:if test="${obj.flag== 1}">
                			已经取车                		</c:if>
                		<c:if test="${obj.flag == 2}">
                			交易完成                		</c:if>	
					
                    
                    </td>
                    <td bgcolor="#FFFFFF">&nbsp;&nbsp;&nbsp;<a href="ordersupdate_qflag?id=${obj.id}">确认交易</a> </td>
                  </tr>
                  </c:forEach>
                </table>
		  	
				<p style="text-align:center">
			<jsp:include page="/pageinfo.jsp">
									<jsp:param value="orders_list" name="path"/>  </jsp:include>
				</p>			
		
		        <p style="text-align:center">&nbsp; </p></td>
      </tr>
    </table></td>
  </tr>

</table>
 <jsp:include flush="true" page="foot.jsp"></jsp:include>
</body>
</html>
