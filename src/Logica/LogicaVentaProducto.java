
package Logica;

import Modelo.Ventaproducto;
import Modelo.VentaproductoPK;
import Persistencia.VentaproductoJpaController;


public class LogicaVentaProducto {
    private VentaproductoJpaController ventaProductoDAO = new VentaproductoJpaController();
    
    public void crear(Ventaproducto ventaproducto) throws Exception{
        ventaProductoDAO.create(ventaproducto);
    }
    
    public void eliminar(VentaproductoPK id) throws Exception{
        ventaProductoDAO.destroy(id);
    }
}
