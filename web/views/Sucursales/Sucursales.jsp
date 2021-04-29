


<%@page import="java.util.Iterator"%>
<%@page import="model.Sucursales"%>
<%@page import="java.util.List"%>
<%@page import="modelDAO.SucursalesDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<jsp:include page = "../shared/header.jsp"></jsp:include>
<h2>Sucursales</h2>

<a href="SucursalesController?accion=Crear Sucursales" type="button" class="btn btn-success m-b-10">
    Crear</a> 

<table class ="table table-bordered" border="1">
    <thead class = "thead-dark">
        <tr>
            <th>Id</th>
            <th>Descripcion</th>
            <th>Telefono</th>
            <th>Direccion</th>
            <th>Es Activo?</th>
            <th>Acciones</th>
        </tr>
    </thead>
    
    <%
        SucursalesDAO dao = new SucursalesDAO();
        List<Sucursales>list = dao.listar();
        Iterator<Sucursales> iter = list.iterator();
        Sucursales sc = null;
        
            while (iter.hasNext()) {
                    sc = iter.next();
                    
                
        
    %>
    
    <tbody>
        <tr>
            <td><%=sc.getSuc_Id()%></td>
            <td><%=sc.getSuc_Descripcion()%></td>
            <td><%=sc.getSuc_Telefono()%></td>
            <td><%=sc.getDirec_Descripcion()%></td>
            <td><%=sc.isEsActivo() == true?"Activo":"Inactivo" %></td>
            <td>
                <button class = "btn btn-primary">Editar</button>
                <button class = "btn btn-danger">Eliminar</button>
            </td>
        </tr>
        <%   }   %>
    </tbody>
</table>

<jsp:include page = "../shared/footer.jsp"></jsp:include>



