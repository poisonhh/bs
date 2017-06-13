<%@ page language="java" pageEncoding="utf-8"%>
<html>
  <head>
  	 <%
   	request.getSession().removeAttribute("member");
   %>
   <script>
   		window.location.href="<%=request.getContextPath()%>/index.jsp"; 
   </script>
  </head>
  
  <body>
  
  </body>
</html>
