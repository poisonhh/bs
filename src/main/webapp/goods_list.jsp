<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>汽车租赁系统</title>
<link href="style.css" rel="stylesheet" type="text/css" />

</head>

<body>
	<jsp:include flush="true" page="top.jsp"></jsp:include>
	<br />
	<table width="1004" border="0" align="center" cellpadding="0"
		cellspacing="0" bgcolor="#FFFFFF">
		<tr>
			<td width="243" height="505" valign="top" class="leftbg"><jsp:include
					flush="true" page="left.jsp"></jsp:include></td>
			<td width="726" valign="top"><table width="700" border="0"
					align="center" cellpadding="0" cellspacing="0" class="right_box">
					<tr>
						<td height="39" align="center" class="subject">车辆列表</td>
					</tr>
					<tr>
						<td height="455" valign="top" class="content"><c:forEach
								items="${goodsList}" var="obj" varStatus="con">


								<table width="600" border="0" align="center">
									<tr>
										<td width="174" rowspan="6"><a
											href="<%=request.getContextPath() %>/goods_info?/${obj.gid }"><img
												src="<%=request.getContextPath() %>/${obj.picurl}"
												width="158" height="130" class="img" /></a></td>
										<td width="416">名称：${obj.name } &nbsp;&nbsp;<a
											href="<%=request.getContextPath() %>/cartadd_admin/${obj.gid }">预订</a></td>
									</tr>
									<tr>
										<td>价格：${obj.price }元/天</td>
									</tr>
									<tr>
										<td>数量：${obj.num }</td>
									</tr>
									<tr>
										<td>${obj.content }</td>
									</tr>
								</table>

								<div class="info"></div>
							</c:forEach>
							<!-- 
							<p style="text-align: center">
								<jsp:include page="/pageinfo.jsp">
									<jsp:param value="goods_list" name="path" />
								</jsp:include>
							</p>
							 -->
							</td>
					</tr>
				</table></td>
		</tr>

	</table>
	<jsp:include flush="true" page="foot.jsp"></jsp:include>
</body>
</html>
