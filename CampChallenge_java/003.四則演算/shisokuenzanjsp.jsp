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
        final int suji=10;
        int num=3;
        int tasu=suji+num;
        out.println (tasu);
        int hiku=suji-num;
        out.println (hiku);
        int kake=suji*num;
        out.println (kake);
        int wari=suji/num;
        out.println (wari);
        %>
</html>
