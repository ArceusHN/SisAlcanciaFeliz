/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Transacciones {
    int Transac_Id;
    String Transac_Fecha;
    float Transac_Monto;
    float Transac_SaldoActual;
    String Ttransac_Descripcion;
    String Cta_NroCuenta;
    String Cliente;
    String Emp_Identidad;
    String Empleado;
    String Suc_Descripcion;
    String Direc_Descripcion;
    boolean EsActivo;

    public Transacciones() {
    }

    public Transacciones(int Transac_Id, String Transac_Fecha, float Transac_Monto, float Transac_SaldoActual, String Ttransac_Descripcion, String Cta_NroCuenta, String Cliente, String Emp_Identidad, String Empleado, String Suc_Descripcion, String Direc_Descripcion, boolean EsActivo) {
        this.Transac_Id = Transac_Id;
        this.Transac_Fecha = Transac_Fecha;
        this.Transac_Monto = Transac_Monto;
        this.Transac_SaldoActual = Transac_SaldoActual;
        this.Ttransac_Descripcion = Ttransac_Descripcion;
        this.Cta_NroCuenta = Cta_NroCuenta;
        this.Cliente = Cliente;
        this.Emp_Identidad = Emp_Identidad;
        this.Empleado = Empleado;
        this.Suc_Descripcion = Suc_Descripcion;
        this.Direc_Descripcion = Direc_Descripcion;
        this.EsActivo = EsActivo;
    }

    public int getTransac_Id() {
        return Transac_Id;
    }

    public void setTransac_Id(int Transac_Id) {
        this.Transac_Id = Transac_Id;
    }

    public String getTransac_Fecha() {
        return Transac_Fecha;
    }

    public void setTransac_Fecha(String Transac_Fecha) {
        this.Transac_Fecha = Transac_Fecha;
    }

    public float getTransac_Monto() {
        return Transac_Monto;
    }

    public void setTransac_Monto(float Transac_Monto) {
        this.Transac_Monto = Transac_Monto;
    }

    public float getTransac_SaldoActual() {
        return Transac_SaldoActual;
    }

    public void setTransac_SaldoActual(float Transac_SaldoActual) {
        this.Transac_SaldoActual = Transac_SaldoActual;
    }

    public String getTtransac_Descripcion() {
        return Ttransac_Descripcion;
    }

    public void setTtransac_Descripcion(String Ttransac_Descripcion) {
        this.Ttransac_Descripcion = Ttransac_Descripcion;
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

    public String getEmp_Identidad() {
        return Emp_Identidad;
    }

    public void setEmp_Identidad(String Emp_Identidad) {
        this.Emp_Identidad = Emp_Identidad;
    }

    public String getEmpleado() {
        return Empleado;
    }

    public void setEmpleado(String Empleado) {
        this.Empleado = Empleado;
    }

    public String getSuc_Descripcion() {
        return Suc_Descripcion;
    }

    public void setSuc_Descripcion(String Suc_Descripcion) {
        this.Suc_Descripcion = Suc_Descripcion;
    }

    public String getDirec_Descripcion() {
        return Direc_Descripcion;
    }

    public void setDirec_Descripcion(String Direc_Descripcion) {
        this.Direc_Descripcion = Direc_Descripcion;
    }

    public boolean getEsActivo() {
        return EsActivo;
    }

    public void setEsActivo(boolean EsActivo) {
        this.EsActivo = EsActivo;
    }

    
}