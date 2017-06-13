<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
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
       var price = $("#price").attr("value");
		if(price.length == 0){
			alert('价格不能为空');
			return false;
		}
		
		var num = $("#num").attr("value");
		if(num.length == 0){
			alert('数量不能为空');
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
      <th class="bg_tr" align="left" height="25">车辆修改</th>
    </tr>
    <tr>
      <td height="23" align="center" class="td_bg"><p>&nbsp;</p>
	     <form action="goodsupdate_admin" method="post"  onsubmit="return checkmadd();" enctype="multipart/form-data">
        <table width="700" border="0" cellpadding="1" cellspacing="1" bgcolor="#E4F1FA">
      <tr>
          <td width="133" height="40" align="right" bgcolor="#FFFFFF">车辆ID：</td>
          <td width="460" align="left" bgcolor="#FFFFFF"><label>
					 <input type="text" name="cid" value="${goods.cid}" id="name" class="inputcss" />	
          </label></td>
        </tr>
        <tr>
          <td width="133" height="40" align="right" bgcolor="#FFFFFF">名称：</td>
          <td width="460" align="left" bgcolor="#FFFFFF"><label>
            <input type="text" name="name" value="${goods.name }" id="name" class="inputcss" />
          </label></td>
        </tr>
        <tr>
          <td width="133" height="40" align="right" bgcolor="#FFFFFF">价格：</td>
          <td width="460" align="left" bgcolor="#FFFFFF"><label>
            <input type="text" name="price" value="${goods.price }" id="price" class="inputcss" />
          </label></td>
        </tr>        
          <tr>
          <td width="133" height="40" align="right" bgcolor="#FFFFFF">数量：</td>
          <td width="460" align="left" bgcolor="#FFFFFF"><label>
            <input type="text" name="num" value="${goods.num }" id="num" class="inputcss" />
          </label></td>
        </tr>         
           <tr>
          <td width="133" height="40" align="right" bgcolor="#FFFFFF">图片：</td>
          <td width="460" align="left" bgcolor="#FFFFFF"><label>
            <!-- <file name="fvo.myFile" id="file" theme="simple"></file> -->
             <input name="picurl" value="${goods.picurl }" id="picurl"  type="hidden" size="20"  maxlength="20" />
          </label></td>
        </tr>
         <tr>
          <td width="133" height="40" align="right" bgcolor="#FFFFFF">介绍：</td>
          <td width="460" align="left" bgcolor="#FFFFFF"><label>
              <script type="text/javascript">
							$(pageInit);
							var editor;
							function pageInit(){
								$('#content').xheditor(true,
									{tools:'GStart,GEnd,Cut,Copy,Paste,Pastetext,Blocktag,Fontface,FontSize,Bold,Italic,Underline,Strikethrough,FontColor,BackColor,Removeformat,Align,List,Outdent,Indent,Link,Unlink,Emot,Media,Source,Img,GEnd'});
								editor=$('#content').xheditor(true)[0].xheditor;
							}	
							
						
						</script>
        
            <textarea name="content" id="content" rows="50" cols="70" style="height:250px;">${goods.content}</textarea>
              <input name="gid" value="${goods.gid }" id="gid"  type="hidden" size="20"  maxlength="20" />
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
