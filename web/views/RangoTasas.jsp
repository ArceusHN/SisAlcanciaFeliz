<%-- 
    Document   : Content
    Created on : 04-22-2021, 05:35:14 PM
    Author     : Omar Fer
--%>



<%@page import="modelDAO.RangoTasasDAO"%>
<%@page import="model.RangoTasas"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <jsp:include page="./shared/header.html"></jsp:include>
    
    <h2>Tasas de prestamo</h2>
   <table><table class="table table-bordered">
                <thead class="thead-dark">
                    <tr>
                        <th>Id</th>
                        <th>Tasa Minima</th>
                        <th>Tasa Maxima</th>
                        <th>Tasa Porcentaje</th>
                        <th>Es Activo?</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                
                    <%
                        RangoTasasDAO dao = new RangoTasasDAO();
                        List<RangoTasas> list = dao.listar();
                        Iterator<RangoTasas> iter = list.iterator();
                        RangoTasas rt = null;
                        while (iter.hasNext()) {
                               rt = iter.next();  
                     %>

                <tbody>
                    
                        <td><%=rt.getRanTasa_Id()%></td>
                        <td>L.<%=rt.getRanTasa_Minimo()%></td>
                        <td>L.<%=rt.getRanTasa_Maximo()%></td>
                        <td><%=rt.getRanTasa_Porcentaje()%>%</td>
                        <td><%=rt.getEsActivo()== true?"Activo":"Inactivo"%></td>
                       
                        <td>
                        <button class="btn btn-primary">Editar</button>
                        <button class="btn btn-danger">Eliminar</button>
                            
                        </td>
                      
                    
                    <% }%>
                </tbody>
            </table>
   
                                       
   <jsp:include page="./shared/footer.html"></jsp:include>
