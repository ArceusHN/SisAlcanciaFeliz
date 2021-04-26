/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import model.Cargo;

/**
 *
 * @author J_Antonio526019
 */
public interface CargosCRUD {
    public List Listar();
    public Cargo List (int id);
    public boolean add (Cargo ca);
    public boolean edit (Cargo ca);
}
