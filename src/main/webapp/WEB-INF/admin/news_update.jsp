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
		var title = $("#title").attr("value");
		if(title.length == 0){
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
      <th class="bg_tr" align="left" height="25">新闻修改</th>
    </tr>
    <tr>
      <td height="23" align="center" class="td_bg"><p>&nbsp;</p>
	     <form action="/newsupdate_admin" method="post"  onsubmit="return checkmadd();">
        <table width="700" border="0" cellpadding="1" cellspacing="1" bgcolor="#E4F1FA">

        <tr>
          <td width="133" height="40" align="right" bgcolor="#FFFFFF">名称：</td>
          <td width="460" align="left" bgcolor="#FFFFFF"><label>
            <input type="text" name="mvo.title" id="title" value="${resObj.title}"  class="inputcss" />
          </label></td>
        </tr>
         
         <tr>
          <td width="133" height="40" align="right" bgcolor="#FFFFFF">名称：</td>
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
                
            <textarea name="mvo.content" id="content" rows="50" cols="70" style="height:250px;">${resObj.content }</textarea>
          </label></td>
        </tr>
        <tr>
          <td height="40" align="right" bgcolor="#FFFFFF">&nbsp;</td>
          <td bgcolor="#FFFFFF"><label>
            <input type="submit" name="Submit" value="提交" />
              <input name="mvo.id" value="${resObj.id }" id="id"  type="hidden" size="20"  maxlength="20" />
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
