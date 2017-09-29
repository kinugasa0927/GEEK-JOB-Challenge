<%-- 
    Document   : test1
    Created on : 2017/09/14, 13:36:45
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
        <h1>
        </h1>
    </body>
</html>
<%
    long total=8;
    for(long i=0; i<20; i++){
    total=total*8;
    out.println(total);
}
%>
