/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByNombrecliente", query = "SELECT c FROM Cliente c WHERE c.nombrecliente = :nombrecliente"),
    @NamedQuery(name = "Cliente.findByApellidoscliente", query = "SELECT c FROM Cliente c WHERE c.apellidoscliente = :apellidoscliente"),
    @NamedQuery(name = "Cliente.findByDireccion", query = "SELECT c FROM Cliente c WHERE c.direccion = :direccion"),
    @NamedQuery(name = "Cliente.findByCorreoelectronico", query = "SELECT c FROM Cliente c WHERE c.correoelectronico = :correoelectronico"),
    @NamedQuery(name = "Cliente.findByTelefono", query = "SELECT c FROM Cliente c WHERE c.telefono = :telefono"),
    @NamedQuery(name = "Cliente.findByIdentificacioncliente", query = "SELECT c FROM Cliente c WHERE c.identificacioncliente = :identificacioncliente")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "nombrecliente")
    private String nombrecliente;
    @Column(name = "apellidoscliente")
    private String apellidoscliente;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "correoelectronico")
    private String correoelectronico;
    @Column(name = "telefono")
    private String telefono;
    @Id
    @Basic(optional = false)
    @Column(name = "identificacioncliente")
    private String identificacioncliente;
    @OneToMany(mappedBy = "identificacioncliente")
    private List<Venta> ventaList;

    public Cliente() {
    }

    public Cliente(String identificacioncliente) {
        this.identificacioncliente = identificacioncliente;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getApellidoscliente() {
        return apellidoscliente;
    }

    public void setApellidoscliente(String apellidoscliente) {
        this.apellidoscliente = apellidoscliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIdentificacioncliente() {
        return identificacioncliente;
    }

    public void setIdentificacioncliente(String identificacioncliente) {
        this.identificacioncliente = identificacioncliente;
    }

    @XmlTransient
    public List<Venta> getVentaList() {
        return ventaList;
    }

    public void setVentaList(List<Venta> ventaList) {
        this.ventaList = ventaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identificacioncliente != null ? identificacioncliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.identificacioncliente == null && other.identificacioncliente != null) || (this.identificacioncliente != null && !this.identificacioncliente.equals(other.identificacioncliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Cliente[ identificacioncliente=" + identificacioncliente + " ]";
    }
    
}
