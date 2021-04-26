
package modelDAO;

import config.Conexion;
import interfaces.SucursalesCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Sucursales;


public class SucursalesDAO implements SucursalesCRUD {

     Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Sucursales sc = new Sucursales();
    
    @Override
    public List listar() {
       ArrayList<Sucursales>list = new ArrayList<>();
    
    String sql = "EXEC UDP_Sucursales_Select";
    
    try
    {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        
        while(rs.next())
        {
            Sucursales sc;
            sc = new Sucursales();
            sc.setSuc_Id(rs.getInt("Suc_Id"));
            sc.setSuc_Descripcion(rs.getString("descripcion"));
            sc.setSuc_Telefono(rs.getString("telefono"));
            sc.setDirec_Descripcion(rs.getString("Direc_Descripcion"));
            sc.setEsActivo(rs.getBoolean("EsActivo"));
            
            list.add(sc);
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
    public Sucursales list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Sucursales sc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(Sucursales sc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
