/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.InputStream;

/**
 *
 * @author DELL
 */
public class Empleados {
    int emp_Id;
    
    String emp_Foto,emp_Identidad,emp_Nombre,emp_FechaNac,emp_FechaIngreso,emp_Telefono,emp_Sexo,emp_Ec,emp_Direccion,
            emp_Cargo,Sucursal,Usuario_Crea,Fecha_Crea,Usuario_Modifica,Fecha_Modifica,emp_PrimerNombre,emp_SegundoNombre,
            emp_PrimerApellido,emp_SegundoApellido;

    public InputStream getEmp_Fot() {
        return emp_Fot;
    }

    public void setEmp_Fot(InputStream emp_Fot) {
        this.emp_Fot = emp_Fot;
    }
    
    InputStream  emp_Fot;

    

    
     public Empleados(){}
    
    
    public Empleados( int emp_Id, String emp_Foto, String emp_Identidad, String emp_Nombre, String emp_FechaNac,String emp_FechaIngreso,String emp_Telefono,String emp_Sexo,String emp_Ec,String emp_Direccion,
           String emp_Cargo,String Sucursal,String Usuario_Crea,String Fecha_Crea,String Usuario_Modifica,String Fecha_Modifica){
        this.emp_Id=emp_Id;
        this.emp_Foto=emp_Foto;
        this.emp_Identidad=emp_Identidad;
        this.emp_Nombre=emp_Nombre;
        this.emp_FechaNac=emp_FechaNac;
        this.emp_FechaIngreso=emp_FechaIngreso;
        this.emp_Telefono=emp_Telefono;
        this.emp_Sexo=emp_Sexo;
        this.emp_Ec=emp_Ec;
        this.emp_Direccion=emp_Direccion;
        this.emp_Cargo=emp_Cargo;
        this.Sucursal=Sucursal;
        this.Usuario_Crea=Usuario_Crea;
        this.Fecha_Crea=Fecha_Crea;
        this.Usuario_Modifica=Usuario_Modifica;
        this.Fecha_Modifica=Fecha_Modifica;
    }

    public String getEmp_PrimerNombre() {
        return emp_PrimerNombre;
    }

    public void setEmp_PrimerNombre(String emp_PrimerNombre) {
        this.emp_PrimerNombre = emp_PrimerNombre;
    }

    public String getEmp_SegundoNombre() {
        return emp_SegundoNombre;
    }

    public void setEmp_SegundoNombre(String emp_SegundoNombre) {
        this.emp_SegundoNombre = emp_SegundoNombre;
    }

    public String getEmp_PrimerApellido() {
        return emp_PrimerApellido;
    }

    public void setEmp_PrimerApellido(String emp_PrimerApellido) {
        this.emp_PrimerApellido = emp_PrimerApellido;
    }

    public String getEmp_SegundoApellido() {
        return emp_SegundoApellido;
    }

    public void setEmp_SegundoApellido(String emp_SegundoApellido) {
        this.emp_SegundoApellido = emp_SegundoApellido;
    }

    
    
       
   
    
    public int getEmp_Id() {
        return emp_Id;
    }

    public void setEmp_Id(int emp_Id) {
        this.emp_Id = emp_Id;
    }

    public String getEmp_Foto() {
        return emp_Foto;
    }

    public void setEmp_Foto(String emp_Foto) {
        this.emp_Foto = emp_Foto;
    }

    public String getEmp_Identidad() {
        return emp_Identidad;
    }

    public void setEmp_Identidad(String emp_Identidad) {
        this.emp_Identidad = emp_Identidad;
    }

    public String getEmp_Nombre() {
        return emp_Nombre;
    }

    public void setEmp_Nombre(String emp_Nombre) {
        this.emp_Nombre = emp_Nombre;
    }

    public String getEmp_FechaNac() {
        return emp_FechaNac;
    }

    public void setEmp_FechaNac(String emp_FechaNac) {
        this.emp_FechaNac = emp_FechaNac;
    }

    public String getEmp_FechaIngreso() {
        return emp_FechaIngreso;
    }

    public void setEmp_FechaIngreso(String emp_FechaIngreso) {
        this.emp_FechaIngreso = emp_FechaIngreso;
    }

    public String getEmp_Telefono() {
        return emp_Telefono;
    }

    public void setEmp_Telefono(String emp_Telefono) {
        this.emp_Telefono = emp_Telefono;
    }

    public String getEmp_Sexo() {
        return emp_Sexo;
    }

    public void setEmp_Sexo(String emp_Sexo) {
        this.emp_Sexo = emp_Sexo;
    }

    public String getEmp_Ec() {
        return emp_Ec;
    }

    public void setEmp_Ec(String emp_Ec) {
        this.emp_Ec = emp_Ec;
    }

    public String getEmp_Direccion() {
        return emp_Direccion;
    }

    public void setEmp_Direccion(String emp_Direccion) {
        this.emp_Direccion = emp_Direccion;
    }

    public String getEmp_Cargo() {
        return emp_Cargo;
    }

    public void setEmp_Cargo(String emp_Cargo) {
        this.emp_Cargo = emp_Cargo;
    }

    public String getSucursal() {
        return Sucursal;
    }

    public void setSucursal(String Sucursal) {
        this.Sucursal = Sucursal;
    }

    public String getUsuario_Crea() {
        return Usuario_Crea;
    }

    public void setUsuario_Crea(String Usuario_Crea) {
        this.Usuario_Crea = Usuario_Crea;
    }

    public String getFecha_Crea() {
        return Fecha_Crea;
    }

    public void setFecha_Crea(String Fecha_Crea) {
        this.Fecha_Crea = Fecha_Crea;
    }

    public String getUsuario_Modifica() {
        return Usuario_Modifica;
    }

    public void setUsuario_Modifica(String Usuario_Modifica) {
        this.Usuario_Modifica = Usuario_Modifica;
    }

    public String getFecha_Modifica() {
        return Fecha_Modifica;
    }

    public void setFecha_Modifica(String Fecha_Modifica) {
        this.Fecha_Modifica = Fecha_Modifica;
    }
 
    
       
}
