/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import config.Conexion;
import interfaces.RangoTasasCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.RangoTasas;

/**
 *
 * 
 *  
 * @author kenne
 */
public class RangoTasasDAO implements RangoTasasCRUD {
Conexion cn= new Conexion();
Connection con;
PreparedStatement ps;
ResultSet rs;
RangoTasas rt =new RangoTasas();
    @Override
    public List listar() {
         ArrayList<RangoTasas>list=new ArrayList();
            String sql  ="EXEC UDP_RangoTasas_Select";
            try {
            con =cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
            RangoTasas rt =new RangoTasas();
            rt.setRanTasa_Id(rs.getInt("RanTasa_Id"));
            rt.setRanTasa_Minimo(rs.getInt("RanTasa_Minimo"));
            rt.setRanTasa_Maximo(rs.getInt("RanTasa_Maximo"));
            rt.setRanTasa_Porcentaje((int) rs.getFloat("RanTasa_Porcentaje"));
            rt.setEsActivo(rs.getBoolean("EsActivo"));
            list.add(rt);
                
            }
        } catch (Exception e) {
            System.out.println("Error en Sintaxis"+e);
        }
        return list;
    }

    @Override
    public RangoTasas list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(RangoTasas rt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(RangoTasas rt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
