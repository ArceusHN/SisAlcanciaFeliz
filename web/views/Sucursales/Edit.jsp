<%-- 
    Document   : Edit
    Created on : 04-27-2021, 10:59:06 PM
    Author     : J_Antonio526019
--%>


<%@page import="model.Sucursales"%>
<%@page import="modelDAO.SucursalesDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="modelDAO.DireccionesDAO"%>
<%@page import="model.Direcciones"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.Statement"%>
<%@page import="config.Conexion"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <jsp:include page="../shared/header.html"></jsp:include>

<!DOCTYPE html>
    <%
        SucursalesDAO dao2 = new SucursalesDAO();
        int idSucu = Integer.parseInt((String)request.getAttribute("SucursalId"));
        Sucursales su = dao2.list(idSucu);
        
    %>
    <h1>Editar Sucursal</h1>
    <form action="SucursalesController">
        <input type="hidden" name="txtId" value="<%=su.getSuc_Id()%>">

    Sucursal:
    <input type="text" name="txtSucursal" value="<%=su.getSuc_Descripcion()%>">
    <br>
    <br>
    Telefono:
    <input type="text" maxlength="8" name="txtTelefono" value="<%=su.getSuc_Telefono()%>">
    <br>
    <br>
    
    <label style="margin-right: 50px;">Direcciones</label>
    <select class="form-control" style="width: 250px" name="txtDireccion" value="<%=su.getDirec_Descripcion()%>">
        <option value="0">Seleccione</option>
        <%
                DireccionesDAO dao = new DireccionesDAO();    
                List<Direcciones> list = dao.listar();
                Iterator<Direcciones> iter = list.iterator();
                Direcciones dir = null;
                while(iter.hasNext()){
                    dir = iter.next();
        %>
        <option value=<%=dir.getDirec_Id()%>><%=dir.getDirec_Descripcion()%></option>
        
          <%} %>
    </select>

    <br>
        <input type="submit" name="accion" value="Actualizar">    
</form>