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
    </body>
    <%@ page import="java.util.HashMap"%>
    <%
      HashMap<String,String> prof= 
       new HashMap<String,String>();
      
       prof.put("1","AAA");
       out.println("1:"+prof.get("1"));
       
       prof.put("hello","world");
       out.println("hello "+prof.get("hello"));
       
       prof.put("soeda","33");
       out.println("soeda "+prof.get("soeda"));
       
       prof.put("20","20");
       out.println("20 "+prof.get("20"));
        
        %> 
</html>
