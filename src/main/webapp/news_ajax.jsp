<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<ul class="ul">
		<c:forEach items="${newsList}" var="obj" varStatus="con">
					<li><a href="news_info/${obj.id }">
				  ${obj.title}			
						</a>
					</li>	
					</c:forEach>
</ul>					