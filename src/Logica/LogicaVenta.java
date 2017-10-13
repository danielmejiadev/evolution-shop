package Logica;

import Modelo.Venta;
import Persistencia.VentaJpaController;
import Persistencia.exceptions.IllegalOrphanException;
import Persistencia.exceptions.NonexistentEntityException;
import Reportes.Reporte;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LogicaVenta {
    private VentaJpaController ventaDAO = new VentaJpaController();
    
    public void registrarVenta(Venta venta) throws Exception{
        ventaDAO.create(venta);
    }
    
    public List<Venta> consultarVentas(){
        return ventaDAO.findVentaEntities();
    }
    
    public Venta consultarVenta(Integer id_venta){
        return ventaDAO.findVenta(id_venta);
    }
    
    public void actualizarVenta(Venta venta) throws NonexistentEntityException, Exception{
        ventaDAO.edit(venta);
    }
    
    public void eliminarVenta(Integer idVenta) throws IllegalOrphanException, NonexistentEntityException{
        ventaDAO.destroy(idVenta);
    }
    
      public void reporteVentas(Date fechainicioventas, Date fechafinventas)
    {
       String imagen = System.getProperty("user.dir") + "/src/fondoInicio.png";
       Map parametros = new HashMap<>();
       parametros.put("fechainicioventas", fechainicioventas);
       parametros.put("fechafinventas", fechafinventas);
       parametros.put("imagen", imagen);
       String ruta = System.getProperty("user.dir") + "/src/Reportes/ReporteVentas";
       Reporte.abrirReporte(ruta, parametros, "ReporteVentas");
    }
    
    
}
