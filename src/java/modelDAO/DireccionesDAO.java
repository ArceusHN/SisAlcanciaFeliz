
package modelDAO;

import config.Conexion;
import interfaces.DireccionesCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Direcciones;


public class DireccionesDAO implements DireccionesCRUD{

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs; 
    Direcciones dr = new Direcciones();
    
    @Override
    public List listar() {
         ArrayList<Direcciones>list = new ArrayList<>();
        String sql = "EXEC UDP_tbDirecciones_Select";
     try 
     {
         con = cn.getConnection();
         ps = con.prepareStatement(sql);
         rs = ps.executeQuery();
         while (rs.next()) {
             Direcciones dr = new Direcciones();
             dr.setDirec_Id(rs.getInt("Id"));
             dr.setDirec_Descripcion(rs.getString("Direcciones"));
             dr.setMpio_Descripcion(rs.getString("Municipio"));
             dr.setDepto_Descripcion(rs.getString("Departamento"));
             dr.setEsActivo(rs.getString("Estado"));
             list.add(dr);
         }
     }
     catch(Exception e){
     }
     return list; 
    }

    @Override
    public Direcciones list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Direcciones dr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(Direcciones dr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
