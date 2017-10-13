package Modelo;

import Modelo.Producto;
import Modelo.Usuario;
import Modelo.Venta;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-12-19T09:00:23")
@StaticMetamodel(Devolucion.class)
public class Devolucion_ { 

    public static volatile SingularAttribute<Devolucion, Venta> idventa;
    public static volatile SingularAttribute<Devolucion, Date> fecha;
    public static volatile SingularAttribute<Devolucion, Usuario> identificacionusuario;
    public static volatile SingularAttribute<Devolucion, Integer> iddevolucion;
    public static volatile SingularAttribute<Devolucion, Producto> idproducto;

}