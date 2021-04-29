<%-- 
    Document   : Edit
    Created on : 04-27-2021, 10:34:50 AM
    Author     : J_Antonio526019
--%>

<%@page import="model.Cargo"%>
<%@page import="modelDAO.CargosDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="../shared/header.html"></jsp:include>
<!DOCTYPE html>
    <h1>Editar Cargo</h1>

<%
    CargosDAO daocar = new CargosDAO();
    int idCa = Integer.parseInt((String)request.getAttribute("IdCargo"));
    Cargo cargo = (Cargo)daocar.List(idCa);
%>
<form action="CargosController">
    Cargo:
    <input type="text" name="txtCargos" value="<%=cargo.getCargo_Descripcion()%>">
    <input type="hidden" name="txtId" value="<%=cargo.getCargo_Id()%>">
    
    <input type="submit" name="accion" value="Actualizar">

</form>
<jsp:include page="../shared/footer.html"></jsp:include>