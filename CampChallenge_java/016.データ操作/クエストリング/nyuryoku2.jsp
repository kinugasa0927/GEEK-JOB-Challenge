<%-- 
    Document   : nyuryoku2
    Created on : 2017/10/31, 13:15:22
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
        
    <form action="./Query String.jsp" method="get">    
    
    <br>
    
    雑貨<input type="radio" name="A" value="1"><br><br>

    生鮮食品<input type="radio" name="A" value="2"><br><br>

    その他<input type="radio" name="A" value="3"><br><br>

    数量<input type="text" name="B"><br><br>
    
    <input type="submit" name="submit" value="決定">
    
    </form>
        
        
    </body>
</html>

