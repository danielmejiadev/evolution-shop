/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "ventaproducto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ventaproducto.findAll", query = "SELECT v FROM Ventaproducto v"),
    @NamedQuery(name = "Ventaproducto.findByIdventa", query = "SELECT v FROM Ventaproducto v WHERE v.ventaproductoPK.idventa = :idventa"),
    @NamedQuery(name = "Ventaproducto.findByIdproducto", query = "SELECT v FROM Ventaproducto v WHERE v.ventaproductoPK.idproducto = :idproducto"),
    @NamedQuery(name = "Ventaproducto.findByCantidadvendida", query = "SELECT v FROM Ventaproducto v WHERE v.cantidadvendida = :cantidadvendida"),
    @NamedQuery(name = "Ventaproducto.findByPrecioproducto", query = "SELECT v FROM Ventaproducto v WHERE v.precioproducto = :precioproducto")})
public class Ventaproducto implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VentaproductoPK ventaproductoPK;
    @Column(name = "cantidadvendida")
    private Integer cantidadvendida;
    @Column(name = "precioproducto")
    private Integer precioproducto;
    @JoinColumn(name = "idproducto", referencedColumnName = "idproducto", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Producto producto;
    @JoinColumn(name = "idventa", referencedColumnName = "idventa", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Venta venta;

    public Ventaproducto() {
    }

    public Ventaproducto(VentaproductoPK ventaproductoPK) {
        this.ventaproductoPK = ventaproductoPK;
    }

    public Ventaproducto(int idventa, int idproducto) {
        this.ventaproductoPK = new VentaproductoPK(idventa, idproducto);
    }

    public VentaproductoPK getVentaproductoPK() {
        return ventaproductoPK;
    }

    public void setVentaproductoPK(VentaproductoPK ventaproductoPK) {
        this.ventaproductoPK = ventaproductoPK;
    }

    public Integer getCantidadvendida() {
        return cantidadvendida;
    }

    public void setCantidadvendida(Integer cantidadvendida) {
        this.cantidadvendida = cantidadvendida;
    }

    public Integer getPrecioproducto() {
        return precioproducto;
    }

    public void setPrecioproducto(Integer precioproducto) {
        this.precioproducto = precioproducto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ventaproductoPK != null ? ventaproductoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ventaproducto)) {
            return false;
        }
        Ventaproducto other = (Ventaproducto) object;
        if ((this.ventaproductoPK == null && other.ventaproductoPK != null) || (this.ventaproductoPK != null && !this.ventaproductoPK.equals(other.ventaproductoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Ventaproducto[ ventaproductoPK=" + ventaproductoPK + " ]";
    }
    
}
