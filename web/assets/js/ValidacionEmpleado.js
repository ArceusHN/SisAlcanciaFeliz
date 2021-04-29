/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    window.addEventListener("DOMContentLoaded", ()=>{ 
       var form = document.getElementById("empleado");
       form.addEventListener("submit",validar);
    });
function validar(e){
        var identidad=document.empleado.Identidad.value;
        var pnombre=document.empleado.PrimerNombre.value;        
        var snombre=document.empleado.SegundoNombre.value;
        var papell=document.empleado.PrimerApellido.value;
        var sapell=document.empleado.SegundoApellido.value;
        var nac=document.empleado.FechaNacimiento.value;
        var ingreso=document.empleado.FechaIngreso.value;
        var tel=document.empleado.Telefono.value;
        var sex=document.empleado.Sexo.value;
        var ec=document.empleado.EstadoCivil.value;        
        var dir=document.empleado.Direccion.value;
        var car=document.empleado.Cargo.value;
        var suc=document.empleado.Sucursal.value;
        


        document.getElementById('pnomb').innerHTML
                = '';
  
        document.getElementById('id').innerHTML
                = '';
         document.getElementById('sn').innerHTML
                = '';
            document.getElementById('pa').innerHTML
                = '';
            document.getElementById('sa').innerHTML
                = '';
            document.getElementById('nac').innerHTML
                = '';
            document.getElementById('ing').innerHTML
                = '';
            document.getElementById('tel').innerHTML
                = '';
            document.getElementById('sex').innerHTML
                = '';
            document.getElementById('ec').innerHTML
                = '';
            document.getElementById('dir').innerHTML
                = '';
            document.getElementById('car').innerHTML
                = '';
            document.getElementById('suc').innerHTML
                = '';
        
     if (identidad=="" || identidad.length<13 || pnombre=="" || snombre=="" || papell=="" || sapell=="" || nac=="" || ingreso=="" || tel=="" || sex=="" || ec=="" || dir=="" || car=="" || suc=="") {
   
        e.preventDefault();
     console.log("Hola");
          
          if(identidad.length<13){
               document.getElementById('id').innerHTML
                = '"Identidad debe contener 13 caracteres*"';
          }
         
       
        if(pnombre==""){
            document.getElementById('pnomb').innerHTML
                = '"Ingresar primer nombre*"';
        }
         if(snombre==""){
            document.getElementById('sn').innerHTML
                = '"Ingresar segundo nombre*"';
        }
        
         if(papell==""){
     
            document.getElementById('pa').innerHTML
                = '"Ingresar primer apellido*"';
        }
         
         if(sapell==""){
             
            document.getElementById('sa').innerHTML
                = '"Ingresar segundo apellido*"';
        } 
        
         if(nac==""){
             
            document.getElementById('nac').innerHTML
                = '"Ingresar fecha de nacimiento*"';
        }
         if(ingreso==""){
             
            document.getElementById('ing').innerHTML
                = '"Ingresar fecha de ingreso*"';
        }
         if(tel==""){
             
            document.getElementById('tel').innerHTML
                = '"Ingresar telefono*"';
        }
         if(sex==""){
             
            document.getElementById('sex').innerHTML
                = '"Ingresar sexo*"';
        }
         if(ec==""){
             
            document.getElementById('ec').innerHTML
                = '"Ingresar estado civil*"';
        }
         if(dir==""){
             
            document.getElementById('dir').innerHTML
                = '"Ingresar direccion*"';
        }
         if(car==""){
             
            document.getElementById('car').innerHTML
                = '"Ingresar cargo*"';
        }
         if(suc==""){
             
            document.getElementById('suc').innerHTML
                = '"Ingresar sucursal*"';
        }
     
  }
 
 

 }






    