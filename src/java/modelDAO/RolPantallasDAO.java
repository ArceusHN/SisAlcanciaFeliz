/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import config.Conexion;
import interfaces.RolPantallasCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.RolPantallas;

/**
 *
 * @author Gabriel
 */
public class RolPantallasDAO implements RolPantallasCRUD{
        
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    RolPantallas rolpantallas= new RolPantallas();
    
    @Override
    public List listar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<RolPantallas>list = new ArrayList<>();
        String sql="EXEC UDP_tbRolPantallas_Select";
        try{
            con= cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();

            while(rs.next()){
            RolPantallas rolpantallas= new RolPantallas();
            rolpantallas.setId(rs.getInt("id"));
            rolpantallas.setRol_Nombre(rs.getString("Rol_Nombre"));
            rolpantallas.setPan_Nombre(rs.getString("Pan_Nombre"));
            list.add(rolpantallas);


        }
        }catch(Exception e){

        }


        return list;
    }

    
      public String listarxRol(int rol_Id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<RolPantallas>list = new ArrayList<>();
        String sql=" SELECT pan.Pan_Id, rol.Rol_Id, pan.Pan_Nombre, rol.Rol_Nombre\n" +
"			FROM tbRolPantallas AS rolpan INNER JOIN tbRoles AS rol\n" +
"			ON	 rolpan.Rol_Id = rol.Rol_Id INNER JOIN tbPantallas As pan\n" +
"			ON   rolpan.Pan_Id = pan.Pan_Id\n" +
"			WHERE rolpan.Rol_Id = '" + rol_Id + "'";
        String pantallas = "";
        try{
            con= cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();

            while(rs.next()){
              pantallas +=  rs.getString("Pan_Nombre") + ',';
            
            }
        }catch(Exception e){

        }


        return pantallas;
    }

    
    
    
   
    @Override
    public RolPantallas list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(RolPantallas rolpan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(RolPantallas rolpan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
