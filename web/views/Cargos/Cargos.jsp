<%-- 
    Document   : Cargos
    Created on : 04-22-2021, 11:43:29 PM
    Author     : J_Antonio526019
--%>

<%@page import="java.util.Iterator"%>
<%@page import="model.Cargo"%>
<%@page import="java.util.List"%>
<%@page import="modelDAO.CargosDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<jsp:include page="../shared/header.jsp"></jsp:include>

<h2>Cargos</h2>

<a href="CargosController?accion=Crear Cargos" type="button" class="btn btn-success m-b-10">
    Crear</a>

    <table class="table table-bordered" id="datatable">
        <thead class="thead-dark">
            <tr>
                <th>Id</th>
                <th>Cargo</th>
                <th>Es Activo?</th>
                <th>Acciones</th>
            </tr>
        </thead>
        
        <%
        CargosDAO dao = new CargosDAO();
        List<Cargo> list = dao.Listar();
        Iterator<Cargo> ite = list.iterator();
        
        Cargo ca = null;
        while (ite.hasNext()) {
            ca = ite.next();
        %>
        
        <tbody>
            <tr>
                <td><%=ca.getCargo_Id()%></td>
                <td><%=ca.getCargo_Descripcion()%></td>
                <td><%=ca.getEsActivo() == true?"Activo":"Inactivo" %></td>
                <td>
                    <button class="btn btn-primary">Editar</button>
                    <button class="btn btn-danger">Eliminar</button>
                </td>
            </tr>
            <% }%>
        </tbody>
        
    </table>

            <script>
                $(document).ready( function () {
                 $('#datatable').DataTable();
                   } );
            </script>
            
<jsp:include page="../shared/footer.jsp"></jsp:include>

