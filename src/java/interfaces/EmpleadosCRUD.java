/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author DELL
 */
import java.util.List;
import model.Empleados;

public interface EmpleadosCRUD {
    public List listar();
    public Empleados list(int id) ;
    public boolean add(Empleados emp); 
    public boolean edit(Empleados emp);
}
