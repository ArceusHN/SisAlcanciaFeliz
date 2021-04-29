/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuarios;
import modelDAO.UsuariosDAO;

/**
 *
 * @author Omar Fer
 */
@WebServlet(name = "UsuariosController", urlPatterns = {"/UsuariosController"})
public class UsuarioController extends HttpServlet {
              String listar= "views/Usuarios/usuarios.jsp";
              String crear= "views/Usuarios/usuarios.jsp";
              UsuariosDAO dao= new UsuariosDAO();
              Usuarios user= new Usuarios();
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
            out.println("<title>Servlet UsuariosController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UsuariosController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        
         String acceso="";
        String action=request.getParameter("accion");
        
        if(action.equalsIgnoreCase("Listar Usuarios")){
        acceso=listar;
        
        }else if(action.equalsIgnoreCase("Crear Usuarios")){
        String usuario = request.getParameter("txtUsuario");
        String password = request.getParameter("txtContra");
        String rol=(String)request.getParameter("ddlRol");
        
        user.setUsu_Usuario(usuario);
         user.setUsu_Contra(password);
          user.setRol_Id(Integer.parseInt(rol));
          
          dao.add(user);
           acceso=listar;
        };
        
        RequestDispatcher vista= request.getRequestDispatcher(acceso);
        vista.forward(request, response);
        
       // processRequest(request, response);
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