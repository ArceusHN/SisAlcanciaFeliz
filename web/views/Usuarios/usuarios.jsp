<%-- 
    Document   : usuarios
    Created on : 22/04/2021, 03:17:55 PM
    Author     : Lenovo
--%>

<%@page import="model.Roles"%>
<%@page import="modelDAO.RolesDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="model.Usuarios"%>
<%@page import="java.util.List"%>
<%@page import="modelDAO.UsuariosDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
        
        <jsp:include page="../shared/header.jsp"></jsp:include>
        
         <h3>Usuarios</h3>
         <br>
         <%-- <a href="UsuariosController?accion=add">Usuarios</a>
         <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#myModal">Crear</button>--%>
         <a href="UsuariosController?accion=add" type="button" class="btn btn-success m-b-10" data-toggle="modal" data-target="#myModal">Nuevo</a>

        <table class="table table-bordered">
            <thead class="thead-dark">
                <tr>
                    <th>Id</th>
                    <th>Usuario</th>
                    <th>Rol</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <%
                UsuariosDAO dao = new UsuariosDAO();
                List<Usuarios> list = dao.listar();
                Iterator<Usuarios> iter = list.iterator();
                Usuarios us = null;
                    while (iter.hasNext()){
                        us = iter.next();
                    
            %>
            
            <tbody>
                <tr>
                    <td><%=us.getUsu_Id()%></td>
                    <td><%=us.getUsu_Usuario()%></td>
                    <td><%=us.getRol_Descripcion()%></td>
                    <td>
                       
                        <button class="btn btn-primary">Editar</button>
                        <button class="btn btn-danger">Eliminar</button>
                    </td>
                </tr>
                <% } %>
            </tbody>
        </table>
            <!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLongTitle">CREAR USUARIO</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form action="UsuariosController">
                    <div class="row">
                        <div class="col-md-6">
                            <label class="control-label">Usuario</label>
                            <input class="form-control" type="text" name="txtUsuario" id="txtUsuario" />
                            <span class="text-danger col-form-label" id="spanusu"></span>
                            <label for="" id="lbparen1"></label>
                        </div>
                        <div class="col-md-6">
                            <label class="control-label">Contraseña</label>
                            <input class="form-control" type="password" name="txtContra" id="txtContra" />
                            <span class="text-danger col-form-label" id="spanpass"></span>
                            <label for="" id="lbparen1"></label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <label class="control-label">Rol</label>
                            
                            <select class="form-control" id="ddlRol" name="ddlRol">
                                <option value=0>Ingrese un rol</option>

                                    <%
                                      RolesDAO rdao= new RolesDAO();
                                      List<Roles>listar = rdao.listar();
                                      Iterator<Roles>itera= listar.iterator();
                                      Roles rol= null;

                                      while(itera.hasNext()){
                                       rol =itera.next();

                                     %>
                                     
                                     <option value=<%=rol.getRol_Id()%>><%=rol.getRol_Nombre()%></option>
                                   <%} %>
                               </select>
                            <label for="" id="lbrol"></label>
                            <span class="text-danger col-form-label" id="spanrol" hidden>Seleccione un rol</span>
                        </div>
                    </div>
                   
                    <button type="submit" class="btn btn-primary" name="accion" value="Crear Usuarios">Guardar</button>
                    <button type="button" class="btn btn-secondary" data-dismiss="modal" id="btnCancelar1">Cerrar</button>
                </form>
            </div>
            <div class="modal-footer">

            </div>
        </div>
    </div>
</div>


        <jsp:include page="../shared/footer.jsp"></jsp:include>