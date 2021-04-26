/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import config.Conexion;
import interfaces.TransaccionesCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Transacciones;

/**
 *
 * @author marit
 */
public class TransaccionesDAO implements TransaccionesCRUD{
Conexion cn= new Conexion();
Connection con;
PreparedStatement ps;
ResultSet rs;
Transacciones ds =new Transacciones();


    @Override
    public List listar() {
        ArrayList<Transacciones>list = new ArrayList<>();
        String sql = "EXEC UDP_Transacciones_Select";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
                Transacciones ds = new Transacciones();
                ds.setTransac_Id(rs.getInt("Transac_Id"));
                ds.setTransac_Fecha(rs.getString("Transac_Fecha"));
                ds.setTransac_Monto((int)rs.getFloat("Transac_Monto"));
                ds.setTransac_SaldoActual((int)rs.getFloat("Transac_SaldoActual"));
                ds.setTtransac_Descripcion(rs.getString("Ttransac_Descripcion"));
                ds.setCta_NroCuenta(rs.getString("Cta_NroCuenta"));
                ds.setCliente(rs.getString("Cliente"));
                ds.setEmp_Identidad(rs.getString("Emp_Identidad"));
                ds.setEmpleado(rs.getString("Empleado"));
                ds.setSuc_Descripcion(rs.getString("Suc_Descripcion"));
                ds.setDirec_Descripcion(rs.getString("Direc_Descripcion"));
                ds.setEsActivo(rs.getBoolean("EsActivo"));
                   list.add(ds);
            }
        } catch (Exception ex) {
            System.out.println("Error en Sintaxis"+ex);
        }
    return list;
    }

    @Override
    public Transacciones list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Transacciones ec) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(Transacciones ec) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
