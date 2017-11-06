<%-- 
    Document   : soinsu
    Created on : 2017/11/01, 23:26:43
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
        <h1>Hello World!</h1>
    </body>
</html>

<%
        request.setCharacterEncoding("UTF-8");

            int a = Integer.parseInt(request.getParameter("sum"));

            int b = 2;

            System.out.println(a+"<br>");

            while (a != 1) {
                if (a % b == 0) {
                    a /= b;
                    System.out.println("素因数" + b + "<br>" + a +"<br>");
                } else {
                    b++;
                }
            }
            
        %>