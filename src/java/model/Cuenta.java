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
public class Cuenta {
    int Cta_Id;
    String Cta_NroCuenta;
    String Cta_FechaApertura;
    float Cta_Saldo;
    int Cli_Id;
    int Tcta_Id;
    boolean EsActivo;
    int Usu_Crea;
    int Usu_Modifica;
    
    // -------------------------- Campos adicionales SELECT
    String Cli_Identidad;
    String Cli_Nombre;
    String Tcta_Descripcion;
    
    public Cuenta(){}

    public Cuenta(int Cta_Id, String Cta_NroCuenta, String Cta_FechaApertura, float Cta_Saldo, int Cli_Id, boolean EsActivo) {
        this.Cta_Id = Cta_Id;
        this.Cta_NroCuenta = Cta_NroCuenta;
        this.Cta_FechaApertura = Cta_FechaApertura;
        this.Cta_Saldo = Cta_Saldo;
        this.Cli_Id = Cli_Id;
        this.EsActivo = EsActivo;
    }

    public int getCta_Id() {
        return Cta_Id;
    }

    public void setCta_Id(int Cta_Id) {
        this.Cta_Id = Cta_Id;
    }

    public String getCta_NroCuenta() {
        return Cta_NroCuenta;
    }

    public void setCta_NroCuenta(String Cta_NroCuenta) {
        this.Cta_NroCuenta = Cta_NroCuenta;
    }

    public String getCta_FechaApertura() {
        return Cta_FechaApertura;
    }

    public void setCta_FechaApertura(String Cta_FechaApertura) {
        this.Cta_FechaApertura = Cta_FechaApertura;
    }

    public float getCta_Saldo() {
        return Cta_Saldo;
    }

    public void setCta_Saldo(float Cta_Saldo) {
        this.Cta_Saldo = Cta_Saldo;
    }

    public int getCli_Id() {
        return Cli_Id;
    }

    public void setCli_Id(int Cli_Id) {
        this.Cli_Id = Cli_Id;
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

    public String getCli_Identidad() {
        return Cli_Identidad;
    }

    public void setCli_Identidad(String Cli_Identidad) {
        this.Cli_Identidad = Cli_Identidad;
    }

    public String getCli_Nombre() {
        return Cli_Nombre;
    }

    public void setCli_Nombre(String Cli_Nombre) {
        this.Cli_Nombre = Cli_Nombre;
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
    
    
    
    
     
}
