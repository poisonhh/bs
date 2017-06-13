<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<ul class="ul">
		<c:forEach items="${pi.list}" var="obj" varStatus="con">
					<li><a href="<%=request.getContextPath() %>/news_info?mvo.id=${obj.id }">
				  ${obj.title}			
						</a>
					</li>	
					</c:forEach>
</ul>					