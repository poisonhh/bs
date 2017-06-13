<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
  <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head >
    <title>无标题页</title>
    <link href="../admin/Images/css1/css.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="../js/jquery.js"></script>
       <script type="text/javascript" src="../xheditor/jquery-1.3.2.min.js"></script>
<link rel="stylesheet" href="../xheditor/common.css" type="text/css" media="screen" />
<script type="text/javascript" charset="utf-8" src="../xheditor/xheditor.js"></script>
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
      <th class="bg_tr" align="left" height="25">汽车基本信息修改</th>
    </tr>
    <tr>
      <td height="23" align="center" class="td_bg"><p>&nbsp;</p>
	     <form action="${pageContext.request.contextPath }/admin/carupdate_admin/${car.id}" method="post"  onsubmit="return checkmadd();">
        <table width="700" border="0" cellpadding="1" cellspacing="1" bgcolor="#E4F1FA">

        <tr>
          <td width="133" height="40" align="right" bgcolor="#FFFFFF">颜色：</td>
          <td width="460" align="left" bgcolor="#FFFFFF"><label>
            <input type="text" name="color" id="color" value="${car.color}" class="inputcss" />
          </label></td>
        </tr>
         <tr>
          <td width="133" height="40" align="right" bgcolor="#FFFFFF">品牌：</td>
          <td width="460" align="left" bgcolor="#FFFFFF"><label>
            <input type="text" name="brand" id="brand" value="${car.brand}" class="inputcss" />
          </label></td>
        </tr>
        <tr>
          <td width="133" height="40" align="right" bgcolor="#FFFFFF">类型：</td>
          <td width="460" align="left" bgcolor="#FFFFFF"><label>
            <input type="text" name="model" id="model" value="${car.model}" class="inputcss" />
          </label></td>
        </tr>
        <tr>
          <td width="133" height="40" align="right" bgcolor="#FFFFFF">车牌号：</td>
          <td width="460" align="left" bgcolor="#FFFFFF"><label>
            <input type="text" name="carnumber" id="carnumber" value="${car.carnumber}" class="inputcss" />
          </label></td>
        </tr>
        <tr>
          <td width="133" height="40" align="right" bgcolor="#FFFFFF">购置时间：</td>
          <td width="460" align="left" bgcolor="#FFFFFF"><label>
            <input type="text" name="buytime" id="buytime" value="${car.buytime}" class="inputcss" />
          </label></td>
        </tr>
        <tr>
          <td width="133" height="40" align="right" bgcolor="#FFFFFF">描述：</td>
          <td width="460" align="left" bgcolor="#FFFFFF"><label>
            <input type="text" name="cardetail" id="cardetail" value="${car.cardetail}" class="inputcss" />
            <input name="car.id" value="${car.id }" id="id"  type="hidden" size="20"  maxlength="20" />
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
