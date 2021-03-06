<%-- 
    Document   : CreateEmpleados
    Created on : 04-25-2021, 01:47:34 AM
    Author     : DELL
--%>



<%@page import="modelDAO.SucursalesDAO"%>
<%@page import="modelDAO.CargosDAO"%>
<%@page import="modelDAO.DireccionesDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="model.Empleados"%>
<%@page import="model.Direcciones"%>
<%@page import="model.Cargo"%>
<%@page import="model.Sucursales"%>

<%@page import="modelDAO.EmpleadosDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="../shared/header.jsp"></jsp:include>

<h1>Crear Empleado</h1>

 

<form action="EmpleadoController" method="POST" enctype="multipart/form-data" name="empleado" id="empleado">
  <div class="form-row">
    <div class="form-group col-md-4">
            
      <label >Foto</label>
      <input type="file" class="form-control"  name="file">
    </div>
    <div class="form-group col-md-4">
      <label >Identidad</label>
      <input type="text" maxlength="13" class="form-control" name="Identidad">
      <label id="id" class="text-danger"></label>
    </div>
     <div class="form-group col-md-4">
      <label >Primer Nombre</label>
      <input type="text"  class="form-control" name="PrimerNombre" >
      <label id="pnomb" class="text-danger"></label>
    </div>
  </div>
    
 <div class="form-row">
    <div class="form-group col-md-4">
      <label >Segundo Nombre </label>
      <input type="text" class="form-control"  name="SegundoNombre">
       <label id="sn" class="text-danger"></label>
    </div>
    <div class="form-group col-md-4">
      <label > Primer Apeliido</label>
      <input type="text"  class="form-control" name="PrimerApellido">
       <label id="pa" class="text-danger"></label>
    </div>
     <div class="form-group col-md-4">
      <label >Segundo Apellido</label>
      <input type="text"  class="form-control" name="SegundoApellido">
       <label id="sa" class="text-danger"></label>
    </div>
  </div>
   <div class="form-row">
    <div class="form-group col-md-3">
      <label>Fecha de Nacimiento</label>
      <input type="date" class="form-control"  name="FechaNacimiento">
       <label id="nac" class="text-danger"></label>
    </div>
    <div class="form-group col-md-4">
      <label >Fecha de Ingreso</label>
      <input type="date"  class="form-control" name="FechaIngreso">
       <label id="ing" class="text-danger"></label>
    </div>
     <div class="form-group col-md-5">
      <label >Telefono</label>
      <input type="number"  class="form-control" name="Telefono" maxlength="8">
       <label id="tel" class="text-danger"></label>
    </div>
  </div>
       <div class="form-row">
    <div class="form-group col-md-4">
      <label >Sexo</label>
      <select class="form-control" name="Sexo">
          <option value="">--Seleccionar Sexo--</option>
          <option value=1>Masculino</option>
          <option value=2>Femenino</option>
      </select>
       <label id="sex" class="text-danger"></label>
    </div>
           
           
    <div class="form-group col-md-4"> 
      <label >Estado Civil</label>
      <select class="form-control" name="EstadoCivil">
          <option value="">--Seleccionar EstadoCivil--</option>
          <option value=1>Soltero</option>
          <option value=2>Casado</option>
           <option value=3>Divorciado</option>
          <option value=4>Viudo</option>
           <option value=5>Union Libre</option>    
      </select>
       <label id="ec" class="text-danger"></label>
    </div>
     <div class="form-group col-md-4">
        
      <label >Direccion</label>
      <select class="form-control" name="Direccion">
          <option value="">--Seleccionar Direccion--</option>
            <% 
                 DireccionesDAO dao = new DireccionesDAO();    
                List<Direcciones> list = dao.listar();
                Iterator<Direcciones> iter = list.iterator();
                Direcciones dir = null;
                while(iter.hasNext()){
                    dir = iter.next();
                
            %>
            <option value=<%=dir.getDirec_Id()%>><%=dir.getDirec_Descripcion()%></option>
          <%} %>
      </select>
       <label id="dir" class="text-danger"></label>
    </div>
  </div>
    <div class="form-row">
    <div class="form-group col-md-6">
      <label >Cargo</label>
       <select class="form-control" name="Cargo">
           <option value="">--Seleccionar Cargo--</option>
            <% 
                 CargosDAO cdao = new CargosDAO();    
                List<Cargo> lista = cdao.Listar();
                Iterator<Cargo> itera = lista.iterator();
                Cargo car = null;
                while(itera.hasNext()){
                    car = itera.next();
                
            %>
            <option value=<%=car.getCargo_Id()%>><%=car.getCargo_Descripcion()%></option>
          <%} %>
      </select>
       <label id="car" class="text-danger"></label>
    </div>
    <div class="form-group col-md-6">
      <label >Sucursal</label>
       <select class="form-control" name="Sucursal">
           <option value="">--Seleccionar Sucursal--</option>
            <% 
                 SucursalesDAO sdao = new SucursalesDAO();    
                List<Sucursales> listar = sdao.listar();
                Iterator<Sucursales> iterar = listar.iterator();
                Sucursales suc = null;
                while(iterar.hasNext()){
                    suc = iterar.next();
                
            %>
            <option value=<%=suc.getSuc_Id()%>><%=suc.getSuc_Descripcion()%></option>
          <%} %>
      </select>
       <label id="suc" class="text-danger"></label>
    </div>
  </div>
    
    
      <input type="submit"  class="btn btn-primary" value="Agregar" name="action">
</form>
 
      <script src="../SisAlcanciaFeliz/assets/js/ValidacionEmpleado.js" type="text/javascript"></script>     
          
<jsp:include page="../shared/footer.jsp"></jsp:include>