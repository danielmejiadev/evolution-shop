package Modelo;

import Modelo.Cliente;
import Modelo.Devolucion;
import Modelo.Usuario;
import Modelo.Ventaproducto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-12-19T09:00:23")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Integer> idventa;
    public static volatile SingularAttribute<Venta, Date> fecha;
    public static volatile SingularAttribute<Venta, Usuario> identificacionusuario;
    public static volatile SingularAttribute<Venta, Integer> descuento;
    public static volatile ListAttribute<Venta, Devolucion> devolucionList;
    public static volatile ListAttribute<Venta, Ventaproducto> ventaproductoList;
    public static volatile SingularAttribute<Venta, Cliente> identificacioncliente;
    public static volatile SingularAttribute<Venta, Integer> montototal;

}