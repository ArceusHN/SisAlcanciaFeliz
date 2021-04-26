/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import config.Conexion;
import interfaces.CuentasCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Cuenta;

/**
 *
 * @author Omar Fer
 */
public class CuentasDAO implements CuentasCRUD {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Cuenta cta = new Cuenta();

    @Override
    public java.util.List Listar() {
        
        ArrayList<Cuenta>list = new ArrayList<>();
        
        String sql ="EXEC UDP_Cuentas_Select";
        
        try
        {
              con = cn.getConnection();
              ps = con.prepareStatement(sql);
              rs = ps.executeQuery();
              
               while(rs.next())
               {
                    Cuenta cta = new Cuenta();
                    
                    cta.setCta_Id(rs.getInt("Cta_Id"));
                    cta.setCta_NroCuenta(rs.getString("Cta_NroCuenta"));
                    cta.setCli_Identidad(rs.getString("Cli_Identidad"));
                    cta.setCli_Nombre(rs.getString("Cliente"));
                    cta.setCta_FechaApertura(rs.getString("Cta_FechaApertura"));
                    cta.setCta_Saldo(rs.getFloat("Cta_Saldo"));
                    cta.setTcta_Descripcion(rs.getString("Tcta_Descripcion"));
                    cta.setEsActivo(rs.getBoolean("EsActivo"));
                    

                     list.add(cta);
               }
              
        }
        catch (Exception e)
        {
            System.err.println("Error de sintaxis" + e);
        }
        return list;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cuenta List(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Cuenta ci) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(Cuenta ci) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
