<%-- 
    Document   : Cuentas
    Created on : 04-26-2021, 10:24:58 AM
    Author     : Omar Fer
--%>

<%@page import="modelDAO.CuentasDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="model.Cuenta"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<jsp:include page="./shared/header.html"></jsp:include>

        <h2>Cuentas</h2>
        <table class="table table-bordered">
                    <thead class="thead-dark">
                        <tr>
                            <th>ID Cuenta</th>
                            <th>Nro. de Cuenta</th>
                            <th>Fecha de apertura</th>
                            <th>Cliente</th>
                            <th>Tipo de Cuenta</th>
                            <th>Saldo</th>
                            <th>Estado</th>
                            <th>Acciones</th>
                        </tr>
                    </thead>
                    
                         <%
                        CuentasDAO dao = new CuentasDAO();
                        List<Cuenta> list = dao.Listar();
                        Iterator<Cuenta> ite = list.iterator();

                        Cuenta cta = null;
                        while (ite.hasNext()) {
                            cta = ite.next();
                        %>  
                    <tbody>
                        <tr>
                            <td><%=cta.getCta_Id()%></td>
                            <td><%=cta.getCta_NroCuenta()%></td>
                            <td><%=cta.getCta_FechaApertura()%></td>
                            <td><%=cta.getCli_Nombre()%></td>
                            <td><%=cta.getTcta_Descripcion()%></td>
                            <td>L.<%=cta.getCta_Saldo()%></td>
                            <td><%=cta.getEsActivo() == true?"Activo":"Inactivo" %></td>
                               <td class="d-flex" >
                                <button class="btn btn-primary">Editar</button>&nbsp;
                                <button class="btn btn-danger">Eliminar</button>
                            
                            </td>
                        </tr>
                        <% }%>
                    </tbody>
        </table>

<jsp:include page="./shared/footer.html"></jsp:include>
