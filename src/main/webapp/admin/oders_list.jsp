<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>无标题页</title>
    <link href="../admin/Images/css1/css.css" rel="stylesheet" type="text/css">
</head>
<body>
    <form id="form1" runat="server">
    <div>
   
<table class="table" cellspacing="1" cellpadding="2" width="99%" align="center" 
border="0">
  <tbody>
    <tr>
      <th class="bg_tr" align="left" height="25">订单管理列表</th>
    </tr>
    <tr>
      <td height="23" align="center" class="td_bg"><p>&nbsp;</p>
      <table width="98%" border="0" cellpadding="1" cellspacing="1" bgcolor="#3498DA" >
        <tr>
          <td width="76" align="center" bgcolor="#FFFFFF">订单号</td>
          <td width="150" align="center" bgcolor="#FFFFFF">名称</td>
          <td width="150" align="center" bgcolor="#FFFFFF">价格</td>
          <td width="150" align="center" bgcolor="#FFFFFF">数量</td>
           <td width="150" align="center" bgcolor="#FFFFFF">时间</td>
            <td width="150" align="center" bgcolor="#FFFFFF">联系人</td>
             <td width="150" align="center" bgcolor="#FFFFFF">电话</td>
            <td width="150" align="center" bgcolor="#FFFFFF">用车时间</td>
            <td width="150" align="center" bgcolor="#FFFFFF">送车地址</td> 
              <td width="150" align="center" bgcolor="#FFFFFF">状态</td>
  
          <td width="149" align="center" bgcolor="#FFFFFF">操作</td>
        </tr>
		<c:forEach items="${odersList}" var="obj" varStatus="con">
        <tr>
          <td align="center" bgcolor="#FFFFFF">&nbsp;${obj.orderid }</td>
          <td align="center" bgcolor="#FFFFFF">&nbsp;${obj.goods.name}</td>
          <td align="center" bgcolor="#FFFFFF">&nbsp;${obj.goods.price}元/天</td>
          <td align="center" bgcolor="#FFFFFF">&nbsp;${obj.buynum}</td>
           <td align="center" bgcolor="#FFFFFF">&nbsp;${obj.addtime}</td>
            <td align="center" bgcolor="#FFFFFF">&nbsp;${obj.name}</td>
              <td align="center" bgcolor="#FFFFFF">&nbsp;${obj.phone}</td>
               <td align="center" bgcolor="#FFFFFF">&nbsp;${obj.postcode}</td>
                 <td align="center" bgcolor="#FFFFFF">&nbsp;${obj.addr}</td> 
             <td align="center" bgcolor="#FFFFFF">&nbsp;
             
                <c:if test="${obj.flag == 0}">
       			     <c:out value="没取车"/>
       			</c:if>
         		<c:if test="${obj.flag > 1}">
         			<c:out value="已取车 "/>              		
         		</c:if>
         		<c:if test="${obj.flag > 2}">
         			<c:out value="交易完成"/>                		
         		</c:if>
         	</td>

          <td align="center" bgcolor="#FFFFFF">
          <a href="odersdelete_admin/${obj.id }" onClick="return confirm('确定删除吗？')">删除</a>&nbsp;&nbsp;<a href="odersupdate_flag/${obj.id}">送车</a>
          </td>
        </tr>
		</c:forEach>
      </table>      
      <p>&nbsp;</p></td>
      </tr>
  </tbody>
</table>

    </div>
    </form>
</body>
</html>
