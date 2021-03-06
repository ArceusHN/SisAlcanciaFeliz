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
import modelDAO.RolPantallasDAO;
import modelDAO.UsuariosDAO;

/**
 *
 * @author Omar Fer
 */
@WebServlet(name = "AccessController", urlPatterns = {"/AccessController"})
public class AccessController extends HttpServlet {
    String Login = "Access/Login.jsp", Index = "views/index.jsp";
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
            out.println("<title>Servlet AccessController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AccessController at " + request.getContextPath() + "</h1>");
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
        
        String usuario = request.getParameter("txtUsuario"),
                contra = request.getParameter("txtContra");
        
        try{
            UsuariosDAO UsuDao = new UsuariosDAO();
            RolPantallasDAO RolPanDao = new RolPantallasDAO();
            Usuarios usuLogin = UsuDao.login(usuario, contra);
            
            String pantallas = RolPanDao.listarxRol(usuLogin.getRol_Id());
            
            if( usuLogin != null){
                request.getSession().setAttribute("CURRENT USER", usuLogin);
                request.getSession().setAttribute("Pantallas", pantallas);
                
                
                response.sendRedirect(Index);
                
            }else{
                request.setAttribute("err", "Usuario o contrase??a incorrectos");
                response.sendRedirect(Login);
            }
                
        }
        catch(Exception e){
            //request.setAttribute("err", "System error" + e.getMessage());
            //RequestDispatcher vista = request.getRequestDispatcher(Login);
            //vista.forward(request, response);
        }
        
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
