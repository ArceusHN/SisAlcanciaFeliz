/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

/**
 *
 * @author DELL
 */
import config.Conexion;
import interfaces.EmpleadosCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Empleados;

public class EmpleadosDAO implements EmpleadosCRUD{
     Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Empleados emp = new Empleados();
    
    /**
     *
     * @return
     */
    @Override
    public List listar() {
        ArrayList<Empleados> list = new ArrayList<>();
        String sql = "EXEC UDP_tbEmpleados_Select";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                    Empleados emp = new Empleados();
                    emp.setEmp_Id(rs.getInt("Id"));
                    emp.setEmp_Foto(rs.getString("Foto"));
                    emp.setEmp_Identidad(rs.getString("Identidad"));
                    emp.setEmp_Nombre(rs.getString("Nombre Completo"));
                    emp.setEmp_FechaNac(rs.getString("Fecha Nacimiento"));
                    emp.setEmp_FechaIngreso(rs.getString("Fecha Ingreso"));
                    emp.setEmp_Telefono(rs.getString("Teléfono"));
                    emp.setEmp_Sexo(rs.getString("Sexo"));
                    emp.setEmp_Ec(rs.getString("Estado Civil"));
                    emp.setEmp_Direccion(rs.getString("Direccion"));
                    emp.setEmp_Cargo(rs.getString("Cargo"));
                    emp.setSucursal(rs.getString("Sucursal"));
                    emp.setUsuario_Crea(rs.getString("Usuario Crea"));
                    emp.setFecha_Crea(rs.getString("Fecha Crea"));
                    emp.setUsuario_Modifica(rs.getString("Usuario modifica"));
                    emp.setFecha_Modifica(rs.getString("Fecha Modifica"));
                    
                    list.add(emp);
            }
            
        }
        catch(Exception e){
        }
        
         return list;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleados list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Empleados emp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(Empleados emp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
