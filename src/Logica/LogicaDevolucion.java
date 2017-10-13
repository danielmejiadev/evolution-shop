package Logica;

import Modelo.Devolucion;
import Persistencia.DevolucionJpaController;
import Reportes.Reporte;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LogicaDevolucion {
    
    private DevolucionJpaController devolucionDAO = new DevolucionJpaController();
    
    public void crear(Devolucion devolucion) throws Exception
    {
        devolucionDAO.create(devolucion);
    }
    
    public List<Devolucion> buscarDevoluciones()
    {
        return devolucionDAO.findDevolucionEntities();
    }
    
    public void actualizarDevolucion(Devolucion devolucion) throws Exception
    {
        devolucionDAO.edit(devolucion);
    }
    
       public void reporteDevoluciones(Date fechainiciodevolucion, Date fechafindevolucion)
    {
       String imagen = System.getProperty("user.dir") + "/src/fondoInicio.png";
       Map parametros = new HashMap<>();
       parametros.put("fechainiciodevolucion", fechainiciodevolucion);
       parametros.put("fechafindevolucion", fechafindevolucion);
       parametros.put("imagen", imagen);
       String ruta = System.getProperty("user.dir") + "/src/Reportes/ReporteDevoluciones";
       Reporte.abrirReporte(ruta, parametros, "ReporteDevoluciones");
    }
}
