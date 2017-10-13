
package Logica;

import Modelo.Producto;
import Persistencia.ProductoJpaController;
import Persistencia.exceptions.NonexistentEntityException;
import Reportes.Reporte;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LogicaProducto {
    private ProductoJpaController productoDAO = new ProductoJpaController();
    
    public boolean registrarProducto(Producto producto) throws Exception
    {
        boolean b;
        if(validarProducto(producto)){
            ProductoJpaController pjc = new ProductoJpaController();
            pjc.create(producto);
            b=true;
        }else{
            b=false;
        }
        return b;
    }
    
    public boolean validarProducto(Producto producto)
    {
        boolean b;
        b = !(producto.getCantidadunidades()<0 || producto.getDescripcion().isEmpty() || producto.getIdproducto()==null 
                || producto.getPrecio()== null);
        return b;
    }
    
    public List<Producto> consultarProductos()
    {
        return productoDAO.findProductoEntities();
    }
    
    public Producto consultarProducto(Integer referenciaProducto)
    {
        return productoDAO.findProducto(referenciaProducto);
    }
  
     
    public List<Producto> consultarProducto(String descripcion,
                                       String talla,
                                       Integer cmin, Integer cmax,
                                       String marca, 
                                       Integer pmin, Integer pmax)
    {
        return productoDAO.findProducto(descripcion,talla,cmin,cmax,marca,pmin,pmax);
    }
    
    public void actualizar(Producto producto) throws NonexistentEntityException, Exception
    {
        productoDAO.edit(producto);
    }
    
     public void reporteInventario()
    {
       String imagen = System.getProperty("user.dir") + "/src/fondoInicio.png";
       Map parametros = new HashMap<>();
       parametros.put("imagen", imagen);
       String ruta = System.getProperty("user.dir") + "/src/Reportes/ReporteInventario";
       Reporte.abrirReporte(ruta, parametros, "Reporte Inventario");
    }
     
     
    
        
}
