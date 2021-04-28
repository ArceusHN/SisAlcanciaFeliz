/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


document.addEventListener("DOMContentLoaded", ()=>{
    var form = document.getElementById("empleado");
    form.addEventListener("submit", validar);
});

function validar(e){
  var identidad= document.empleado.Identidad.value;
     
 if (identidad == "") {     
    e.preventDefault();
    document.getElementById('id').innerHTML = '"Ingrese la Identidad"';
    document.empleado.identidad.focus();             
 } 
  
  
}

    