package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Sucursales;
import modelDAO.SucursalesDAO;

/**
 *
 * @author J_Antonio526019
 */
@WebServlet(name = "SucursalesController", urlPatterns = {"/SucursalesController"})
public class SucursalesController extends HttpServlet {
    String listar = "views/Sucursales/Sucursales.jsp";
    String crear = "views/Sucursales/Create.jsp";
    String editar = "views/Sucursales/Edit.jsp";
    int id = 0;
    
    Sucursales su = new Sucursales();
    SucursalesDAO dao = new SucursalesDAO();

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
            out.println("<title>Servlet SucursalesController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SucursalesController at " + request.getContextPath() + "</h1>");
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
            String acceso ="";
            String action = request.getParameter("accion");
            
            if(action.equalsIgnoreCase("Listar Sucursales"))
            {
                acceso = listar;

            }
            else if(action.equalsIgnoreCase("Crear Sucursales"))
            {
                acceso = crear;

            }
            else if(action.equalsIgnoreCase("Agregar"))
            {
                String sucur = request.getParameter("txtSucursal");
                String tel = request.getParameter("txtTelefono");
                String direc = request.getParameter("txtDireccion");
                su.setSuc_Descripcion(sucur);
                su.setSuc_Telefono(tel);
                su.setDirec_Descripcion(direc);
                dao.add(su);
                
                acceso = listar;
            }
            else if(action.equalsIgnoreCase("editar"))
            {
                request.setAttribute("SucursalId", request.getParameter("id"));
                acceso = editar;

            }
            else if(action.equalsIgnoreCase("Actualizar"))
            {
                id = Integer.parseInt(request.getParameter("txtId"));
                String sucur = request.getParameter("txtSucursal");
                String tel = request.getParameter("txtTelefono");
                String direc = request.getParameter("txtDireccion");
                
                su.setSuc_Id(id);
                su.setSuc_Descripcion(sucur);
                su.setSuc_Telefono(tel);
                su.setDirec_Descripcion(direc);
                dao.edit(su);
                
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
