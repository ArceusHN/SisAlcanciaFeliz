
package modelDAO;

import config.Conexion;
import interfaces.UsuariosCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Usuarios;

public class UsuariosDAO implements UsuariosCRUD {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Usuarios us = new Usuarios();
    
    public Usuarios login(String usuario, String contra){
        String sql = "EXEC UDP_Usuario_Login '" + usuario + "', '" + contra+ "'";
        
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
                Usuarios us = new Usuarios();
                
                us.setUsu_Id(rs.getInt("Usu_Id"));
                us.setUsu_Usuario(rs.getString("Usu_Usuario"));
                us.setRol_Id(rs.getInt("Rol_Id"));
               
                
                return us;
            }
        }catch(Exception e){
        }
        
        return null;
    }
 

    @Override
    public List listar(){
        ArrayList<Usuarios>list = new ArrayList<>();
        String sql = "EXEC UDP_tbUsuarios_Select"; // HABIA UN SELECT, LO CAMBIE A PROCEDURE
        try
        {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
                Usuarios us = new Usuarios();
                us.setUsu_Id(rs.getInt("Usu_Id"));
                us.setUsu_Usuario(rs.getString("Usu_Usuario"));
                us.setRol_Descripcion(rs.getString("Rol_Nombre"));
                list.add(us);
            }
        }
        catch(Exception e)
        {
        }
        
        return list;
    }
    
    @Override
    public Usuarios list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Usuarios us) {
        String sql="EXEC UDP_Usuario_Insert '"+us.getUsu_Usuario()+"','"+us.getUsu_Contra()+"','"+us.getRol_Id()+"'";
        try
        {
        
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception ex)
        {
            return false;
        }
        
        return true;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(Usuarios us) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  
}
