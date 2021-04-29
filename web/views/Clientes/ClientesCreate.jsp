<%-- 
    Document   : ClientesCreate
    Created on : 04-25-2021, 10:05:10 PM
    Author     : mancia
--%>

<%@page import="model.Usuarios"%>
<%@page import="modelDAO.UsuariosDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page = "../shared/header.jsp"></jsp:include>

<h2>Registro de Clientes</h2>

<form action="ClientesCRUDController">
    
    <div class="form-row">
        <div class="form-group col-md-4">
             <label>Primer Nombre</label>
            <input type="text" name="txtprimernombre" class="form-control">
        </div>
        <div class="form-group col-md-4">
               <label>Segundo Nombre</label>
                <input type="text" name="txtsegundonombre" class="form-control">
        </div>
        <div class="form-group col-md-4">
                <label>Primer Apellido</label>
                <input type="text" name="txtprimerapellido" class="form-control">
        </div>
    </div>
    
    <div class="form-row">
        <div class="form-group col-md-4">    
        <label>Segundo Apellido</label>
    <input type="text" name="txtsegundoapellido" class="form-control">
      </div>
        <div class="form-group col-md-4">       
            <label>Fecha De Nacimiento</label>
            <input type="date" name="txtfechanacimiento" class="form-control">
        </div>
        <div class="form-group col-md-4">
             <label>Fecha de Ingreso</label>
            <input type="date" name="txtfechaingreso" class="form-control">
        </div>
       
    </div>

    <div class="form-row">
         <div class="form-group col-md-4">
                <label>Telefono</label>
                <input type="text" name="txttelefono" class="form-control">
        </div>
        
        <div class="form-group col-md-4">
            <label>Sexo</label>
            <input type="text" name="txtsexo">
        </div>
        
        <div class="form-group col-md-4">
            <label>Estado Civil</label>
            <select class="form-control" name="EstadoCivil">
                  <option value="">--Seleccionar EstadoCivil--</option>
                  <option value=1>Soltero</option>
                  <option value=2>Casado</option>
                   <option value=3>Divorciado</option>
                  <option value=4>Viudo</option>
                   <option value=5>Union Libre</option>   
              </select>
        </div>
        
    </div>
         
    
    <div class="form-group col-md-4">
             <label>Direccion</label>
             <input type="text" name="txtdireccion" class="form-control">
        </div>
     </div>
     
   <input type="submit" name="accion" value="agregar" class="btn btn-primary">
</form>

<jsp:include page = "../shared/footer.jsp"></jsp:include>
