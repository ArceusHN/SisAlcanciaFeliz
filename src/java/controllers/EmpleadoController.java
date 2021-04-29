/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.Empleados;
import modelDAO.EmpleadosDAO;


/**
 *
 * @author DELL
 */
@WebServlet(name = "EmpleadoController", urlPatterns = {"/EmpleadoController"})
@MultipartConfig
public class EmpleadoController extends HttpServlet {
    
     String listar="views/Empleados/Empleados.jsp";
 String crear="views/Empleados/CreateEmpleados.jsp"; 
 String editar="views/Empleados/EditEmpleados.jsp";
 int id=0;

    EmpleadosDAO dao= new EmpleadosDAO();
    Empleados emp = new Empleados();   
    private final static Logger LOGGER = 
            Logger.getLogger(EmpleadoController.class.getCanonicalName());
    
    
private static final String SAVE_DIR = "FotosEmpleados";

    
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
            out.println("<title>Servlet EmpleadoController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EmpleadoController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        
        // Create path components to save the file
   
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
       String acceso=" ";
       String action=request.getParameter("accion");
    
       if(action.equalsIgnoreCase("Listar Empleados")){
           acceso=listar;
       }
       else if(action.equalsIgnoreCase("Crear Empleados")){
           acceso=crear;
       }

       else if(action.equalsIgnoreCase("Modificar Empleados")){
           request.setAttribute("idEmpleado", request.getParameter("id"));
           acceso=editar;
       }
       
        else if(action.equalsIgnoreCase("Actualizar")){
     String identidad= request.getParameter("Identidad");
     String file= request.getParameter("file");     
    
     int ide= Integer.parseInt(request.getParameter("txtid"));
     String sexo=request.getParameter("Sexo"); 
     String ec=request.getParameter("EstadoCivil");
     String suc=request.getParameter("Sucursal"); 
     String car=request.getParameter("Cargo");
     String pnombre=request.getParameter("PrimerNombre");
     String snombre=request.getParameter("SegundoNombre");
     String papellido=request.getParameter("PrimerApellido");
     String sapellido=request.getParameter("SegundoApellido");
     String fechanac=request.getParameter("FechaNacimiento");
     String fechain=request.getParameter("FechaIngreso");
     String tel=request.getParameter("Telefono");
     String Direccion=request.getParameter("Direccion");
     
     emp.setEmp_Id(ide);
 emp.setEmp_Direccion(Direccion);
  emp.setEmp_Identidad(identidad);
 
 int sex=Integer.parseInt(sexo);
     if(sex==1){
         emp.setEmp_Sexo("M");
     }else if(sex==2){
         emp.setEmp_Sexo("F");
     }
     emp.setEmp_Foto(file);
            emp.setEmp_PrimerNombre(pnombre);
            emp.setEmp_SegundoApellido(sapellido);
            emp.setEmp_PrimerApellido(papellido);
            emp.setEmp_SegundoNombre(snombre);
            emp.setEmp_FechaNac(fechanac);
            emp.setEmp_FechaIngreso(fechain);
            emp.setEmp_Telefono(tel);
            
            emp.setEmp_Ec(ec);
           
            emp.setEmp_Cargo(car);
            emp.setSucursal(suc);
            emp.setUsuario_Modifica("1");
            
            dao.edit(emp);
            acceso=listar;
       }
       
       RequestDispatcher vista=request.getRequestDispatcher(acceso);
       vista.forward(request,response);
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
//        processRequest(request, response);
 String acceso=" ";
       String action=request.getParameter("action");

if(action.equalsIgnoreCase("Agregar")){
     String identidad= request.getParameter("Identidad");
     String sexo=request.getParameter("Sexo"); 
     String ec=request.getParameter("EstadoCivil");
     String suc=request.getParameter("Sucursal"); 
     String car=request.getParameter("Cargo");
     String pnombre=request.getParameter("PrimerNombre");
     String snombre=request.getParameter("SegundoNombre");
     String papellido=request.getParameter("PrimerApellido");
     String sapellido=request.getParameter("SegundoApellido");
     String fechanac=request.getParameter("FechaNacimiento");
     String fechain=request.getParameter("FechaIngreso");
     String tel=request.getParameter("Telefono");
      
     int sex=Integer.parseInt(sexo);
     if(sex==1){
         emp.setEmp_Sexo("M");
     }else if(sex==2){
         emp.setEmp_Sexo("F");
     }

     


    
     
     
     
     
     String Direccion=request.getParameter("Direccion");
 emp.setEmp_Direccion(Direccion);
            emp.setEmp_Identidad(identidad);
     
//             final String path = "C:\\Users\\DELL\\Desktop\\SisAlcanciaFeliz\\build\\web\\FotosEmpleados";

 final String path= request.getServletContext().getRealPath("");
    final Part filePart = request.getPart("file");
    final String fileName = emp.getEmp_Identidad()+".jpg";
emp.setEmp_Foto("FotosEmpleados" + File.separator
                + fileName);
    OutputStream out = null;
    InputStream filecontent = null;
    final PrintWriter writer = response.getWriter();

    
    try {
        out = new FileOutputStream(new File(path + File.separator+"FotosEmpleados" + File.separator
                + fileName));
        filecontent = filePart.getInputStream();

        int read = 0;
        final byte[] bytes = new byte[1024];

        while ((read = filecontent.read(bytes)) != -1) {
            out.write(bytes, 0, read);
        }
//        writer.println("New file " + fileName + " created at " + path);
//        LOGGER.log(Level.INFO, "File{0}being uploaded to {1}", 
//                new Object[]{fileName, path});
 emp.setEmp_PrimerNombre(pnombre);
            emp.setEmp_SegundoApellido(sapellido);
            emp.setEmp_PrimerApellido(papellido);
            emp.setEmp_SegundoNombre(snombre);
            emp.setEmp_FechaNac(fechanac);
            emp.setEmp_FechaIngreso(fechain);
            emp.setEmp_Telefono(tel);
            
            emp.setEmp_Ec(ec);
           
            emp.setEmp_Cargo(car);
            emp.setSucursal(suc);
            emp.setUsuario_Crea("1");

            dao.add(emp);
           acceso=listar;
       
       RequestDispatcher vista=request.getRequestDispatcher(acceso);
       vista.forward(request,response);

    } catch (FileNotFoundException fne) {
        writer.println("You either did not specify a file to upload or are "
                + "trying to upload a file to a protected or nonexistent "
                + "location.");
        writer.println("<br/> ERROR: " + fne.getMessage());

        LOGGER.log(Level.SEVERE, "Problems during file upload. Error: {0}", 
                new Object[]{fne.getMessage()});
    } finally {
        if (out != null) {
            out.close();
        }
        if (filecontent != null) {
            filecontent.close();
        }
        if (writer != null) {
            writer.close();
        }
        
    }
    
            
} 
          // gets absolute path of the web application
//		String appPath = request.getServletContext().getRealPath("");
		// constructs path of the directory to save uploaded file
//		String savePath = System.getProperty("java.io.tmpdir")+File.separator + SAVE_DIR;
//
//		// creates the save directory if it does not exists
//		File fileSaveDir = new File(savePath);
//		if (!fileSaveDir.exists()) {
//			fileSaveDir.mkdir();
//		}
//
//		Part part = request.getPart("file");
//			String fileName =  extractFileName(part);;
//			// refines the fileName in case it is an absolute path
//			fileName = new File(fileName).getName();
////			part.write(fileName);
//                        
//                        File file = new File(request.getServletContext().getRealPath("")+ File.separator + SAVE_DIR+ File.separator+fileName);
//                        file.getParentFile().mkdirs();
//                        FileWriter writer = new FileWriter(file);
//                      
//		
//   
  
//InputStream inputStream = null;
//
//Part filePart = request.getPart("file");
//        if (filePart != null) {
//            // prints out some information for debugging
//            System.out.println(filePart.getName());
//            System.out.println(filePart.getSize());
//            System.out.println(filePart.getContentType());
//             
//            // obtains input stream of the upload file
//            inputStream = filePart.getInputStream();
//        }
//
//         emp.setEmp_Fot(inputStream);
            
           
       
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

    private String extractFileName(Part part) {
		String contentDisp = part.getHeader("content-disposition");
		String[] items = contentDisp.split(";");
		for (String s : items) {
			if (s.trim().startsWith("filename")) {
				return s.substring(s.indexOf("=") + 2, s.length()-1);
			}
		}
		return "";
	}
}
