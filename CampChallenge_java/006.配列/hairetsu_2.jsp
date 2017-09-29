<%-- 
    Document   : java kiso 1jsp
    Created on : 2017/09/21, 21:03:08
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
    <%
    String[] date={"10","100","soeda","hayashi","-20","110","end"};
     date[2]="33";
     out.println(date[0]);
     out.println(date[1]);
     out.println(date[2]);
     out.println(date[3]);
     out.println(date[4]);
     out.println(date[5]);
     out.println(date[6]);
     
     
     
     
     
    %>
</html>
