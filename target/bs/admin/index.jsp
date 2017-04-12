<%@ page pageEncoding="utf-8"  %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head >
    <title>网站后台</title>
    <style type="text/css">
<!--
body {
	background-repeat: no-repeat;
	background-color: #9CDCF9;
	background-position: 0px 0px;

}
a{ color:#008EE3}
a:link  { text-decoration: none;color:#008EE3}
A:visited {text-decoration: none;color:#666666}
A:active {text-decoration: underline}
A:hover {text-decoration: underline;color: #0066CC}
A.b:link {
	text-decoration: none;
	font-size:12px;
	font-family: "Helvetica,微软雅黑,宋体";
	color: #FFFFFF;
}
A.b:visited {
	text-decoration: none;
	font-size:12px;
	font-family: "Helvetica,微软雅黑,宋体";
	color: #FFFFFF;
}
A.b:active {
	text-decoration: underline;
	color: #FF0000;

}
A.b:hover {text-decoration: underline; color: #ffffff}

.table1 {
	border: 1px solid #CCCCCC;
}
.font {
	font-size: 12px;
	text-decoration: none;
	color: #999999;
	line-height: 20px;
	

}

td {
	font-size: 12px;
	color: #007AB5;
}
form {
	margin: 1px;
	padding: 1px;
}

.unnamed1 {
	border: thin none #FFFFFF;
}
select {
	border: 1px solid #cccccc;
	height: 18px;
	color: #666666;

	.unnamed1 {
	border: thin none #FFFFFF;
}

.tablelinenotop {
	border-top: 0px solid #CCCCCC;
	border-right: 1px solid #CCCCCC;
	border-bottom: 0px solid #CCCCCC;
	border-left: 1px solid #CCCCCC;
}
.tablelinenotopdown {

	border-top: 1px solid #eeeeee;
	border-right: 1px solid #eeeeee;
	border-bottom: 1px solid #eeeeee;
	border-left: 1px solid #eeeeee;
}
.cssinput12{
  background:url(Images/login_6.gif) repeat-x;
  width:100px;
 border:solid 1px #27B3FE; 
 height:20px;
  background-color:#FFFFFF;
}
.style6 {FONT-SIZE: 9pt; color: #7b8ac3; }

-->
</style>
<script language="JavaScript">
function CheckForm()
{
	if (document.form1.user.value.length == 0)
 {
		alert("请输入用户名.");
		document.form1.user.focus();
		return false;
	}
	if (document.form1.user.value.indexOf("<")!=-1 || document.form1.user.value.indexOf(">")!=-1)
{
		alert("用户名中包含非法字符 (<,>) ");
		document.form1.user.focus();
		return false;
	}
	if (document.form1.user.value.indexOf("'")!=-1)
{
		alert("用户名中包含非法字符 (') ");
		document.form1.user.focus();
		return false;
	}
	if (document.form1.pass.value.length == 0) 
{
		alert("请输入密码.");
		document.form1.pass.focus();
		return false;
	}

}
</script>
</head>
<body>

    <div align="center">
	<br />
	<div style=" font-size:36px; font-weight:bold; text-align:center; color:#003333;">网站后台</div>
		<form name="form1" method="post" action="adminlogin_admin" onSubmit="return CheckForm();">
    <table width="677" border="0" align="center" cellpadding="0" cellspacing="0" style="margin-top:50px">
  <tr>
    <td width="352" height="259" align="center" valign="bottom" background="<%=request.getContextPath() %>/Images/login_1.gif"><table width="90%" border="0" cellspacing="3" cellpadding="0">
      <tr>
        <td align="right" valign="bottom" style="color:#05B8E4">&nbsp;</td>
      </tr>
    </table></td>
    <td width="193" background="<%=request.getContextPath() %>/Images/login_2.gif" style="width: 188px">

	<table width="190" height="106" border="0" align="center" cellpadding="2" cellspacing="0">

            <tr>
              <td height="50" colspan="2" align="center"></td>
            </tr>
      
            <tr>
              <td width="60" height="30" align="left">登陆名称</td>
              <td style="width: 144px"><input type="text" name="username"  id="user" style=" width:100px; height:20px; border:1px solid #CCCCCC;"/></td>
            </tr>
            <tr>
              <td align="left" style="height: 34px">登陆密码</td>
              <td style="height: 34px; width: 144px;">
                  <input type="password" name="password" id="Pass"  style=" width:100px; height:20px; border:1px solid #CCCCCC;"/></td>
            </tr>
            
          <tr>
              <td colspan="2" align="center">
                <input name="Submit" type="submit" value="登录"/></td>
            <tr>
              <td height="5" colspan="2"></td>
    </table>

	</td>
    <td width="132" background="<%=request.getContextPath() %>/Images/login_3.gif">&nbsp;</td>
  </tr>
  <tr>
    <td height="161" colspan="3" background="<%=request.getContextPath() %>/Images/login_4.gif"></td>
  </tr>
</table>
 </form>
    </div>
   
</body>
</html>
