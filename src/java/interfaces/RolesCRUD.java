/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import model.Roles;

/**
 *
 * @author Robredo
 */
public interface RolesCRUD {
    public List listar();
    public Roles list(int id);
    public boolean add(Roles roles);
    public boolean edit(Roles roles);
}
