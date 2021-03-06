<%-- 
    Document   : Clientes
    Created on : 04-23-2021, 01:50:17 AM
    Author     : J_Antonio526019
--%>

<%@page import="java.util.Iterator"%>
<%@page import="model.Cliente"%>
<%@page import="java.util.List"%>
<%@page import="modelDAO.ClientesDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<jsp:include page="./shared/header.html"></jsp:include>
<h4>Tabla Clientes</h4>
        <table class="table table-bordered">
                    <thead class="thead-dark">
                        <tr>
                            <th>Identidad</th>
                            <th>Nombre Completo</th>
                            <th>Fecha Nacimiento</th>
                            <th>Fecha Ingreso</th>
                            <th>Teléfono</th>
                            <th>Sexo</th>
                            <th>Estado Civil</th>
                            <th>Direccion</th>
                            <th>Estado</th>
                            <th>Acciones</th>
                        </tr>
                    </thead>
                    
                         <%
                        ClientesDAO dao = new ClientesDAO();
                        List<Cliente> list = dao.Listar();
                        Iterator<Cliente> ite = list.iterator();

                        Cliente ci = null;
                        while (ite.hasNext()) {
                            ci = ite.next();
                        %>  
                    <tbody>
                        <tr>
                            <td><%=ci.getCli_Identidad()%></td>
                            <td><%=ci.getCli_PrimerNombre()%></td>
                            <td><%=ci.getCli_FechaNac()%></td>
                            <td><%=ci.getCli_FechaIngreso()%></td>
                            <td><%=ci.getCli_Telefono()%></td>
                            <td><%=ci.getCli_Sexo()%></td>
                            <td><%=ci.getEsciv_Id()%></td>
                            <td><%=ci.getDirec_Id()%></td>
                            <td><%=ci.getEsActivo()%></td>
                            <td>
                                <button class="btn btn-primary">Editar</button>
                                 <button class="btn btn-dark">Eliminar</button>
                            </td>
                        </tr>
                        <% }%>
                    </tbody>
        </table>

<jsp:include page="./shared/footer.html"></jsp:include>

