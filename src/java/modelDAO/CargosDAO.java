/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import config.Conexion;
import interfaces.CargosCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Cargo;

/**
 *
 * @author J_Antonio526019
 */
public class CargosDAO implements CargosCRUD {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Cargo ca = new Cargo();
    
    
    @Override
    public java.util.List Listar() {
        
    ArrayList<Cargo>list = new ArrayList<>();
    
    String sql = "EXEC UDP_tbCargos_Select";
    
    try
    {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        
        while(rs.next())
        {
            Cargo ca = new Cargo();
            ca.setCargo_Id(rs.getInt("Id"));
            ca.setCargo_Descripcion(rs.getString("Cargo"));
            ca.setEsActivo(rs.getBoolean("Estado"));
            
            list.add(ca);
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
    public Cargo List(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Cargo car) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(Cargo car) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
