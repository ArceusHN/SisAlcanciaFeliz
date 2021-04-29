<%-- 
    Document   : EditEmpleados
    Created on : 04-27-2021, 08:30:21 AM
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

<jsp:include page="../shared/header.html"></jsp:include>



<% EmpleadosDAO edao= new EmpleadosDAO();
    int idemp= Integer.parseInt((String)request.getAttribute("idEmpleado"));
    Empleados emps=(Empleados)edao.list(idemp);
%>

<h1>Editar Empleado <img src="<%=emps.getEmp_Foto()%>" width="100px" height="100px" style="margin-left: 250px;"></h1> 

<form action="EmpleadoController">
  <div class="form-row">
    <div class="form-group col-md-4">
            
      <label >Foto</label>
      
      <input type="text" class="form-control"  name="file" value="<%=emps.getEmp_Foto()%>">
    </div>
    <div class="form-group col-md-4">
      <label >Identidad</label>
      <input type="text" maxlength="13" class="form-control" name="Identidad" value="<%=emps.getEmp_Identidad()%>">
      <label id="id"></label>
    </div>
     <div class="form-group col-md-4">
      <label >Primer Nombre</label>
      <input type="text"  class="form-control" name="PrimerNombre" value="<%=emps.getEmp_PrimerNombre()%>">
    </div>
  </div>
    
 <div class="form-row">
    <div class="form-group col-md-4">
      <label >Segundo Nombre </label>
      <input type="text" class="form-control"  name="SegundoNombre" value="<%=emps.getEmp_SegundoNombre()%>">
    </div>
    <div class="form-group col-md-4">
      <label > Primer Apeliido</label>
      <input type="text"  class="form-control" name="PrimerApellido" value="<%=emps.getEmp_PrimerApellido()%>">
    </div>
     <div class="form-group col-md-4">
      <label >Segundo Apellido</label>
      <input type="text"  class="form-control" name="SegundoApellido" value="<%=emps.getEmp_SegundoApellido()%>">
    </div>
  </div>
   <div class="form-row">
    <div class="form-group col-md-3">
      <label>Fecha de Nacimiento</label>
      <input type="date" class="form-control"  name="FechaNacimiento" value="<%=emps.getEmp_FechaNac()%>">
    </div>
    <div class="form-group col-md-4">
      <label >Fecha de Ingreso</label>
      <input type="date"  class="form-control" name="FechaIngreso" value="<%=emps.getEmp_FechaIngreso()%>">
    </div>
     <div class="form-group col-md-5">
      <label >Telefono</label>
      <input type="number"  class="form-control" name="Telefono" maxlength="8" value="<%=emps.getEmp_Telefono()%>">
    </div>
  </div>
       <div class="form-row">
    <div class="form-group col-md-4">
      <label >Sexo</label>
      <select class="form-control" name="Sexo">

          <%if(Integer.parseInt(emps.getEmp_Sexo())==1){%> 
          <option selected value=1>Masculino</option>
          <option value=2>Femenino</option>
          <%}%>
          
          <%if(Integer.parseInt(emps.getEmp_Sexo())==2){%> 
          <option value=1>Masculino</option>
          <option selected value=2>Femenino</option>
          <%}%>
      </select>
    </div>
           
           
    <div class="form-group col-md-4"> 
      <label >Estado Civil</label>
      <select class="form-control" name="EstadoCivil">
          
          <%if(Integer.parseInt(emps.getEmp_Ec())==1){%> 
          <option selected value=1>Soltero</option>
          <option value=2>Casado</option>
           <option value=3>Divorciado</option>
          <option value=4>Viudo</option>
           <option value=5>Union Libre</option> 
          <%}%>
          <%if(Integer.parseInt(emps.getEmp_Ec())==2)
          {%> 
          <option value=1>Soltero</option>
          <option  selected value=2>Casado</option>
           <option value=3>Divorciado</option>
          <option value=4>Viudo</option>
           <option value=5>Union Libre</option> 
          <%}%>
          <%if(Integer.parseInt(emps.getEmp_Ec())==3){%> 
          <option value=1>Soltero</option>
          <option value=2>Casado</option>
          <option value=3 selected>Divorciado</option>
          <option value=4>Viudo</option>
           <option value=5>Union Libre</option> 
          <%}%>
          <%if(Integer.parseInt(emps.getEmp_Ec())==4){%> 
          <option value=1>Soltero</option>
          <option value=2>Casado</option>
           <option value=3>Divorciado</option>
           <option selected value=4>Viudo</option>
           <option value=5>Union Libre</option> 
          <%}%>
          <%if(Integer.parseInt(emps.getEmp_Ec())==5){%> 
          <option value=1>Soltero</option>
          <option value=2>Casado</option>
           <option value=3>Divorciado</option>
          <option value=4>Viudo</option>
          <option selected value=5>Union Libre</option> 
          <%}%>
             
      </select>
    </div>
     <div class="form-group col-md-4">
        
      <label >Direccion</label>
      <select class="form-control" name="Direccion" id="ddldireccion">
            <% 
                 DireccionesDAO dao = new DireccionesDAO();    
                List<Direcciones> list = dao.listar();
                Iterator<Direcciones> iter = list.iterator();
                Direcciones dir = null;
                while(iter.hasNext()){
                    dir = iter.next();
                
            %>
            <% if(Integer.parseInt(emps.getEmp_Direccion())==dir.getDirec_Id())
            {
            %>
            <option selected value=<%=dir.getDirec_Id()%>><%=dir.getDirec_Descripcion()%></option>
      <% }%>
      
            <% if(Integer.parseInt(emps.getEmp_Direccion())!=dir.getDirec_Id())
            {
            %>
            <option value=<%=dir.getDirec_Id()%>><%=dir.getDirec_Descripcion()%></option>
      <% }%>
             
          <%} %>
      </select>
     
    </div>
  </div>
    <div class="form-row">
    <div class="form-group col-md-6">
      <label >Cargo</label>
       <select class="form-control" name="Cargo" >
            <% 
                 CargosDAO cdao = new CargosDAO();    
                List<Cargo> lista = cdao.Listar();
                Iterator<Cargo> itera = lista.iterator();
                Cargo car = null;
                while(itera.hasNext()){
                    car = itera.next();
                
            %>
            <% if(Integer.parseInt(emps.getEmp_Cargo())==car.getCargo_Id())
            {
            %>
            <option selected value=<%=car.getCargo_Id()%>><%=car.getCargo_Descripcion()%></option>
      <% }%>
      
            <% if(Integer.parseInt(emps.getEmp_Cargo())!=car.getCargo_Id())
            {
            %>
            <option value=<%=car.getCargo_Id()%>><%=car.getCargo_Descripcion()%></option>
      <% }%>
          <%} %>
      </select>
    </div>
    <div class="form-group col-md-6">
      <label >Sucursal</label>
       <select class="form-control" name="Sucursal">
            <% 
                 SucursalesDAO sdao = new SucursalesDAO();    
                List<Sucursales> listar = sdao.listar();
                Iterator<Sucursales> iterar = listar.iterator();
                Sucursales suc = null;
                while(iterar.hasNext()){
                    suc = iterar.next();
                
            %>
               <% if(Integer.parseInt(emps.getSucursal())==suc.getSuc_Id())
            {
            %>
            <option selected value=<%=suc.getSuc_Id()%>><%=suc.getSuc_Descripcion()%></option>
      <% }%>
      
           <% if(Integer.parseInt(emps.getSucursal())!=suc.getSuc_Id())
            {
            %>
          <option  value=<%=suc.getSuc_Id()%>><%=suc.getSuc_Descripcion()%></option>
      <% }%>
            
           
          <%} %>
      </select>
    </div>
  </div>
    
    <input type="hidden"  name="txtid" value="<%=emps.getEmp_Id()%>">
      <input type="submit"  class="btn btn-primary" value="Actualizar" name="action">     
      

</form>
      
      <jsp:include page="../shared/footer.html"></jsp:include>

