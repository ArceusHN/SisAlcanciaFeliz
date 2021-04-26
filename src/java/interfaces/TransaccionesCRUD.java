/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import model.Transacciones;

/*
 *
 * @author marit
 */
public interface TransaccionesCRUD {
    public List listar();
    public Transacciones list (int id);
    public boolean add(Transacciones ec);
    public boolean edit(Transacciones ec);
}
