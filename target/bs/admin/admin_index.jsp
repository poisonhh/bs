<%@ page pageEncoding="utf-8"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
      String path = request.getContextPath();
      String basePath = request.getScheme() + "://"
                  + request.getServerName() + ":" + request.getServerPort()
                  + path + "/";
%>
<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>网站后台系统</title>
    <frameset rows="59,*" frameborder="no" border="0" framespacing="0">
	<frame src="../admin/top.jsp" noresize="noresize" frameborder="0" name="topFrame" marginwidth="0" marginheight="0" scrolling="no">
<frameset rows="*" cols="180,*" id="frame">
	<frame src="../admin/left.jsp" name="leftFrame" noresize="noresize" marginwidth="0" marginheight="0" frameborder="0" scrolling="auto">
	<frame src="goodslist_admin" name="main" marginwidth="0" marginheight="0" frameborder="0" scrolling="yes">
</frameset>
<!--  
<frame src="<%=path %>UntitledFrame-1" noresize="noresize" frameborder="0" name="bottomFrame" marginwidth="0" marginheight="0" scrolling="no">
<noframes>
-->

</head>
<body>
    <form id="form1" runat="server">
    <div>
    
    </div>
    </form>
</body>
</html>