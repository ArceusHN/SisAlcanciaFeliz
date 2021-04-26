<%-- 
    Document   : index.jsp
    Created on : 04-25-2021, 02:42:42 PM
    Author     : Omar Fer
--%>

<%@page import="model.Usuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<jsp:include page="views/shared/header.html"></jsp:include>


    <h1>Bienvenido: <%=( (Usuarios) session.getAttribute("CURRENT USER")).getUsu_Usuario() %> </h1>


<jsp:include page="views/shared/footer.html"></jsp:include>
