<%-- 
    Document   : Content
    Created on : 04-22-2021, 05:35:14 PM
    Author     : Omar Fer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <jsp:include page="./shared/header.html"></jsp:include>
 
    <h1 class="text-warning">Somos los meros quesos</h1>
    <table class="table table-bordered">
            <thead class="thead-dark">
                <tr>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Omar</td>
                    <td>Fernandez</td>
                    <td>
                        <button class="btn btn-primary">Editar</button>
                        <button class="btn btn-dark">Eliminar</button>
                    </td>
                </tr>
            </tbody>
        </table>
                                       
   <jsp:include page="./shared/footer.html"></jsp:include>
