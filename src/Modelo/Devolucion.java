/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "devolucion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Devolucion.findAll", query = "SELECT d FROM Devolucion d"),
    @NamedQuery(name = "Devolucion.findByIddevolucion", query = "SELECT d FROM Devolucion d WHERE d.iddevolucion = :iddevolucion"),
    @NamedQuery(name = "Devolucion.findByFecha", query = "SELECT d FROM Devolucion d WHERE d.fecha = :fecha")})
public class Devolucion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "iddevolucion")
    private Integer iddevolucion;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "idproducto", referencedColumnName = "idproducto")
    @ManyToOne
    private Producto idproducto;
    @JoinColumn(name = "identificacionusuario", referencedColumnName = "identificacionusuario")
    @ManyToOne
    private Usuario identificacionusuario;
    @JoinColumn(name = "idventa", referencedColumnName = "idventa")
    @ManyToOne
    private Venta idventa;

    public Devolucion() {
    }

    public Devolucion(Integer iddevolucion) {
        this.iddevolucion = iddevolucion;
    }

    public Integer getIddevolucion() {
        return iddevolucion;
    }

    public void setIddevolucion(Integer iddevolucion) {
        this.iddevolucion = iddevolucion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Producto getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Producto idproducto) {
        this.idproducto = idproducto;
    }

    public Usuario getIdentificacionusuario() {
        return identificacionusuario;
    }

    public void setIdentificacionusuario(Usuario identificacionusuario) {
        this.identificacionusuario = identificacionusuario;
    }

    public Venta getIdventa() {
        return idventa;
    }

    public void setIdventa(Venta idventa) {
        this.idventa = idventa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddevolucion != null ? iddevolucion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Devolucion)) {
            return false;
        }
        Devolucion other = (Devolucion) object;
        if ((this.iddevolucion == null && other.iddevolucion != null) || (this.iddevolucion != null && !this.iddevolucion.equals(other.iddevolucion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Devolucion[ iddevolucion=" + iddevolucion + " ]";
    }
    
}
