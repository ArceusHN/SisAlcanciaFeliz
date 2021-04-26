/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import config.Conexion;
import interfaces.PrestamosCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Prestamos;

/**
 *
 * @author kenne
 */
public class PrestamosDAO implements PrestamosCRUD {
Conexion cn= new Conexion();
Connection con;
PreparedStatement ps;
ResultSet rs;
Prestamos ec =new Prestamos();
    @Override
    public List listar() {
         ArrayList<Prestamos>list=new ArrayList();
        String sql  ="EXEC UDP_Prestamos_Select";
        try {
            con =cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
             Prestamos ec =new Prestamos();
             ec.setPresta_Id(rs.getInt("Presta_Id"));
             ec.setPreta_Monto((int) rs.getFloat("Preta_Monto"));
             ec.setRanTasa_Porcentaje((int) rs.getFloat("RanTasa_Porcentaje"));
             ec.setCta_NroCuenta(rs.getString("Cta_NroCuenta"));
             ec.setCliente(rs.getString("Cliente"));
             ec.setTcta_Descripcion(rs.getString("Tcta_Descripcion"));
             ec.setRanTasa_Plazo(rs.getInt("RanTasa_Plazo"));
             ec.setEsActivo(rs.getBoolean("EsActivo"));
   
             list.add(ec);
                
            }
        } catch (Exception e) {
            System.out.println("Error en Sintaxis"+e);
        }
        return list;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Prestamos list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Prestamos ec) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(Prestamos ec) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
