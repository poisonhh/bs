<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>汽车租赁系统</title>
<link href="style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.js"></script>
<script> 
	function checkreg(){
		var name = $("#name").attr("value");
		var postcode = $("#postcode").attr("value");
		var phone = $("#phone").attr("value");
		var addr = $("#addr").attr("value");
		if(name.length == 0){
			alert("联系人不能为空");
			return false;
		}
		if(postcode.length == 0){
			alert("邮编不能为空");
			return false;
		}
		
		if(phone.length == 0){
			alert(" 电话不能为空");
			return false;
		}
		
	    if(addr.length == 0){
			alert(" 地址不能为空");
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
        <td height="39" align="center" class="subject">填写订单信息</td>
      </tr>
      <tr>
        <td height="455" valign="top" class="content">

			
	  <form action="/odersadd_admin" method="post"  onsubmit="return checkreg();">
			    <table width="491" border="0" align="center">
              
                  <tr>
                    <td width="108" height="33" align="right">&nbsp;&nbsp;联系人：&nbsp;
                      <label></label></td>
                    <td width="373">&nbsp;<input name="name" id="name" type="text" size="30" maxlength="20"/></td>
                  </tr>
         
                  <tr>
                    <td height="34" align="right">用车时间：</td>
                    <td height="34">&nbsp;<input name="postcode" id="postcode"  type="text" size="33" maxlength="20"/></td>
                  </tr>
                  <tr>
                    <td height="34" align="right">联系电话：</td>
                    <td height="34">&nbsp;<input name="phone" id="phone"  type="text" size="33" maxlength="20"/></td>
                  </tr>
                  <tr>
                    <td height="34" align="right">送车地址：</td>
                    <td height="34">&nbsp;<input name="addr" id="addr"  type="text" size="33" maxlength="20"/>
                    <input name="gid" id="phone"  type="hidden" value="${gid}" size="33" maxlength="20"/>
                    </td>
                  </tr>
            
				  <c:if test="${message != null}">
                  <tr>
                    <td height="37" colspan="2">&nbsp;<label><span style="color:red">${message}</span></label></td>
                  </tr>
				  </c:if>
                  <tr>
                    <td height="31" colspan="2" align="center">&nbsp;
                     	<input class="button" type="submit" value="提交订单" />	
					
					
					</td>
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
