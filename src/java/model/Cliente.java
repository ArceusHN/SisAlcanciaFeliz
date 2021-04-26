package model;

/**
 *
 * @author J_Antonio526019
 */
public class Cliente {
   int Cli_Id;
   String Cli_Identidad;
   String Cli_PrimerNombre;
   String Cli_FechaNac;
   String Cli_FechaIngreso;
   String Cli_Telefono;
   String Cli_Sexo;
   String Esciv_Id;
   String Direc_Id;
   String Usu_Crea, Fecha_Crea, Usu_Modifica, Fecha_Modifica;
   boolean EsActivo;

    public Cliente() {
    }

    public Cliente(int Cli_Id, String Cli_Identidad, String Cli_PrimerNombre, String Cli_FechaNac, String Cli_FechaIngreso, String Cli_Telefono, String Cli_Sexo, String Esciv_Id, String Direc_Id, boolean EsActivo, String Usu_Crea, String Fecha_Crea, String Usu_Modifica, String Fecha_Modifica) {
        this.Cli_Id = Cli_Id;
        this.Cli_Identidad = Cli_Identidad;
        this.Cli_PrimerNombre = Cli_PrimerNombre;
        this.Cli_FechaNac = Cli_FechaNac;
        this.Cli_FechaIngreso = Cli_FechaIngreso;
        this.Cli_Telefono = Cli_Telefono;
        this.Cli_Sexo = Cli_Sexo;
        this.Esciv_Id = Esciv_Id;
        this.Direc_Id = Direc_Id;
        this.EsActivo = EsActivo;
        this.Usu_Crea = Usu_Crea;
        this.Fecha_Crea = Fecha_Crea;
        this.Usu_Modifica = Usu_Modifica;
        this.Fecha_Modifica = Fecha_Modifica;
    }

    public int getCli_Id() {
        return Cli_Id;
    }

    public void setCli_Id(int Cli_Id) {
        this.Cli_Id = Cli_Id;
    }

    public String getCli_Identidad() {
        return Cli_Identidad;
    }

    public void setCli_Identidad(String Cli_Identidad) {
        this.Cli_Identidad = Cli_Identidad;
    }

    public String getCli_PrimerNombre() {
        return Cli_PrimerNombre;
    }

    public void setCli_PrimerNombre(String Cli_PrimerNombre) {
        this.Cli_PrimerNombre = Cli_PrimerNombre;
    }

    public String getCli_FechaNac() {
        return Cli_FechaNac;
    }

    public void setCli_FechaNac(String Cli_FechaNac) {
        this.Cli_FechaNac = Cli_FechaNac;
    }

    public String getCli_FechaIngreso() {
        return Cli_FechaIngreso;
    }

    public void setCli_FechaIngreso(String Cli_FechaIngreso) {
        this.Cli_FechaIngreso = Cli_FechaIngreso;
    }

    public String getCli_Telefono() {
        return Cli_Telefono;
    }

    public void setCli_Telefono(String Cli_Telefono) {
        this.Cli_Telefono = Cli_Telefono;
    }

    public String getCli_Sexo() {
        return Cli_Sexo;
    }

    public void setCli_Sexo(String Cli_Sexo) {
        this.Cli_Sexo = Cli_Sexo;
    }

    public String getEsciv_Id() {
        return Esciv_Id;
    }

    public void setEsciv_Id(String Esciv_Id) {
        this.Esciv_Id = Esciv_Id;
    }

    public String getDirec_Id() {
        return Direc_Id;
    }

    public void setDirec_Id(String Direc_Id) {
        this.Direc_Id = Direc_Id;
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
