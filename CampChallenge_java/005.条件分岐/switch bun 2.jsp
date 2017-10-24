<%-- 
    Document   : newjsp
    Created on : 2017/09/24, 15:24:06
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
    
    char moji;
    moji ='A';
    switch(moji){
        case 'A':
        out.print("英語");
        break;
        case 'あ':
            out.print("日本語");
            break;
        
                
    }
    %>
