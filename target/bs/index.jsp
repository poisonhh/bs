<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>网上租车系统</title>
<link href="<%=request.getContextPath() %>/style.css" rel="stylesheet" type="text/css" />
 <script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.js"></script>
 <script type="text/javascript" src="<%=request.getContextPath() %>/js/scrollpic-pack.js"></script>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
</head>

<body>
 <jsp:include flush="true" page="top.jsp"></jsp:include>
<br />
<table width="1004" style="margin-top:1px;" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
  <tr>
    <td width="752" height="415" valign="top" align="center">
    
<table width="750" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
      <tr>
        <td height="239" bgcolor="#FFFFFF">
		<!-- 焦点图 begin -->
						<div class="FocusPic">
					
							<div class="FP_arr_left" id="FS_arr_left_01"></div>
							<div class="FP_arr_right" id="FS_arr_right_01"></div>
							<div class="FP_cont" id="FS_Cont_01">
								<div class="FP_pic">
									<div><img src="images/1.jpg" galleryImg="no" alt=""  /></div>
								</div>
								<div class="FP_pic">
									<div><img src="images/2.jpg" galleryImg="no" alt="" /></div>
								</div>
								<div class="FP_pic">
									<div><img src="images/3.jpg" galleryImg="no" alt="" /></div>
								</div>
								<div class="FP_pic">
									<div><img src="images/4.jpg" galleryImg="no" alt="" /></div>
								</div>
							</div>
						</div>
					<script language="javascript" type="text/javascript">
					<!--//--><![CDATA[//><!--
					var focusScroll_01 = new ScrollPic();
					focusScroll_01.scrollContId   = "FS_Cont_01"; //内容容器ID
					focusScroll_01.arrLeftId      = "FS_arr_right_01";//左箭头ID
					focusScroll_01.arrRightId     = "FS_arr_left_01"; //右箭头ID
					
					
					focusScroll_01.frameWidth     = 750;//显示框宽度
					focusScroll_01.pageWidth      =  750; //翻页宽度
					focusScroll_01.upright        = false; //垂直滚动
					focusScroll_01.speed          = 10; //移动速度(单位毫秒，越小越快)
					focusScroll_01.space          = 30; //每次移动像素(单位px，越大越快)
					focusScroll_01.autoPlay       = true; //自动播放
					focusScroll_01.autoPlayTime   = 2; //自动播放间隔时间(秒)
					
					focusScroll_01.initialize(); //初始化
						
					//--><!]]>
					</script>
						<!-- 焦点图 end -->
		
		</td>
      </tr>
      <tr>
        <td height="246" valign="top" bgcolor="#FFFFFF">
        
     	
			 <div id="info"></div>
  <script>
  
  function GetInfo(){
	$.ajax({
		url:"goods_ajax?time"+new Date().toString(),
		type:'GET',
		success:function(){
			$('#info').html(arguments[0]);
		}
	});
}
  GetInfo();
  </script>
     
        
        </td>
      </tr>
    </table>
      
    
    
    
    </td>
    <td width="252" valign="top">
	 <jsp:include flush="true" page="right.jsp"></jsp:include>
	</td>
  </tr>
</table>
 <jsp:include flush="true" page="foot.jsp"></jsp:include>
</body>
</html>
