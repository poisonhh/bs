<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/scrollpic-pack.js"></script>
<script type="text/javascript" >
	function checklogin(){
		var u_name = $("#u_name").attr("value");
		var u_pwd = $("#u_pwd").attr("value");
		if($.trim(u_name).length == 0){
			alert("用户名不能为空！");
			return false;
		}
		
		if($.trim(u_pwd).length == 0){
			alert("密码不能为空！");
			return false;
		}
	}
</script>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>


		
	
	<!--start-->  
	<form id="loginform" method="post" action="<%=request.getContextPath() %>/memberslogin_admin" onsubmit="return checklogin();">
	<table width="252" border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td width="249" height="25" align="center" background="images/top123.jpg">用户中心</td>
      </tr>
      <tr>
        <td height="99" valign="top">
		      <%
	if(request.getSession().getAttribute("member") == null){
		%>
            <table width="252" border="0" cellpadding="0" cellspacing="1" bgcolor="#BCE118">
              <tr>
                <td width="80" height="30" align="right" bgcolor="#FFFFFF">用户名：</td>
                <td width="169" bgcolor="#FFFFFF"><label> &nbsp;
                     <input type="text" name="username" id="u_name" class="input" />
                </label></td>
              </tr>
              <tr>
                <td height="30" align="right" bgcolor="#FFFFFF">密码：</td>
                <td bgcolor="#FFFFFF">&nbsp;
                   <input type="password" name="password" id="u_pwd" class="input" />
                </td>
              </tr>
              <tr>
                <td height="30" colspan="2" align="center" bgcolor="#FFFFFF">  <input type="submit" name="Submit2" value="登陆" />&nbsp;&nbsp;<a href="<%=request.getContextPath() %>/register.jsp">注册</a>
                  &nbsp;</td>
              </tr>
            </table>
       <%}else{%>
              <table width="252" border="0" cellpadding="0" cellspacing="1" bgcolor="#BCE118">
                <tr>
                  <td width="169" align="center" bgcolor="#FFFFFF"><br />
                  欢迎用户${member.username }登陆<br />
                <br />
               <a href="<%=request.getContextPath() %>/oders_list"><span>我的订单</span></a> <br />
                <br />
                 <a href="<%=request.getContextPath() %>/cart_list"><span>候选框</span></a>&nbsp;<a href="<%=request.getContextPath() %>/exit.jsp"><span>退出</span></a>
                <br />
                    <br />
                <br />
                <br />
                  </td>
                </tr>
              </table>
           <%}%>
        </td>
      </tr>
    </table>
	</form>
	<form action="<%=request.getContextPath() %>/goods_list" method="post" >
	<table width="252" height="40" border="0" cellpadding="0" cellspacing="0" class="abc">
        <tr>
          <td height="31" align="center" class="abctop">搜索车辆</td>
        </tr>
    <tr>
          <td height="61" align="center"> 
               <input type="text" name="par.keyword" id="keyname" class="input" /> &nbsp;<input type="submit" name="Submit2" value="搜索" />
			   
			   </td>
      </tr>
</table>
	  	</form>
    <table width="252" height="367" border="0" cellpadding="0" cellspacing="0" class="abc">
      <tr>
        <td height="31" align="center" class="abctop">租车资讯</td>
      </tr>
      <tr>
        <td height="330" valign="top">
       
            			 <div id="news"></div>
  <script>
  
  function GetInfo(){
	$.ajax({
		url:"news_ajax?time"+new Date().toString(),
		type:'GET',
		success:function(){
			$('#news').html(arguments[0]);
		}
	});
}
  GetInfo();
  </script>      
        </td>
      </tr>
    </table>
