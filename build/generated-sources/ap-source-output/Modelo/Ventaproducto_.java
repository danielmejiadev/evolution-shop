package Modelo;

import Modelo.Producto;
import Modelo.Venta;
import Modelo.VentaproductoPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-12-19T09:00:23")
@StaticMetamodel(Ventaproducto.class)
public class Ventaproducto_ { 

    public static volatile SingularAttribute<Ventaproducto, Venta> venta;
    public static volatile SingularAttribute<Ventaproducto, VentaproductoPK> ventaproductoPK;
    public static volatile SingularAttribute<Ventaproducto, Integer> cantidadvendida;
    public static volatile SingularAttribute<Ventaproducto, Integer> precioproducto;
    public static volatile SingularAttribute<Ventaproducto, Producto> producto;

}