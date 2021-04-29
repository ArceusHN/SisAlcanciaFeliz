<%-- 
    Document   : Create
    Created on : 04-25-2021, 11:19:35 PM
    Author     : J_Antonio526019
--%>

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
<h3>Agregar sucursal</h3>
<div class="m-l-10 m-r-10 m-t-10 m-b-15">
    <br>
    <form action="SucursalesController">

        <label style="margin-right: 50px;">Sucursal</label>
        <input class="form-control" type="text" name="txtSucursal">
         <br>
        <label style="margin-right: 50px;">Telefono:</label>
        <input class="form-control" type="text" maxlength="8" name="txtTelefono">
        <br>
        <label style="margin-right: 50px;">Direcciones</label>
        <select class="form-control" style="width: 250px" name="txtDireccion">
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
            <input class="btn btn-primary" type="submit" name="accion" value="Agregar">    
    </form>
</div>


 <jsp:include page="../shared/footer.html"></jsp:include>
