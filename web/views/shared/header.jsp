<%-- 
    Document   : header.jsp
    Created on : 04-28-2021, 12:53:21 AM
    Author     : Omar Fer
--%>

<%@page import="model.Usuarios"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui"
    />
    <title>Agroxa - Responsive Bootstrap 4 Admin Dashboard</title>
    <meta content="Admin Dashboard" name="description" />
    <meta content="Themesbrand" name="author" />
    <link rel="shortcut icon" href="../../SisAlcanciaFeliz/assets/images/favicon.ico" />

    <link rel="stylesheet" href="../../SisAlcanciaFeliz/plugins/morris/morris.css" />

    <!--<link
      href="../../SisAlcanciaFeliz/assets/css/bootstrap.min.css"
      rel="stylesheet"
      type="text/css"
    /> -->
    
    
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <link
      href="../../SisAlcanciaFeliz/assets/css/metismenu.min.css"
      rel="stylesheet"
      type="text/css"
    />
    <link href="../../SisAlcanciaFeliz/assets/css/icons.css" rel="stylesheet" type="text/css" />
    <link href="../../SisAlcanciaFeliz/assets/css/style.css" rel="stylesheet" type="text/css" />
    
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.24/css/jquery.dataTables.css">

     <!-- jQuery  -->
    <script src="../../SisAlcanciaFeliz/assets/js/jquery.min.js"></script> 
    <script src="../../SisAlcanciaFeliz/assets/js/bootstrap.bundle.min.js"></script>
    
  </head>

  <body> 
