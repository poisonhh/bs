<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>�ޱ���ҳ</title>
    <link href="Images/css1/top_css.css" rel="stylesheet" type="text/css">
</head>
<body bgcolor="#03A8F6">
    <form id="form1" runat="server">
    <div>
    <table width="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td width="194" height="60" align="center" background="Images/top_logo.jpg"></td>
    <td align="center" style="background:url(/Images/top_bg.jpg) no-repeat"><table cellspacing="0" cellpadding="0" border="0" width="100%" height="33">
      <tbody>
        <tr>
          <td width="30" align="left"><img onClick="switchBar(this)" height="15" alt="�ر���߹���˵�" src="Images/on-of.gif" width="15" border="0" /></td>
          <td width="320" align="left"><a class="top_link"  href="#" target="main"></a>&nbsp;&nbsp;��ӭ  <%
	if(request.getSession().getAttribute("ADMIN") != null){
		%>
			    ����Ա��&nbsp;&nbsp;${ADMIN.username }
                              
		<%
		
	}
%>
    <%
	if(request.getSession().getAttribute("stu") != null){
		%>
			  �û���&nbsp;&nbsp;${stu.name }<br>
                                   
		<%
		
	}
%>��½ϵͳ <a href="exit.jsp" target="_top">�˳�</a></td>
          <td width="80" align="right" nowrap="nowrap" class="topbar"></td>
          <td class="topbar"><a href="index.jsp" 
            target="_blank"><img title="������ҳ" height="23" 
            src="Images/home.gif" width="33" 
        border="0" /></a>&nbsp;</td>
        </tr>
      </tbody>
    </table>
    </td>
  </tr>
  <tr height="6">
    <td bgcolor="#1F3A65" background="Images/top_bg.jpg"></td>
  </tr>
</table>
<script language="javascript">
<!--
var displayBar=true;
function switchBar(obj){
	if (displayBar)
	{
		parent.frame.cols="0,*";
		displayBar=false;
		obj.title="����߹���˵�";
	}
	else{
		parent.frame.cols="195,*";
		displayBar=true;
		obj.title="�ر���߹���˵�";
	}
}
//-->
</script>
    </div>
    </form>
</body>
</html>