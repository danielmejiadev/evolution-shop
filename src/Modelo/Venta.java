/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venta.findAll", query = "SELECT v FROM Venta v"),
    @NamedQuery(name = "Venta.findByIdventa", query = "SELECT v FROM Venta v WHERE v.idventa = :idventa"),
    @NamedQuery(name = "Venta.findByFecha", query = "SELECT v FROM Venta v WHERE v.fecha = :fecha"),
    @NamedQuery(name = "Venta.findByDescuento", query = "SELECT v FROM Venta v WHERE v.descuento = :descuento"),
    @NamedQuery(name = "Venta.findByMontototal", query = "SELECT v FROM Venta v WHERE v.montototal = :montototal")})
public class Venta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idventa")
    private Integer idventa;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "descuento")
    private Integer descuento;
    @Column(name = "montototal")
    private Integer montototal;
    @OneToMany(mappedBy = "idventa")
    private List<Devolucion> devolucionList;
    @JoinColumn(name = "identificacioncliente", referencedColumnName = "identificacioncliente")
    @ManyToOne
    private Cliente identificacioncliente;
    @JoinColumn(name = "identificacionusuario", referencedColumnName = "identificacionusuario")
    @ManyToOne
    private Usuario identificacionusuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "venta")
    private List<Ventaproducto> ventaproductoList;

    public Venta() {
    }

    public Venta(Integer idventa) {
        this.idventa = idventa;
    }

    public Integer getIdventa() {
        return idventa;
    }

    public void setIdventa(Integer idventa) {
        this.idventa = idventa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getDescuento() {
        return descuento;
    }

    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }

    public Integer getMontototal() {
        return montototal;
    }

    public void setMontototal(Integer montototal) {
        this.montototal = montototal;
    }

    @XmlTransient
    public List<Devolucion> getDevolucionList() {
        return devolucionList;
    }

    public void setDevolucionList(List<Devolucion> devolucionList) {
        this.devolucionList = devolucionList;
    }

    public Cliente getIdentificacioncliente() {
        return identificacioncliente;
    }

    public void setIdentificacioncliente(Cliente identificacioncliente) {
        this.identificacioncliente = identificacioncliente;
    }

    public Usuario getIdentificacionusuario() {
        return identificacionusuario;
    }

    public void setIdentificacionusuario(Usuario identificacionusuario) {
        this.identificacionusuario = identificacionusuario;
    }

    @XmlTransient
    public List<Ventaproducto> getVentaproductoList() {
        return ventaproductoList;
    }

    public void setVentaproductoList(List<Ventaproducto> ventaproductoList) {
        this.ventaproductoList = ventaproductoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idventa != null ? idventa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.idventa == null && other.idventa != null) || (this.idventa != null && !this.idventa.equals(other.idventa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Venta[ idventa=" + idventa + " ]";
    }
    
}
