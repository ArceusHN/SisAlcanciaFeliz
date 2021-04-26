/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import model.RangoTasas;

/**
 *
 * @author kenne
 */
public interface RangoTasasCRUD {
    public List listar();
    public RangoTasas list (int id);
    public boolean add(RangoTasas rt);
    public boolean edit(RangoTasas rt);
}
