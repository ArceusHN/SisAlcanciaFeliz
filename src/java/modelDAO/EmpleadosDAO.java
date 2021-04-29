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
        
        String sql = "EXEC UDP_tbEmpleados_SelectbyId "+id;
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                    
                    emp.setEmp_Id(rs.getInt("Id"));
                    emp.setEmp_Foto(rs.getString("Foto"));
                    emp.setEmp_Identidad(rs.getString("Identidad"));
                    emp.setEmp_PrimerNombre(rs.getString("pnombre"));
                    emp.setEmp_SegundoApellido(rs.getString("sapell"));
                    emp.setEmp_PrimerApellido(rs.getString("papell"));
                    emp.setEmp_SegundoNombre(rs.getString("snombre"));

                    emp.setEmp_FechaNac(rs.getString("Fecha Nacimiento"));
                    emp.setEmp_FechaIngreso(rs.getString("Fecha Ingreso"));
                    emp.setEmp_Telefono(rs.getString("Teléfono"));
                    
                    if(rs.getString("Sexo").equals("M")){
                        emp.setEmp_Sexo("1");
                    }else if(rs.getString("Sexo").equals("F")){
                        emp.setEmp_Sexo("2");
                    }
                    emp.setEmp_Ec(rs.getString("Estado Civil"));
                    emp.setEmp_Direccion(rs.getString("Direccion"));
                    emp.setEmp_Cargo(rs.getString("Cargo"));
                    emp.setSucursal(rs.getString("Sucursal"));
                    emp.setUsuario_Crea(rs.getString("Usuario Crea"));
                    emp.setFecha_Crea(rs.getString("Fecha Crea"));
                    emp.setUsuario_Modifica(rs.getString("Usuario modifica"));
                    emp.setFecha_Modifica(rs.getString("Fecha Modifica"));
                    
                    
                    
            }
            
        }
        catch(Exception e){
        }
        
         return emp;
    }

    @Override
    public boolean add(Empleados emp) {
        String sql="EXEC UDP_tbEmpleados_Insert"+"'"+emp.getEmp_Foto()+"','"+emp.getEmp_Identidad()+"','"+emp.getEmp_PrimerNombre()+"','"+emp.getEmp_SegundoNombre()+"','"+
                emp.getEmp_PrimerApellido()+"','"+emp.getEmp_SegundoApellido()+"','"+emp.getEmp_FechaNac()+"','"+emp.getEmp_FechaIngreso()+"','"+
                emp.getEmp_Telefono()+"','"+emp.getEmp_Sexo()+"','"+emp.getEmp_Ec()+"','"+emp.getEmp_Direccion()+"','"+
                emp.getEmp_Cargo()+"','"+emp.getSucursal()+"','"+emp.getUsuario_Crea()+"'";
                try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
                }
                catch(Exception e){
                    
                }
                
                return false;
    }

    @Override
    public boolean edit(Empleados emp) {
        
        String sql="EXEC UDP_tbEmpleados_Update "+emp.getEmp_Id()+",'"+emp.getEmp_Foto()+"','"+emp.getEmp_Identidad()+"','"+emp.getEmp_PrimerNombre()+"','"+emp.getEmp_SegundoNombre()+"','"+
                emp.getEmp_PrimerApellido()+"','"+emp.getEmp_SegundoApellido()+"','"+emp.getEmp_FechaNac()+"','"+emp.getEmp_FechaIngreso()+"','"+
                emp.getEmp_Telefono()+"','"+emp.getEmp_Sexo()+"','"+emp.getEmp_Ec()+"','"+emp.getEmp_Direccion()+"','"+
                emp.getEmp_Cargo()+"','"+emp.getSucursal()+"','"+emp.getUsuario_Modifica()+"'";
                try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
                }
                catch(Exception e){
                    
                }
                
                return false;
    }
}
