/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Gabriel
 */
public class RolPantallas {
    int id;
    String Rol_Nombre;
    String Pan_Nombre;

    public RolPantallas() {
    }

    public RolPantallas(int id, String Rol_Nombre, String Pan_Nombre) {
        this.id = id;
        this.Rol_Nombre = Rol_Nombre;
        this.Pan_Nombre = Pan_Nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRol_Nombre() {
        return Rol_Nombre;
    }

    public void setRol_Nombre(String Rol_Nombre) {
        this.Rol_Nombre = Rol_Nombre;
    }

    public String getPan_Nombre() {
        return Pan_Nombre;
    }

    public void setPan_Nombre(String Pan_Nombre) {
        this.Pan_Nombre = Pan_Nombre;
    }
    
    
}





