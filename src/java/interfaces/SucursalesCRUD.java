
package interfaces;

import java.util.List;
import model.Sucursales;

public interface SucursalesCRUD {
    public List listar();
    public Sucursales list (int id);
    public boolean add (Sucursales sc);
    public boolean edit (Sucursales sc);
}
