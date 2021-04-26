package interfaces;

import java.util.List;
import model.TipoCuentas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Omar Fer
 */
public interface TipoCuentasCrud {
    public List listar();
    public TipoCuentas list (int id);
    public boolean add(TipoCuentas ec);
    public boolean edit(TipoCuentas ec);
}
