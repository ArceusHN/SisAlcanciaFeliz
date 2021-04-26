/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kenne
 */
public class Prestamos {
    
    int Presta_Id;
    float   Preta_Monto;
    float   RanTasa_Porcentaje;
    String Cta_NroCuenta;
    String Cliente;
    String Tcta_Descripcion;
    int RanTasa_Plazo;
    boolean EsActivo;

    public Prestamos() {
    }

    public Prestamos(int Presta_Id, float Preta_Monto, float RanTasa_Porcentaje, String Cta_NroCuenta, String Cliente, String Tcta_Descripcion, int RanTasa_Plazo, boolean EsActivo) {
        this.Presta_Id = Presta_Id;
        this.Preta_Monto = Preta_Monto;
        this.RanTasa_Porcentaje = RanTasa_Porcentaje;
        this.Cta_NroCuenta = Cta_NroCuenta;
        this.Cliente = Cliente;
        this.Tcta_Descripcion = Tcta_Descripcion;
        this.RanTasa_Plazo = RanTasa_Plazo;
        this.EsActivo = EsActivo;
    }

    public int getPresta_Id() {
        return Presta_Id;
    }

    public void setPresta_Id(int Presta_Id) {
        this.Presta_Id = Presta_Id;
    }

    public float getPreta_Monto() {
        return Preta_Monto;
    }

    public void setPreta_Monto(float Preta_Monto) {
        this.Preta_Monto = Preta_Monto;
    }

    public float getRanTasa_Porcentaje() {
        return RanTasa_Porcentaje;
    }

    public void setRanTasa_Porcentaje(float RanTasa_Porcentaje) {
        this.RanTasa_Porcentaje = RanTasa_Porcentaje;
    }

    public String getCta_NroCuenta() {
        return Cta_NroCuenta;
    }

    public void setCta_NroCuenta(String Cta_NroCuenta) {
        this.Cta_NroCuenta = Cta_NroCuenta;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getTcta_Descripcion() {
        return Tcta_Descripcion;
    }

    public void setTcta_Descripcion(String Tcta_Descripcion) {
        this.Tcta_Descripcion = Tcta_Descripcion;
    }

    public int getRanTasa_Plazo() {
        return RanTasa_Plazo;
    }

    public void setRanTasa_Plazo(int RanTasa_Plazo) {
        this.RanTasa_Plazo = RanTasa_Plazo;
    }

    public boolean getEsActivo() {
        return EsActivo;
    }

    public void setEsActivo(boolean EsActivo) {
        this.EsActivo = EsActivo;
    }

  
}
