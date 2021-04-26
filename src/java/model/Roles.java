/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Roles {
     int Rol_Id;
    String Rol_Nombre;

    public Roles() {
    }

    public Roles(int Rol_Id, String Rol_Nombre) {
        this.Rol_Id = Rol_Id;
        this.Rol_Nombre = Rol_Nombre;
    }

    public int getRol_Id() {
        return Rol_Id;
    }

    public void setRol_Id(int Rol_Id) {
        this.Rol_Id = Rol_Id;
    }

    public String getRol_Nombre() {
        return Rol_Nombre;
    }

    public void setRol_Nombre(String Rol_Nombre) {
        this.Rol_Nombre = Rol_Nombre;
    }
    
    
}
