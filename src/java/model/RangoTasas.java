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
public class RangoTasas {
    int RanTasa_Id;
    int RanTasa_Minimo;
    int RanTasa_Maximo;
    float RanTasa_Porcentaje;
    boolean EsActivo;

    public RangoTasas() {
    }

    public RangoTasas(int RanTasa_Id, int RanTasa_Minimo, int RanTasa_Maximo, float RanTasa_Porcentaje, boolean EsActivo) {
        this.RanTasa_Id = RanTasa_Id;
        this.RanTasa_Minimo = RanTasa_Minimo;
        this.RanTasa_Maximo = RanTasa_Maximo;
        this.RanTasa_Porcentaje = RanTasa_Porcentaje;
        this.EsActivo = EsActivo;
    }

    public int getRanTasa_Id() {
        return RanTasa_Id;
    }

    public void setRanTasa_Id(int RanTasa_Id) {
        this.RanTasa_Id = RanTasa_Id;
    }

    public int getRanTasa_Minimo() {
        return RanTasa_Minimo;
    }

    public void setRanTasa_Minimo(int RanTasa_Minimo) {
        this.RanTasa_Minimo = RanTasa_Minimo;
    }

    public int getRanTasa_Maximo() {
        return RanTasa_Maximo;
    }

    public void setRanTasa_Maximo(int RanTasa_Maximo) {
        this.RanTasa_Maximo = RanTasa_Maximo;
    }

    public float getRanTasa_Porcentaje() {
        return RanTasa_Porcentaje;
    }

    public void setRanTasa_Porcentaje(float RanTasa_Porcentaje) {
        this.RanTasa_Porcentaje = RanTasa_Porcentaje;
    }

    public boolean getEsActivo() {
        return EsActivo;
    }

    public void setEsActivo(boolean EsActivo) {
        this.EsActivo = EsActivo;
    }

  
}
