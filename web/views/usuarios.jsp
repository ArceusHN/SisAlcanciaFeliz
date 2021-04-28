<%-- 
    Document   : usuarios
    Created on : 22/04/2021, 03:17:55 PM
    Author     : Lenovo
--%>

<%@page import="java.util.Iterator"%>
<%@page import="model.Usuarios"%>
<%@page import="java.util.List"%>
<%@page import="modelDAO.UsuariosDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
        
        <jsp:include page="./shared/header.jsp"></jsp:include>
        
        <h3>Usuarios</h3>
        <table class="table table-bordered">
            <thead class="thead-dark">
                <tr>
                    <th>Id</th>
                    <th>Usuario</th>
                    <th>Rol</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <%
                UsuariosDAO dao = new UsuariosDAO();
                List<Usuarios> list = dao.listar();
                Iterator<Usuarios> iter = list.iterator();
                Usuarios us = null;
                    while (iter.hasNext()){
                        us = iter.next();
                    
            %>
            
            <tbody>
                <tr>
                    <td><%=us.getUsu_Id()%></td>
                    <td><%=us.getUsu_Usuario()%></td>
                    <td><%=us.getRol_Descripcion()%></td>
                    <td>
                        <button class="btn btn-primary">Editar</button>
                        <button class="btn btn-danger">Eliminar</button>
                    </td>
                </tr>
                <% } %>
            </tbody>
        </table>
    

        <jsp:include page="./shared/footer.jsp"></jsp:include>