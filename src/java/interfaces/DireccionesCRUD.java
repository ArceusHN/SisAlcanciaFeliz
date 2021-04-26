
package interfaces;

import java.util.List;
import model.Direcciones;


public interface DireccionesCRUD {
    public List listar();
    public Direcciones list (int id);
    public boolean add (Direcciones dr);
    public boolean edit (Direcciones dr);
}
