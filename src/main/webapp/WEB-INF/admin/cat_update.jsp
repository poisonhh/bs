<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
  <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head >
    <title>无标题页</title>
    <link href="Images/css1/css.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.js"></script>
       <script type="text/javascript" src="<%=request.getContextPath() %>/xheditor/jquery-1.3.2.min.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath() %>/xheditor/common.css" type="text/css" media="screen" />
<script type="text/javascript" charset="gbk" src="<%=request.getContextPath() %>/xheditor/xheditor.js"></script>
    <script>
	function checkmadd(){
		var name = $("#name").attr("value");
		if(name.length == 0){
			alert('题目不能为空');
			return false;
		}


	}
</script>
</head>
<body>

    <div>
   
<table class="table" cellspacing="1" cellpadding="2" width="99%" align="center" 
border="0">
  <tbody>
    <tr>
      <th class="bg_tr" align="left" height="25">类别修改</th>
    </tr>
    <tr>
      <td height="23" align="center" class="td_bg"><p>&nbsp;</p>
	     <form action="/catupdate_admin" method="post"  onsubmit="return checkmadd();">
        <table width="700" border="0" cellpadding="1" cellspacing="1" bgcolor="#E4F1FA">

        <tr>
          <td width="133" height="40" align="right" bgcolor="#FFFFFF">名称：</td>
          <td width="460" align="left" bgcolor="#FFFFFF"><label>
            <input type="text" name="mvo.name" id="name" value="${resObj.name}" class="inputcss" />
              <input name="mvo.cid" value="${resObj.cid }" id="cid"  type="hidden" size="20"  maxlength="20" />
          </label></td>
        </tr>
         
        
        <tr>
          <td height="40" align="right" bgcolor="#FFFFFF">&nbsp;</td>
          <td bgcolor="#FFFFFF"><label>
            <input type="submit" name="Submit" value="提交" />
          </label></td>
        </tr>
      </table> 
	      </form>	
        <p>&nbsp;</p></td>
      </tr>
  </tbody>
</table>

    </div>
  
</body>
</html>
