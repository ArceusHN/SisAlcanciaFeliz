/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import config.Conexion;
import interfaces.TipoCuentasCrud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.TipoCuentas;

/**
 *
 * @author Omar Fer
 */
public class TipoCuentasDAO implements TipoCuentasCrud {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    TipoCuentas tC = new TipoCuentas();

    @Override
    public List listar() {
        ArrayList<TipoCuentas> list = new ArrayList<>();
        String sql = "EXEC UDP_TipoCuenta_Select";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                TipoCuentas tC = new TipoCuentas();
                tC.setTcta_Descripcion(rs.getString("Tcta_Descripcion"));
                tC.setEsActivo(rs.getBoolean("EsActivo"));
                list.add(tC);
            }
            
        }catch(Exception e){
        }
        
        return list;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TipoCuentas list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(TipoCuentas ec) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(TipoCuentas ec) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
