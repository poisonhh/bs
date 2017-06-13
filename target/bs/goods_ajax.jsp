<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<br/>
		<c:forEach items="${pi.list}" var="obj" varStatus="con">
					
						
						<table width="175" height="140" border="0"  style="float:left;">
          <tr>
            <td width="175" align="center"><a href="<%=request.getContextPath() %>/goods_info?mvo.gid=${obj.gid }">
						<img  src="<%=request.getContextPath() %>/${obj.picurl}"  width="100" height="80" class="img" /></a></td>
          </tr>
          <tr>
            <td height="20" align="center">${obj.name }&nbsp;&nbsp;${obj.price }元/天</td>
          </tr>
        
        </table>
					</c:forEach>