<%-- 
    Document   : TipoCuenta
    Created on : 04-23-2021, 12:47:58 AM
    Author     : Omar Fer
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="model.TipoCuentas"%>
<%@page import="modelDAO.TipoCuentasDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <jsp:include page="./shared/header.jsp"></jsp:include>
 
    <div width="100%" style="text-align: center">
        <h2>Tipos de cuenta</h2>
    </div>
    
    
    
    <table class="table table-bordered">
            <thead class="thead-dark">
                <tr>
                    <th>Estado Civil</th>
                    <th>EsActivo</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <% 
                TipoCuentasDAO dao = new TipoCuentasDAO();    
                List<TipoCuentas> list = dao.listar();
                Iterator<TipoCuentas> iter = list.iterator();
                TipoCuentas tC = null;
                while(iter.hasNext()){
                    tC = iter.next();
                
            %>
            <tbody>
                <tr>
                    <td><%=tC.getTcta_Descripcion() %></td>
                    <td><%= tC.getEsActivo() == true?"Activo":"Inactivo" %></td>
                    <td>
                        <button class="btn btn-primary">Editar</button>
                        <button class="btn btn-danger">Eliminar</button>
                    </td>
                </tr>
                 <%} %>
            </tbody>
        </table>
                                       
   <jsp:include page="./shared/footer.jsp"></jsp:include>
