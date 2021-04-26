/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import model.Cuenta;

/**
 *
 * @author Omar Fer
 */
public interface CuentasCRUD {
     public List Listar();
    public Cuenta List(int id);
    public boolean add(Cuenta ci);
    public boolean edit(Cuenta ci);
}
