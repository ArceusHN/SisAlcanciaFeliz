<%-- 
    Document   : index.jsp
    Created on : 04-25-2021, 02:42:42 PM
    Author     : Omar Fer
--%>

<%@page import="model.Usuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<jsp:include page="../views/shared/header.jsp"></jsp:include>
<!--Pagina principal <h1>Bienvenido: <%=( (Usuarios) session.getAttribute("CURRENT USER")).getUsu_Usuario() %> </h1>-->
<br>
<br>
<br>
<br>
                    <div class="page-content-wrapper">
                        <div class="card">
                            <div class="row">
                                <div class="col-md-12" style="height:20px; background-color:#04ce40;"></div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                                        <ol class="carousel-indicators">
                                            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                                            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                                            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                                        </ol>
                                        <div class="carousel-inner">
                                            <div class="carousel-item active">
                                                <img class="d-block w-100" src="../assets/images/p1.jpg" alt="First slide">
                                                <div class="carousel-caption d-none d-md-block">
                                                    <div style="background-color: rgba(0, 0, 0, 0.75); padding: 1px;">
                                                        <h3 style="color:#04ce40; font-weight:bold; text-shadow: 2px 2px #000000;">Conocenos!</h3>
                                                        <p>Contamos con diversos servicios</p>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="carousel-item">
                                                <img class="d-block w-100" src="../assets/images/p2.jpg" alt="Second slide">
                                                <div class="carousel-caption d-none d-md-block">
                                                    <div style="background-color: rgba(0, 0, 0, 0.75); padding: 1px;">
                                                        <h3 style="color:yellow; font-weight:bold; text-shadow: 2px 2px #000000;">Fácil y rápido!</h3>
                                                        <p>Prestamos al alcance de tus manos</p>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="carousel-item">
                                                <img class="d-block w-100" src="../assets/images/p3.jpg" alt="Third slide">
                                                <div class="carousel-caption d-none d-md-block">
                                                    <div style="background-color: rgba(0, 0, 0, 0.75); padding: 1px;">
                                                        <h3 style="color:gray; font-weight:bold; text-shadow: 2px 2px #000000;">En todas partes!</h3>
                                                        <p>Ubicados mas cerca de ti.</p>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                                            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                            <span class="sr-only">Previous</span>
                                        </a>
                                        <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                                            <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                            <span class="sr-only">Next</span>
                                        </a>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="container">
                                        <h2 style="font-family: 'RocknRoll One', sans-serif; color:gold;">Adquiere nuestros servicios!</h2>
                                        <p style="font-family: 'bold'; font-size:38px;">Contamos con prestamos por autos y viviendas, pagos de servicios, atencion personalizada las 24 horas del dia, los 7 dias de las semanas.</p>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12" style="height:20px; background-color:#04ce40;"></div>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                    <br />
                                    <h2 style="font-family: 'RocknRoll One', sans-serif; color:grey; text-align: center;">Nuestros servicios</h2>
                                    <br />
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-4">
                                    <div class="container">
                                        <div style="background-color: rgba(0, 0, 0, 0.75); padding: 1px;">
                                            <h4 style="text-align: center; color:gold; font-weight:bold; text-shadow: 2px 2px #000000;">Prestamos</h4>
                                        </div>
                                        <p style="font-family: 'Kavivanar', cursive; font-size:25px;">Prestamos dinero fácil y rapido por tu vienda o tu auto con una baja taza de intereses.</p>
                                        <br />
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="container">
                                        <div style="background-color: rgba(0, 0, 0, 0.75); padding: 1px;">
                                            <h4 style="text-align: center; color:gold; font-weight:bold; text-shadow: 1px 1px #000000;">Pago de servicio</h4>
                                        </div>
                                        <p style="font-family: 'Kavivanar', cursive; font-size:25px;">Con nosotros puedes pagar tus servicios de agua y energia electrica y muchos servicios más.</p>
                                        <br />
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="container">
                                        <div style="background-color: rgba(0, 0, 0, 0.75); padding: 1px;">
                                            <h4 style="text-align: center; color:gold; font-weight:bold; text-shadow: 2px 2px #000000;">Retiro fácil</h4>
                                        </div>
                                        <p style="font-family: 'Kavivanar', cursive; font-size:25px;">Gracias a nuestra red de bancos y socios podrás retirar tu dinero fácil y rápido.</p>
                                        <br />
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12" style="height:20px; background-color:#04ce40;"></div>
                            </div>
                            <div class="row">
                                <div style="width: 100%; height: 100vh; position:relative;">
                                    <img src="../assets/images/p4.jpg" />
                                </div>
                                <p style="position:absolute; font-family: 'Satisfy', cursive; font-size:35px; background-color: rgba(0, 0, 0, 0.25); text-shadow: 2px 2px wheat; margin-left:10px; margin-top:25px; color:white;" class="col-md-3">Tus bienes en buenas manos</p>
                            </div>
                        
                            <div class="row m-t-40">
                                <div class="col-md-12" style="height:20px; background-color:#04ce40;"></div>
                            </div>
                            <div class="row m-t-15">
                                <div class="col-md-4">
                                    <br />
                                    <h3 style="font-family: 'RocknRoll One', sans-serif; color:gold; text-align: center;">Ubicados</h3>
                                    <div class="col-md-10" style="margin:auto; background-color:goldenrod; height:2px;">
                                    </div>
                                    <br />
                                    <div class="col-md-10" style="margin:auto; background-color:gray; border-radius:5px;">
                                        <p style="text-align: justify; color: white; font-size: 30px; font-family: 'bold';">Edificio principal, San pedro sula, 9 calle, 3 avenida.</p>
                                        <div class="col-md-10">
                                            <img src="../assets/images/p6.jpg" style="width:100%; margin:auto; margin-bottom:10px;" />
                                            <br />
                                            <a href="#" class="btn btn-dark">Ver más</a>
                                            <br />
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <br />
                                    <h3 style="font-family: 'RocknRoll One', sans-serif; color:gold; text-align: center;">Contactanos</h3>
                                    <div class="col-md-10" style="margin:auto; background-color:goldenrod; height:2px;">
                                    </div>
                                    <br />
                                    <div class="col-md-10" style="margin:auto; background-color:gray; border-radius:5px;">
                                        <p style="text-align:justify; color:white; font-size:30px; font-family: 'bold ';">Contactanos al teléfono 2245-8479 o a nuestro correo CF@CF.com</p>
                                        <div class="col-md-10">
                                            <img src="../assets/images/p5.jpg" style="width:100%; margin:auto; margin-bottom:10px;" />
                                            <br />
                                            <a href="#" class="btn btn-dark">Ver más</a>
                                            <br />
                                        </div>
                                    </div>
                                </div>
                                
                            </div>
                            <div class="row">
                                <br />
                                <div class="col-md-12" style="height:20px; background-color:#04ce40;"></div>
                            </div>
                        
                        </div>

        </div>

<jsp:include page="../views/shared/footer.jsp"></jsp:include>