<!-- Begin page -->
    <div id="wrapper">
      <!-- Top Bar Start -->
      <div class="topbar">
        <!-- LOGO -->
        <div class="topbar-left">
          <a href="index.html" class="logo">
            <span>
              <img src="../../SisAlcanciaFeliz/assets/images/logo.png" alt="" height="24" />
            </span>
            <i>
              <img src="../../SisAlcanciaFeliz/assets/images/logo-sm.png" alt="" height="22" />
            </i>
          </a>
        </div>

        <nav class="navbar-custom">
          <ul class="navbar-right d-flex list-inline float-right mb-0">
            <li class="dropdown notification-list">
              <div class="dropdown notification-list nav-pro-img">
                <a
                  class="dropdown-toggle nav-link arrow-none waves-effect nav-user waves-light"
                  data-toggle="dropdown"
                  href="#"
                  role="button"
                  aria-haspopup="false"
                  aria-expanded="false"
                >
                  <img
                    src="../../SisAlcanciaFeliz/assets/images/users/user-4.jpg"
                    alt="user"
                    class="rounded-circle"
                  />
                </a>
                <div class="dropdown-menu dropdown-menu-right profile-dropdown">
                  <!-- item-->
                  <a class="dropdown-item" href="#"
                    ><i class="mdi mdi-account-circle m-r-5"></i> Profile</a
                  >
                  <a class="dropdown-item" href="#"
                    ><i class="mdi mdi-wallet m-r-5"></i> My Wallet</a
                  >
                  <a class="dropdown-item d-block" href="#"
                    ><span class="badge badge-success float-right">11</span
                    ><i class="mdi mdi-settings m-r-5"></i> Settings</a
                  >
                  <a class="dropdown-item" href="#"
                    ><i class="mdi mdi-lock-open-outline m-r-5"></i> Lock
                    screen</a
                  >
                  <div class="dropdown-divider"></div>
                  <a class="dropdown-item text-danger" href="#"
                    ><i class="mdi mdi-power text-danger"></i> Logout</a
                  >
                </div>
              </div>
            </li>
          </ul>

          <ul class="list-inline menu-left mb-0">
            <li class="float-left">
              <button
                class="button-menu-mobile open-left waves-effect waves-light"
              >
                <i class="mdi mdi-menu"></i>
              </button>
            </li>
            <li class="d-none d-sm-block"></li>
          </ul>
        </nav>
      </div>
      <!-- Top Bar End -->

      <!-- ========== Left Sidebar Start ========== -->
      <div class="left side-menu">
        <div class="slimscroll-menu" id="remove-scroll">
          <!--- Sidemenu -->
          <div id="sidebar-menu">
            <!-- Left Menu Start -->
            <ul class="metismenu" id="side-menu">
              <li class="menu-title">Main</li>
              <li>
                <a href="http://localhost:8080/SisAlcanciaFeliz/views/index.jsp" class="waves-effect">
                  <i class="mdi mdi-home"></i
                  ><span class="badge badge-primary float-right"></span>
                  <span> Inicio </span>
                </a>
              </li>
              <% 
                String pantallas = session.getAttribute("Pantallas").toString();
                  
                if( pantallas.contains("Listar Roles") || pantallas.contains("Listar Usuarios") ){
              %>
              <li>
                <a href="javascript:void(0);" class="waves-effect"
                  ><i class="mdi mdi-security"></i
                  ><span>
                    Seguridad
                    <span class="float-right menu-arrow"
                      ><i class="mdi mdi-plus"></i
                    ></span> </span
                ></a>
                <ul class="submenu">
                   <% 
                        if( pantallas.contains("Listar Roles") ) {
                   %>
                  <li><a href="http://localhost:8080/SisAlcanciaFeliz/views/Roles.jsp">
                          Roles</a></li>
                    <% } %>
                          
                   <% 
                        if( pantallas.contains("Listar Usuarios") ) {
                   %>    
                 <li><a href="http://localhost:8080/SisAlcanciaFeliz/UsuariosController?accion=Listar Usuarios">
                          Usuarios</a></li>
                  <% } %>
                </ul>
              </li>
              <% } %>
              
              <% 
                  
                if( pantallas.contains("Listar Cargos") || pantallas.contains("Listar Clientes") ||
                    pantallas.contains("Listar Direcciones") || pantallas.contains("Listar Empleados") ||
                    pantallas.contains("Listar Sucursales") || pantallas.contains("Listar Tipo de Transacciones") ||
                    pantallas.contains("Listar Tipo de Cuentas") ){
              %>
              <li>
                <a href="javascript:void(0);" class="waves-effect"
                  ><i class="mdi mdi-hammer"></i>
                  <span>
                    Utilitarios
                    <span class="float-right menu-arrow"
                      ><i class="mdi mdi-plus"></i
                    ></span>
                  </span>
                </a>
                <ul class="submenu">
                  <% 
                        if( pantallas.contains("Listar Cargos") ) {
                   %>
                  <li><a href="http://localhost:8080/SisAlcanciaFeliz/CargosController?accion=Listar Cargos">
                          Cargos</a></li>  
                  <% } %>     
                     
                  
                  <% 
                        if( pantallas.contains("Listar Clientes") ) {
                   %>
                   <li><a href="http://localhost:8080/SisAlcanciaFeliz/ClientesController?accion=Listar Clientes">
                          Clientes</a></li>
                          
                    <% } %>          
                          
                   <% 
                        if( pantallas.contains("Listar Direcciones") ) {
                   %>
                  <li><a href="http://localhost:8080/SisAlcanciaFeliz/views/Direcciones.jsp">
                          Direcciones</a></li>
                   <% } %>       
                          
                  <% 
                        if( pantallas.contains("Listar Empleados") ) {
                   %>
                  <li><a href="http://localhost:8080/SisAlcanciaFeliz/EmpleadoController?accion=Listar Empleados">
                          Empleados</a></li>
                   <% } %>   
                          
                   <% 
                        if( pantallas.contains("Listar Sucursales") ) {
                   %>
                   <li><a href="http://localhost:8080/SisAlcanciaFeliz/SucursalesController?accion=Listar Sucursales">
                          Sucursales</a></li>   
                    <% } %>  
                    
                   <% 
                        if( pantallas.contains("Listar Tipo de Transacciones") ) {
                   %>
                  <li>
                      <a href="http://localhost:8080/SisAlcanciaFeliz/views/TipoTransacciones.jsp">
                          Tipo de transacciones</a>
                  </li>
                  <% } %>  
                  
                   <% 
                        if( pantallas.contains("Listar Tipo de Cuentas") ) {
                   %>
                  <li>
                      <a href="http://localhost:8080/SisAlcanciaFeliz/TipoCuentaController?accion=Listar Tipo de Cuentas">
                          Tipo de cuentas</a>
                  </li>
                  <% } %>  
                  
                </ul>
              </li>
              
              <% } %>
              
               <%     
                if( pantallas.contains("Listar Rango de Tasas") || pantallas.contains("Listar Cuentas") ||
                    pantallas.contains("Listar Prestamos") || pantallas.contains("Listar Transacciones")){
              %>
              <li>
                <a href="javascript:void(0);" class="waves-effect"
                  ><i class="mdi mdi-coin"></i>
                  <span>
                    Principales
                    <span class="float-right menu-arrow"
                      ><i class="mdi mdi-plus"></i
                    ></span>
                  </span>
                </a>
                <ul class="submenu">
                   <% 
                        if( pantallas.contains("Listar Cuentas") ) {
                   %>
                    <li>
                    <a href="http://localhost:8080/SisAlcanciaFeliz/views/Cuentas.jsp">Cuentas</a>
                  </li> 
                  <% } %>
                  
                  <% 
                        if( pantallas.contains("Listar Prestamos") ) {
                   %>
                  <li><a href="http://localhost:8080/SisAlcanciaFeliz/views/Prestamo.jsp">Prestamos</a></li>
                   <% } %>
                  
                  <% 
                        if( pantallas.contains("Listar Rango de Tasas") ) {
                   %>
                  <li>
                    <a href="http://localhost:8080/SisAlcanciaFeliz/views/RangoTasas.jsp"
                      >Tasas de prestamo</a
                    >
                  </li>
                    <% } %>
                    
                    <% 
                        if( pantallas.contains("Listar Transacciones") ) {
                   %>
                  <li>
                    <a href="http://localhost:8080/SisAlcanciaFeliz/views/Transacciones.jsp">Transacciones</a>
                  </li> 
                     <% } %>
                </ul>
              </li>
              
                <% } %>
            </ul>
          </div>
          <!-- Sidebar -->
          <div class="clearfix"></div>
        </div>
        <!-- Sidebar -left -->
      </div>
      <!-- Left Sidebar End -->

      <!-- ============================================================== -->
      <!-- Start right Content here -->
      <!-- ============================================================== -->
      <div class="content-page">
        <!-- Start content -->
        <div class="content">
          <div class="container-fluid">
            <div class="row">
              <div class="col-sm-12">
                <div class="page-title-box">
                  <h4 class="page-title">Bienvenido <%=( (Usuarios) session.getAttribute("CURRENT USER")).getUsu_Usuario() %></h4>
                  <ol class="breadcrumb">
                    <li class="breadcrumb-item active">
                      
                    </li>
                  </ol>
                </div>
              </div>
            </div>
           <!-- end row -->
``          
            <div class="page-content-wrapper">
                 <div class="w-lg d-sm-block">
                    <div class="row">
                        <div class="">
                            <div class="card">
                                <div class="card-body">