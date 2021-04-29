<%-- 
    Document   : Create
    Created on : 04-25-2021, 06:52:19 PM
    Author     : J_Antonio526019
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <jsp:include page="../shared/header.html"></jsp:include>
<!DOCTYPE html>

<h3>Agregar cargo</h3>
<div class="m-l-10 m-r-10 m-t-10 m-b-15">
    <br>
    <form action="CargosController">
        <label style="margin-right: 50px;">Cargo</label>
            <input class="form-control" type="text" name="txtCargos">

            <br>
            
        <input class="btn btn-primary" type="submit" name="accion" value="Agregar">

    </form>
</div>
    
 <jsp:include page="../shared/footer.html"></jsp:include>
