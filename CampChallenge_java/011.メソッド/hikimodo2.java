/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kinu
 */
@WebServlet(name = "hikimodo2", urlPatterns = {"/hikimodo2"})
public class hikimodo2 extends HttpServlet {
    String[]data(int ID){
    String[]pro1 ={"001","kinu","1992/09/27",null};
    String[]pro2 ={"003","sugi","1992/12/14","浜松"};
    String[]pro3 ={"005","higa","1993/02/16","豊橋"};
    if(ID==0){
        return pro1;
    }else if(ID==1){
        return pro2;
    }else if(ID==2){
        return pro3;
    }else{
        return null;
    }
    
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet hikimodo1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet hikimodo1 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
            for(int i=0;i<=2;i++){
                String[]profile=data(i);
            for(int i2=1;i2<=3;i2++){
                if(profile[i2]==null){
                    continue;
                }else{
                out.println(profile[i2]);
                }
            }
//            for(int i=1; i<4; i++){
//            out.print(profile[i]);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
