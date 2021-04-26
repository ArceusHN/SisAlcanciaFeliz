/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import model.TipoTransacciones;

/**
 *
 * @author marit
 */
public interface TipoTransaccionCRUD {
    public List listar();
    public TipoTransacciones list (int id);
    public boolean add(TipoTransacciones ec);
    public boolean edit(TipoTransacciones ec);
}
