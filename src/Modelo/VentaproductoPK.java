/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Daniel
 */
@Embeddable
public class VentaproductoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "idventa")
    private int idventa;
    @Basic(optional = false)
    @Column(name = "idproducto")
    private int idproducto;

    public VentaproductoPK() {
    }

    public VentaproductoPK(int idventa, int idproducto) {
        this.idventa = idventa;
        this.idproducto = idproducto;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idventa;
        hash += (int) idproducto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VentaproductoPK)) {
            return false;
        }
        VentaproductoPK other = (VentaproductoPK) object;
        if (this.idventa != other.idventa) {
            return false;
        }
        if (this.idproducto != other.idproducto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.VentaproductoPK[ idventa=" + idventa + ", idproducto=" + idproducto + " ]";
    }
    
}
