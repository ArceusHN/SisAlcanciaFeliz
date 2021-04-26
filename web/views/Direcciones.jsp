<%-- 
    Document   : direccionesIndex
    Created on : 04-23-2021, 12:53:38 AM
    Author     : DELL 6420
--%>

<%@page import="java.util.Iterator"%>
<%@page import="model.Direcciones"%>
<%@page import="java.util.List"%>
<%@page import="modelDAO.DireccionesDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <jsp:include page="./shared/header.html"></jsp:include>
 
 <h2>Direcciones</h2>
 <table class="table table-bordered">
        <thead class="thead-dark">
         <tr>
             <th>Id</th>
             <th>Direccion</th>
             <th>Municipio</th>
             <th>Departamento</th>
             <th>Estado</th>
             <th>Acciones</th>
         </tr>
     </thead>
     <% 
                DireccionesDAO dao = new DireccionesDAO();
                List<Direcciones> list = dao.listar();
                Iterator<Direcciones> iter = list.iterator();
                Direcciones dr = null;
                while (iter.hasNext()) {
                        dr = iter.next();
                        
                    
            %>
     <tbody>
         <tr>
             <td><%= dr.getDirec_Id()%></td>
             <td><%= dr.getDirec_Descripcion()%></td>
             <td><%= dr.getMpio_Descripcion()%></td>
             <td><%= dr.getDepto_Descripcion()%></td>
             <td><%= dr.getEsActivo()%></td>
             <td>
                    <button class="btn btn-primary">Editar</button>
                    <button class="btn btn-danger">Eliminar</button>
             </td>
         </tr>
         <%}%>
     </tbody>
 </table>

                                       
   <jsp:include page="./shared/footer.html"></jsp:include>

