<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.js"></script>
<script> 
	function checkreg(){
		var username = $("#username").attr("value");
		var u_pwd = $("#u_pwds").attr("value");
		var u_rpwd = $("#u_rpwds").attr("value");
		
		if(username.length == 0){
			alert("用户账号不能为空");
			return false;
		}
		if(u_pwd.length == 0){
			alert("密码不能为空");
			return false;
		}
		
		if(u_rpwd.length == 0){
			alert("确认密码不能为空");
			return false;
		}
		
		if(u_rpwd != u_pwd){
			alert("两次密码不一致");
			return false;
		}
		
	}
</script>
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
        <td height="39" align="center" class="subject">用户注册</td>
      </tr>
      <tr>
        <td height="455" valign="top" class="content">

			
	  <form action="/membersadd_admin" method="post"  onsubmit="return checkreg();">
			    <table width="491" border="0" align="center">
              
                  <tr>
                    <td width="108" height="33" align="right">&nbsp;&nbsp;账号：&nbsp;
                      <label></label></td>
                    <td width="373">&nbsp;<input name="mvo.username" id="username" type="text" size="30" maxlength="20"/></td>
                  </tr>
                  <tr>
                    <td height="34" align="right">密码：</td>
                    <td height="34">&nbsp;<input name="mvo.password" id="u_pwds"  type="password" size="33" maxlength="20"/></td>
                  </tr>
				   <tr>
                    <td height="34" align="right">确认密码：</td>
                    <td height="34">&nbsp;<input name="password2" id="u_rpwds"  type="password" size="33" maxlength="20"/></td>
                  </tr>
                  <tr>
                    <td height="34" align="right">邮箱：</td>
                    <td height="34">&nbsp;<input name="mvo.email" id="u_email"  type="text" size="33" maxlength="20"/></td>
                  </tr>
                  <tr>
                    <td height="34" align="right">电话：</td>
                    <td height="34">&nbsp;<input name="mvo.phone" id="u_phone"  type="text" size="33" maxlength="20"/></td>
                  </tr>
                  <tr>
                    <td height="34" align="right">地址：</td>
                    <td height="34">&nbsp;<input name="mvo.addr" id="u_addr"  type="text" size="33" maxlength="20"/></td>
                  </tr>
            
				  <c:if test="${message != null}">
                  <tr>
                    <td height="37" colspan="2">&nbsp;<label><span style="color:red">${message}</span></label></td>
                  </tr>
				  </c:if>
                  <tr>
                    <td height="31" colspan="2" align="center">&nbsp;
                     	<input class="button" type="submit" value="注 册" />	
					<input class="button" type="submit" value="重 置" /></td>
                  </tr>
                  <tr>
                    <td height="201" colspan="2" valign="top">&nbsp;</td>
                  </tr>
                </table>
		 </form>				
			
		
		</td>
      </tr>
    </table></td>
  </tr>

</table>
 <jsp:include flush="true" page="foot.jsp"></jsp:include>
</body>
</html>
