<%@ page language="java" pageEncoding="utf-8"%>
<html>
  <head>
  	 <%
   	request.getSession().removeAttribute("USERS");
   %>
   <script>
   		window.location.href="<%=request.getContextPath()%>/index.jsp"; 
   </script>
  </head>
  
  <body>
  
  </body>
</html>
