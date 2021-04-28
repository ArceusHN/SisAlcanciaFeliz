<%-- 
    Document   : Content
    Created on : 04-22-2021, 05:35:14 PM
    Author     : Omar Fer
--%>



<%@page import="modelDAO.PrestamosDAO"%>
<%@page import="model.Prestamos"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <jsp:include page="./shared/header.jsp"></jsp:include>
    
    <h2>Prestamos</h2>
    
   <table class="table table-bordered">
                <thead class="thead-dark">
                    <tr>
                        <th>Id</th>
                        <th>Prestamo</th>
                        <th>Tasa Porcentaje</th>
                        <th>Nro de Cuenta</th>
                        <th>Cliente</th>
                        <th>Tipo Cuenta</th>
                        <th>Plazo</th>
                        <th>Es Activo?</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                
                    <%
                        PrestamosDAO dao = new PrestamosDAO();
                        List<Prestamos> list = dao.listar();
                        Iterator<Prestamos> iter = list.iterator();
                        Prestamos pre = null;
                        while (iter.hasNext()) {
                               pre = iter.next();  
                     %>

                <tbody>
                    
                        <td><%=pre.getPresta_Id()%></td>
                        <td>L.<%=pre.getPreta_Monto()%></td>
                        <td><%=pre.getRanTasa_Porcentaje()%>%</td>
                        <td><%=pre.getCta_NroCuenta()%></td>
                        <td><%=pre.getCliente()%></td>
                        <td><%=pre.getTcta_Descripcion()%></td>
                        <td><%=pre.getRanTasa_Plazo()%></td>
                         <td ><%=pre.getEsActivo()== true?"Activo":"Inactivo"%></td>
                        <td class="d-flex">
                            <button class="btn btn-primary">Editar</button>&nbsp;
                        <button class="btn btn-danger">Eliminar</button>
                            
                        </td>
                      
                    
                    <% }%>
                </tbody>
            </table>
   
                                       
   <jsp:include page="./shared/footer.jsp"></jsp:include>
