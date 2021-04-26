/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Omar Fer
 */
public class TipoCuentas {
    int Tcta_Id;
    String Tcta_Descripcion;
    boolean EsActivo;
    int Usu_Crea;
    int Usu_Modifica;
    
    public TipoCuentas(){}

    public TipoCuentas(int Tcta_Id, String Tcta_Descripcion, boolean EsActivo, int Usu_Crea, int Usu_Modifica) {
        this.Tcta_Id = Tcta_Id;
        this.Tcta_Descripcion = Tcta_Descripcion;
        this.EsActivo = EsActivo;
        this.Usu_Crea = Usu_Crea;
        this.Usu_Modifica = Usu_Modifica;
    }

    public int getTcta_Id() {
        return Tcta_Id;
    }

    public void setTcta_Id(int Tcta_Id) {
        this.Tcta_Id = Tcta_Id;
    }

    public String getTcta_Descripcion() {
        return Tcta_Descripcion;
    }

    public void setTcta_Descripcion(String Tcta_Descripcion) {
        this.Tcta_Descripcion = Tcta_Descripcion;
    }

    public boolean getEsActivo() {
        return EsActivo;
    }

    public void setEsActivo(boolean EsActivo) {
        this.EsActivo = EsActivo;
    }

    public int getUsu_Crea() {
        return Usu_Crea;
    }

    public void setUsu_Crea(int Usu_Crea) {
        this.Usu_Crea = Usu_Crea;
    }

    public int getUsu_Modifica() {
        return Usu_Modifica;
    }

    public void setUsu_Modifica(int Usu_Modifica) {
        this.Usu_Modifica = Usu_Modifica;
    }
    

}
