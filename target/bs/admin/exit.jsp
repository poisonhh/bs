<%@ page language="java" pageEncoding="utf-8"%>
<html>
  <head>
  	 <%
   	request.getSession().removeAttribute("ADMIN");
   	request.getSession().removeAttribute("stu");
   %>
   <script>
   		window.location.href="<%=request.getContextPath()%>/index.jsp"; 
   </script>
  </head>
  
  <body>
  
  </body>
</html>
