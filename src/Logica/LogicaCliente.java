
package Logica;

import Modelo.Cliente;
import Persistencia.ClienteJpaController;
import Reportes.Reporte;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LogicaCliente {
    private ClienteJpaController clienteDAO = new ClienteJpaController();
    
    public void registrar(Cliente cliente) throws Exception{
        
        if(cliente==null){
            throw  new Exception("Usuario sin información");
        }
        if(cliente.getNombrecliente().equals("")){
            throw new Exception("Nombre vacío");
        }
        
        clienteDAO.create(cliente);
    }
    
    public List<Cliente> consultarClientes(){
        return clienteDAO.findClienteEntities();
    }
    
    public boolean validarCliente(Cliente cliente){
        boolean b;
        b = !(cliente.getApellidoscliente().isEmpty() || (cliente.getCorreoelectronico().isEmpty() && cliente.getTelefono().isEmpty())
                || cliente.getIdentificacioncliente().isEmpty()
                || cliente.getNombrecliente().isEmpty());
        return b;
    }
    
    public void modificarCliente(Cliente cliente) throws Exception{
        clienteDAO.edit(cliente);
    }
    
    public Cliente consultarCliente(String idCliente){
        return clienteDAO.findCliente(idCliente);
    }
    
    public List<Cliente> consultarClienteNombre(String nombre)
    {
        return clienteDAO.findClienteName(nombre);
    }
    
    public void reporteVentasCliente(String idcliente)
    {
       String imagen = System.getProperty("user.dir") + "/src/fondoInicio.png";
       Map parametros = new HashMap<>();
       parametros.put("idcliente", idcliente);
       parametros.put("imagen", imagen);
       String ruta = System.getProperty("user.dir") + "/src/Reportes/ReporteVentasCliente";
       Reporte.abrirReporte(ruta, parametros, "ReporteVentasCliente");
    }
     
    public void reporteClientes()
    {
       String imagen = System.getProperty("user.dir") + "/src/fondoInicio.png";
       Map parametros = new HashMap<>();
       parametros.put("imagen", imagen);
       String ruta = System.getProperty("user.dir") + "/src/Reportes/ReporteClientes";
       Reporte.abrirReporte(ruta, parametros, "ReporteClientes");
    }
}
