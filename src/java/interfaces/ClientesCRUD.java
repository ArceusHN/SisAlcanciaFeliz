/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import model.Cliente;

/**
 *
 * @author J_Antonio526019
 */
public interface ClientesCRUD {
    public List Listar();
    public Cliente List(int id);
    public boolean add(Cliente ci);
    public boolean edit(Cliente ci);
}
