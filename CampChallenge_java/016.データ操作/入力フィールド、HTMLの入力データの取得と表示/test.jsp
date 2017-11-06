<%-- 
    Document   : test
    Created on : 2017/11/01, 13:38:42
    Author     : kinu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1></h1>
    </body>
</html>

<%

request.setCharacterEncoding("UTF-8");

out.print(request.getParameter("name"));

out.print(request.getParameter("gender"));

out.print(request.getParameter("hobby"));

%>