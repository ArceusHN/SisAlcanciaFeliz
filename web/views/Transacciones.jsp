<%-- 
    Document   : Content
    Created on : 04-22-2021, 05:35:14 PM
    Author     : Omar Fer
--%>
<%@page import="modelDAO.TransaccionesDAO"%>
<%@page import="model.Transacciones"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <jsp:include page="./shared/header.jsp"></jsp:include>
 
    <h2>Transacciones</h2>
    <table class="table table-bordered">
                <thead class="thead-dark">
                    <tr>
                        <th>Fecha Transaccion</th>
                        <th>Monto</th>
                      <!--  <th>Saldo Actual</th> -->
                        <th>Transaccion</th>
                        <th>Nro. Cuenta</th>
                        <th>Cliente</th>
                        <!-- <th>Identidad Emp.</th> -->
                        <th>Empleado</th>
                        <th>Sucursal</th>
                        <th>Direccion</th>
                        <th>EsActivo?</th>
                        <th>Acciones</th>
                    </tr>
                </thead>

                    <%
                        TransaccionesDAO dao = new TransaccionesDAO();
                        List<Transacciones> list = dao.listar();
                        Iterator<Transacciones> iter = list.iterator();
                        Transacciones pre = null;
                        while (iter.hasNext()) {
                               pre = iter.next();
                     %>

                <tbody>

                        <td><%=pre.getTransac_Fecha()%></td>
                        <td>L.<%=pre.getTransac_Monto()%></td>
                        <!-- <td><%=pre.getTransac_SaldoActual()%></td>-->
                        <td><%=pre.getTtransac_Descripcion()%></td>
                        <td><%=pre.getCta_NroCuenta()%></td>
                        <td><%=pre.getCliente()%></td>
                        <!-- <td><%=pre.getEmp_Identidad()%></td> -->
                        <td><%=pre.getEmpleado()%></td>
                        <td><%=pre.getSuc_Descripcion()%></td>
                        <td><%=pre.getDirec_Descripcion()%></td>
                        <td><%=pre.getEsActivo()== true?"Activo":"Inactivo"%></td>
                        <td class="d-flex">
                            <button class="btn btn-primary">Editar</button>&nbsp;
                            <button class="btn btn-danger">Eliminar</button>
                        </td>


                    <% }%>
                </tbody>
            </table>
                                       
   <jsp:include page="./shared/footer.jsp"></jsp:include>
