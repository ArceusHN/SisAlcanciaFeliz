/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import model.Prestamos;

/**
 *
 * @author kenne
 */
public interface PrestamosCRUD {
    public List listar();
    public Prestamos list (int id);
    public boolean add(Prestamos ec);
    public boolean edit(Prestamos ec);
}
