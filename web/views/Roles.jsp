
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="model.Roles"%>
<%@page import="modelDAO.RolesDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

 <jsp:include page="./shared/header.html"></jsp:include>
 
    <div width="100%" style="text-align: center">
        <h1>Roles</h1>
    </div>
    
        <table class="table table-bordered">
            <thead class="thead-dark">
                <tr>
                    <th>Id</th>
                    <th>Rol</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <%
             RolesDAO dao= new RolesDAO();
             List<Roles>list = dao.listar();
             Iterator<Roles>iter= list.iterator();
             Roles ec= null;
             
             while(iter.hasNext()){
               ec=iter.next();

            %>
            <tbody>
                <tr>
                    <td><%=ec.getRol_Id() %></td>
                    <td><%=ec.getRol_Nombre() %></td>
                    <td>
                        <button class="btn btn-primary">Editar</button>
                        <button class="btn btn-danger">Eliminar</button>
                    </td>
                </tr>
                <% } %>
            </tbody>
        </table>

        <jsp:include page="./shared/footer.html"></jsp:include>