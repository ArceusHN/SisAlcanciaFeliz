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
import model.Cliente;
import modelDAO.ClientesDAO;
import static org.hibernate.validator.internal.util.privilegedactions.ConstructorInstance.action;

/**
 *
 * @author mancia
 */
@WebServlet(name = "ClientesCRUDController", urlPatterns = {"/ClientesController"})
public class ClientesController extends HttpServlet {

    String listar = "views/Clientes/Clientes.jsp";
    String crear = "views/Clientes/ClientesCreate.jsp";
    ClientesDAO dao = new ClientesDAO();
    Cliente ci = new Cliente();
    
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
            out.println("<title>Servlet ClientesCRUDController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ClientesCRUDController at " + request.getContextPath() + "</h1>");
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
      
        String acceso = "";
        String action = request.getParameter("accion");
        
        if(action.equalsIgnoreCase("Listar Clientes"))
        {
            acceso = listar;
            
        }else if(action.equalsIgnoreCase("Crear Clientes"))
        {
            acceso = crear;
        }else if(action.equalsIgnoreCase("agregar"))
        {
            String identidad = request.getParameter("txtidentidad");
            ci.setCli_Identidad(identidad);
            dao.add(ci);
            
            String PrimerNombre = request.getParameter("txtprimernombre");
            ci.setCli_PrimerNombre(PrimerNombre);
            dao.add(ci);
            
            String SegundoNombre = request.getParameter("txtsegundonombre");
            ci.setCli_SegundoNombre(SegundoNombre);
            dao.add(ci);
            
            String PrimerApellido = request.getParameter("txtprimerapellido");
            ci.setCli_PrimerApellido(PrimerApellido);
            dao.add(ci);
            
            String SegundoApellido = request.getParameter("txtsegundoapellido");
            ci.setCli_SegundoApellido(SegundoApellido);
            dao.add(ci);
            
            String FechaNacimiento = request.getParameter("txtfechanacimiento");
            ci.setCli_FechaNac(FechaNacimiento);
            dao.add(ci);
            
            String FechaIngreso = request.getParameter("txtfechaingreso");
            ci.setCli_FechaIngreso(FechaIngreso);
            dao.add(ci);
            
            String Telefono = request.getParameter("txttelefono");
            ci.setCli_Telefono(Telefono);
            dao.add(ci);
            
            String Sexo = request.getParameter("txtsexo");
            ci.setCli_Sexo(Sexo);
            dao.add(ci);
            
            String EstadoCivil = request.getParameter("txtestadocivil");
            ci.setEsciv_Id(EstadoCivil);
            dao.add(ci);
            
            String Direccion = request.getParameter("txtdireccion");
            ci.setDirec_Id(Direccion);
            dao.add(ci);
            
            ci.setUsu_Crea("1");
            dao.add(ci);
            
            acceso = listar;
        }
        
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
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
