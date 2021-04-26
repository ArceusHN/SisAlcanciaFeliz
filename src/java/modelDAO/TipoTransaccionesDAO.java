/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import config.Conexion;
import interfaces.TipoTransaccionCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.TipoTransacciones;


/**
 *
 * @author marit
 */
public class TipoTransaccionesDAO implements TipoTransaccionCRUD {
Conexion cn= new Conexion();
Connection con;
PreparedStatement ps;
ResultSet rs;
TipoTransacciones ds =new TipoTransacciones();

    @Override
    public List listar() {
  ArrayList<TipoTransacciones>list = new ArrayList<>();
        String sql = "EXEC UDP_TipoTransacciones_Select";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
                TipoTransacciones ds = new TipoTransacciones();
                ds.setTtransac_Id(rs.getInt("Ttransac_Id"));
                ds.setTtransac_Descripcion(rs.getString("Ttransac_Descripcion"));
                ds.setEsActivo(rs.getBoolean("EsActivo"));
                   list.add(ds);
            }
        } catch (Exception ex) {
            System.out.println("Error en Sintaxis"+ex);
        }
    return list;    }

    @Override
    public TipoTransacciones list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(TipoTransacciones ec) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(TipoTransacciones ec) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
