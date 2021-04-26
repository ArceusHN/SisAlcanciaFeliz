<%-- 
    Document   : TipoTransacciones
    Created on : 24-abr-2021, 22:24:51
    Author     : marit
--%>

<%@page import="model.TipoTransacciones"%>
<%@page import="model.TipoTransacciones"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="modelDAO.TipoTransaccionesDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="./shared/header.html"></jsp:include>
 
<h2>Tipo de transacciones</h2>
    <table border="1" class="table table-bordered ">
                <thead class="thead-dark">
                    <tr>
                        <th>Id</th>
                        <th>Tipo de Transaccion</th>
                        <th>EsActivo?</th>
                        <th>Acciones</th>
                    </tr>
                </thead>

                    <%
                        TipoTransaccionesDAO dao = new TipoTransaccionesDAO();
                        List<TipoTransacciones> list = dao.listar();
                        Iterator<TipoTransacciones> iter = list.iterator();
                        TipoTransacciones pre = null;
                        while (iter.hasNext()) {
                               pre = iter.next();
                     %>

                <tbody>

                        <td><%=pre.getTtransac_Id()%></td>
                        <td><%=pre.getTtransac_Descripcion()%></td>
                        <td><%=pre.getEsActivo()== true?"Activo":"Inactivo"%></td>
                        <td>
                        <button class="btn btn-primary">Editar</button>
                        <button class="btn btn-danger">Eliminar</button>

                        </td>


                    <% }%>
                </tbody>
            </table>
                                       
   <jsp:include page="./shared/footer.html"></jsp:include>
