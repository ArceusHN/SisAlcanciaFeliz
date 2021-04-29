/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import config.Conexion;
import interfaces.ClientesCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author J_Antonio526019
 */
public class ClientesDAO implements ClientesCRUD{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Cliente ci = new Cliente();

    @Override
    public java.util.List Listar() {
        
        ArrayList<Cliente>list = new ArrayList<>();
        
        String sql ="exec UDP_tbClientes_Select";
        
        try
        {
              con = cn.getConnection();
              ps = con.prepareStatement(sql);
              rs = ps.executeQuery();
              
               while(rs.next())
               {
                    Cliente ci = new Cliente();
                    
                    ci.setCli_Id(rs.getInt("Id"));
                    ci.setCli_Identidad(rs.getString("Identidad"));
                    ci.setCli_PrimerNombre(rs.getString("Nombre Completo"));
                    ci.setCli_FechaNac(rs.getString("Cli_FechaNac"));
                    ci.setCli_FechaIngreso(rs.getString("Cli_FechaIngreso"));
                    ci.setCli_Telefono(rs.getString("Cli_Telefono"));
                    ci.setCli_Sexo(rs.getString("Sexo"));
                    ci.setEsciv_Id(rs.getString("Estado Civil"));
                    ci.setDirec_Id(rs.getString("Direcciones"));
                    ci.setEsActivo(rs.getBoolean("Estado"));


                     list.add(ci);
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
    public Cliente List(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     @Override
    public boolean add(Cliente ci) {
        String sql = "EXEC UDP_tbClientes_Insert '" + ci.getCli_Identidad() + "', '" + ci.getCli_PrimerNombre() + "', '" + ci.getCli_SegundoNombre() + "', '"  + ci.getCli_PrimerApellido() + "', '" + ci.getCli_SegundoApellido() + "', '" + ci.getCli_FechaNac() + "', '" + ci.getCli_FechaIngreso() + "', '" + ci.getCli_Telefono() + "', '" + ci.getCli_Sexo() + "', '" + ci.getEsciv_Id() + "', '" + ci.getDirec_Id() + "', '" + ci.getUsu_Crea() + "'";
        try
        {
            con = cn.getConnection();
                  ps = con.prepareStatement(sql);
                  ps.executeUpdate();
        }
        catch(Exception e)
        {

        }

        return false;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(Cliente ci) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
