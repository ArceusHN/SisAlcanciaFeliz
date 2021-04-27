/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import model.RolPantallas;

/**
 *
 * @author Gabriel
 */
public interface RolPantallasCRUD {
    public List listar();
    public RolPantallas list(int id);
    public boolean add(RolPantallas rolpan);
    public boolean edit(RolPantallas rolpan);
}
