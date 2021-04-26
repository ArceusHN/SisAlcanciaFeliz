
package model;

public class Direcciones {
    int Direc_Id;
    String Direc_Descripcion = "";
    String Mpio_Descripcion = "";
    String Depto_Descripcion = "";
    String EsActivo = "";

    public Direcciones() {
    }

    public int getDirec_Id() {
        return Direc_Id;
    }

    public void setDirec_Id(int Direc_Id) {
        this.Direc_Id = Direc_Id;
    }

    public String getDirec_Descripcion() {
        return Direc_Descripcion;
    }

    public void setDirec_Descripcion(String Direc_Descripcion) {
        this.Direc_Descripcion = Direc_Descripcion;
    }

    public String getMpio_Descripcion() {
        return Mpio_Descripcion;
    }

    public void setMpio_Descripcion(String Mpio_Descripcion) {
        this.Mpio_Descripcion = Mpio_Descripcion;
    }

    public String getDepto_Descripcion() {
        return Depto_Descripcion;
    }

    public void setDepto_Descripcion(String Depto_Descripcion) {
        this.Depto_Descripcion = Depto_Descripcion;
    }

    public String getEsActivo() {
        return EsActivo;
    }

    public void setEsActivo(String EsActivo) {
        this.EsActivo = EsActivo;
    }
    


     public Direcciones(int Direc_Id, String Direc_Descripcion, String Mpio_Descripcion,
                        String Depto_Descripcion, String EsActivo) {
         this.Direc_Id = Direc_Id;
         this.Direc_Descripcion = Direc_Descripcion; 
         this.Mpio_Descripcion = Mpio_Descripcion; 
         this.Depto_Descripcion = Depto_Descripcion;
         this.EsActivo = EsActivo;
    }
    

}
