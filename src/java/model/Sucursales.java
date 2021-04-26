
package model;


public class Sucursales {
    
    int     Suc_Id;
    String  Suc_Descripcion;
    String  Suc_Telefono;
    String  Direc_Descripcion;
    boolean EsActivo;

    public Sucursales() {
    }

    public Sucursales(int Suc_Id, String Suc_Descripcion, String Suc_Telefono, String Direc_Descripcion, boolean EsActivo) {
        this.Suc_Id = Suc_Id;
        this.Suc_Descripcion = Suc_Descripcion;
        this.Suc_Telefono = Suc_Telefono;
        this.Direc_Descripcion = Direc_Descripcion;
        this.EsActivo = EsActivo;
    }

    public int getSuc_Id() {
        return Suc_Id;
    }

    public void setSuc_Id(int Suc_Id) {
        this.Suc_Id = Suc_Id;
    }

    public String getSuc_Descripcion() {
        return Suc_Descripcion;
    }

    public void setSuc_Descripcion(String Suc_Descripcion) {
        this.Suc_Descripcion = Suc_Descripcion;
    }

    public String getSuc_Telefono() {
        return Suc_Telefono;
    }

    public void setSuc_Telefono(String Suc_Telefono) {
        this.Suc_Telefono = Suc_Telefono;
    }

    public String getDirec_Descripcion() {
        return Direc_Descripcion;
    }

    public void setDirec_Descripcion(String Direc_Descripcion) {
        this.Direc_Descripcion = Direc_Descripcion;
    }

    public boolean isEsActivo() {
        return EsActivo;
    }

    public void setEsActivo(boolean EsActivo) {
        this.EsActivo = EsActivo;
    }
    
    
    
    
}
