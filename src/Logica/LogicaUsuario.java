
package Logica;

import Modelo.Usuario;
import Persistencia.UsuarioJpaController;
import Reportes.Reporte;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LogicaUsuario {
    private UsuarioJpaController usuarioDAO = new UsuarioJpaController();
    
    public void crearUsuario(Usuario usuario) throws Exception{
        if(validarUsuario(usuario)){
            usuarioDAO.create(usuario);
        }
    }
    
    //Funcion que valida si un usuario cumple con los campos necesarios para ser ingresado a la bd
    public boolean validarUsuario(Usuario usuario){
        boolean b;
        b = !(usuario.getApellidosusuario().isEmpty() || usuario.getNombreusuario().isEmpty() || usuario.getContraseña().isEmpty() 
                || usuario.getIdentificacionusuario().isEmpty() || usuario.getTipo().isEmpty());
        return b;
    }
    
    //Funcion valida el login, la contraseña y el estado para permitir su ingreso al sistema
   public int validarIngreso(String login, String contraseña){
        List<Usuario> usuarios = usuarioDAO.findUsuarioEntities();
        int i=0, j=0;
        
        while(i<usuarios.size()){
            if((usuarios.get(i).getLogin().equalsIgnoreCase(login)) && 
                    (usuarios.get(i).getContraseña().equalsIgnoreCase(contraseña)) &&
                    usuarios.get(i).getEstado() && usuarios.get(i).getTipo().equalsIgnoreCase("administrador")){
                j=1;
            }else{
            if((usuarios.get(i).getLogin().equalsIgnoreCase(login)) && 
                    (usuarios.get(i).getContraseña().equalsIgnoreCase(contraseña)) &&
                    usuarios.get(i).getEstado() && usuarios.get(i).getTipo().equalsIgnoreCase("vendedor")){
                j=2;
            }
        }
            i++;
        }
   
        return j;
    }
    
    public List<Usuario> consultarUsuarios(){
        return usuarioDAO.findUsuarioEntities();
    }
    
    public Usuario consultarUsuario(String id){
        return usuarioDAO.findUsuario(id);
    }
    
    public void actualizar(Usuario usuario) throws Exception{
        usuarioDAO.edit(usuario);
    }
    
    public void reporteVentasVendedor(String idvendedor)
    {
       String imagen = System.getProperty("user.dir") + "/src/fondoInicio.png";
       Map parametros = new HashMap<>();
       parametros.put("idvendedor", idvendedor);
       parametros.put("imagen", imagen);
       String ruta = System.getProperty("user.dir") + "/src/Reportes/ReporteVentasVendedor";
       Reporte.abrirReporte(ruta, parametros, "ReporteVentasVendedor");
    }
}
