<%-- 
    Document   : Query String
    Created on : 2017/11/01, 11:45:09
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
</html>

<%
    request.setCharacterEncoding("UTF-8");
    
    int type = Integer.parseInt(request.getParameter("A"));//雑貨・生鮮食品・その他
    
    int num = Integer.parseInt(request.getParameter("B"));//数量
    
    String a = "点";
    
    int sum = 1500; //総額は１５００円
    
    int ikko  =  sum / num; //一個あたりの数量を計算
    
    switch(type){
        
        case 1 : 
            System.out.println("雑貨"+num+a);
            break;
            
        case 2 :
            System.out.println("生鮮食品"+num+a);
            break;
            
        case 3 :
            System.out.println("その他"+num+a);
            break;       
            
    }
    System.out.println(ikko+"が"+num+"点");
    
    System.out.println("合計で"+num+"です");
    
    double point = num * 0.04;
    
    double point2 = num * 0.05;
    
    if(num>3000){
        System.out.println(point+"ポイントになります。");
    }else if(num>5000){    
        System.out.println(point2+"ポイントになります。");
        
    }else{
        System.out.println("３０００円以上でポイントが加算されます。");
    }
    
    %>