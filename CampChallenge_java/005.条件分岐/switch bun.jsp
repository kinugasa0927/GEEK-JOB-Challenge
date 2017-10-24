<%-- 
    Document   : newjsp
    Created on : 2017/09/24, 14:58:19
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
    
    int num;
    num=3;
    switch(num){
        case 1:
        out.print("one");
        break;
        case 2:
            out.print("two");
            break;
        default:
            out.print("想定外");
        
                
    }
    %>
