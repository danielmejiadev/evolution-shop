package Modelo;

import Modelo.Devolucion;
import Modelo.Ventaproducto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-12-19T09:00:23")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile SingularAttribute<Producto, String> marca;
    public static volatile SingularAttribute<Producto, Integer> precio;
    public static volatile SingularAttribute<Producto, String> talla;
    public static volatile ListAttribute<Producto, Devolucion> devolucionList;
    public static volatile ListAttribute<Producto, Ventaproducto> ventaproductoList;
    public static volatile SingularAttribute<Producto, Integer> cantidadunidades;
    public static volatile SingularAttribute<Producto, Integer> idproducto;

}