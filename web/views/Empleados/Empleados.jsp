<%-- 
    Document   : Empleados
    Created on : 04-22-2021, 08:18:04 PM
    Author     : DELL
--%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="model.Empleados"%>
<%@page import="modelDAO.EmpleadosDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="../shared/header.jsp"></jsp:include>
     
<h2>Empleados</h2>
        
<a href="EmpleadoController?accion=Crear Empleados" class="btn btn-success m-b-10">Crear Empleado</a>

        <table class="table table-bordered">
            <thead class="thead-dark">
                <tr>
                    <th>Identidad</th>
                    <th>Foto</th>
                    <th>Empleado</th>                    
                    <th>Nacimiento</th>
                    <th>Ingreso</th>
                    <th>Telefono</th>
                
                    <th>Direccion</th>
                    <th>Cargo</th>
                    <th>Sucursal</th>
                    <th>Acciones</th>

                </tr>
            </thead>
            <% 
                EmpleadosDAO dao = new EmpleadosDAO();    
                List<Empleados> list = dao.listar();
                Iterator<Empleados> iter = list.iterator();
                Empleados emp = null;
                while(iter.hasNext()){
                    emp = iter.next();
                
            %>
            <tbody>
                <tr>
                    <td><%=emp.getEmp_Identidad()%></td>                    
                    <td><img src="<%=emp.getEmp_Foto()%>" width="100px" height="100px"></td>                                      
                    <td><%=emp.getEmp_Nombre()%></td>
                    <td><%=emp.getEmp_FechaNac()%></td>
                    <td><%=emp.getEmp_FechaIngreso()%></td>
                   <td><%=emp.getEmp_Telefono()%></td>
                                   
                    <td><%=emp.getEmp_Direccion()%></td>
                    <td><%=emp.getEmp_Cargo()%></td>
                    <td><%=emp.getSucursal()%></td>
                    <td class="d-flex" >
                        <a href="EmpleadoController?accion=Modificar Empleados&id=<%=emp.getEmp_Id()%>" class="btn btn-primary" >Editar</a>;
                            <button  class="btn btn-danger" >Eliminar</button>
                            
                        </td>

                </tr>
                <% } %>
            </tbody>
        </table>
<jsp:include page="../shared/footer.jsp"></jsp:include>

