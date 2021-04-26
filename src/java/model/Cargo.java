package model;

/**
 *
 * @author J_Antonio526019
 */
public class Cargo {
    int Cargo_Id;
    String Cargo_Descripcion,Usu_Crea, Fecha_Crea, Usu_Modifica, Fecha_Modifica;
    boolean EsActivo;
    
    public Cargo() {
    }

    public Cargo(int Cargo_Id, String Cargo_Descripcion, boolean EsActivo, String Usu_Crea, String Fecha_Crea, String Usu_Modifica, String Fecha_Modifica) {
        this.Cargo_Id = Cargo_Id;
        this.Cargo_Descripcion = Cargo_Descripcion;
        this.EsActivo = EsActivo;
        this.Usu_Crea = Usu_Crea;
        this.Fecha_Crea = Fecha_Crea;
        this.Usu_Modifica = Usu_Modifica;
        this.Fecha_Modifica = Fecha_Modifica;
    }

    public int getCargo_Id() {
        return Cargo_Id;
    }

    public void setCargo_Id(int Cargo_Id) {
        this.Cargo_Id = Cargo_Id;
    }

    public String getCargo_Descripcion() {
        return Cargo_Descripcion;
    }

    public void setCargo_Descripcion(String Cargo_Descripcion) {
        this.Cargo_Descripcion = Cargo_Descripcion;
    }

    public boolean getEsActivo() {
        return EsActivo;
    }

    public void setEsActivo(boolean EsActivo) {
        this.EsActivo = EsActivo;
    }

    public String getUsu_Crea() {
        return Usu_Crea;
    }

    public void setUsu_Crea(String Usu_Crea) {
        this.Usu_Crea = Usu_Crea;
    }

    public String getFecha_Crea() {
        return Fecha_Crea;
    }

    public void setFecha_Crea(String Fecha_Crea) {
        this.Fecha_Crea = Fecha_Crea;
    }

    public String getUsu_Modifica() {
        return Usu_Modifica;
    }

    public void setUsu_Modifica(String Usu_Modifica) {
        this.Usu_Modifica = Usu_Modifica;
    }

    public String getFecha_Modifica() {
        return Fecha_Modifica;
    }

    public void setFecha_Modifica(String Fecha_Modifica) {
        this.Fecha_Modifica = Fecha_Modifica;
    }
    
    
    
    
}
