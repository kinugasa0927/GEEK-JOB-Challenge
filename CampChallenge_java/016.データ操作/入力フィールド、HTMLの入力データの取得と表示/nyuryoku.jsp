<%-- 
    Document   : nyuryoku
    Created on : 2017/10/31, 12:59:29
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
      <br>
      <form action="./test.jsp" method="post">
      名前
      <input type="text" name="name">
      <br>
      <br>
      男
      <input type="radio" name="gender">
      女
      <input type="radio" name="woman">
      趣味
      <textarea name="hobby"></textarea>
      
      <br>
      <input type="submit" name="submit" value="送信">
      <input type="reset" name="reset">
      
      </form>
    </body>
</html>
