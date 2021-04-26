/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author marit
 */
public class TipoTransacciones {
    int Ttransac_Id;
    String Ttransac_Descripcion;
    boolean EsActivo;

    

    public TipoTransacciones() {
    }
    
    public TipoTransacciones(int Ttransac_Id, String Ttransac_Descripcion, boolean EsActivo) {
        this.Ttransac_Id = Ttransac_Id;
        this.Ttransac_Descripcion = Ttransac_Descripcion;
        this.EsActivo = EsActivo;
    }

    public int getTtransac_Id() {
        return Ttransac_Id;
    }

    public void setTtransac_Id(int Ttransac_Id) {
        this.Ttransac_Id = Ttransac_Id;
    }

    public String getTtransac_Descripcion() {
        return Ttransac_Descripcion;
    }

    public void setTtransac_Descripcion(String Ttransac_Descripcion) {
        this.Ttransac_Descripcion = Ttransac_Descripcion;
    }

    public boolean getEsActivo() {
        return EsActivo;
    }

    public void setEsActivo(boolean EsActivo) {
        this.EsActivo = EsActivo;
    }
    
    
}

