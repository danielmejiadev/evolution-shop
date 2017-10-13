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
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByNombreusuario", query = "SELECT u FROM Usuario u WHERE u.nombreusuario = :nombreusuario"),
    @NamedQuery(name = "Usuario.findByApellidosusuario", query = "SELECT u FROM Usuario u WHERE u.apellidosusuario = :apellidosusuario"),
    @NamedQuery(name = "Usuario.findByDireccion", query = "SELECT u FROM Usuario u WHERE u.direccion = :direccion"),
    @NamedQuery(name = "Usuario.findByLogin", query = "SELECT u FROM Usuario u WHERE u.login = :login"),
    @NamedQuery(name = "Usuario.findByContrase\u00f1a", query = "SELECT u FROM Usuario u WHERE u.contrase\u00f1a = :contrase\u00f1a"),
    @NamedQuery(name = "Usuario.findByEstado", query = "SELECT u FROM Usuario u WHERE u.estado = :estado"),
    @NamedQuery(name = "Usuario.findByTipo", query = "SELECT u FROM Usuario u WHERE u.tipo = :tipo"),
    @NamedQuery(name = "Usuario.findByIdentificacionusuario", query = "SELECT u FROM Usuario u WHERE u.identificacionusuario = :identificacionusuario"),
    @NamedQuery(name = "Usuario.findByTelefonousuario", query = "SELECT u FROM Usuario u WHERE u.telefonousuario = :telefonousuario")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "nombreusuario")
    private String nombreusuario;
    @Column(name = "apellidosusuario")
    private String apellidosusuario;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "login")
    private String login;
    @Column(name = "contrase\u00f1a")
    private String contraseña;
    @Column(name = "estado")
    private Boolean estado;
    @Column(name = "tipo")
    private String tipo;
    @Id
    @Basic(optional = false)
    @Column(name = "identificacionusuario")
    private String identificacionusuario;
    @Column(name = "telefonousuario")
    private String telefonousuario;
    @OneToMany(mappedBy = "identificacionusuario")
    private List<Devolucion> devolucionList;
    @OneToMany(mappedBy = "identificacionusuario")
    private List<Venta> ventaList;

    public Usuario() {
    }

    public Usuario(String identificacionusuario) {
        this.identificacionusuario = identificacionusuario;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getApellidosusuario() {
        return apellidosusuario;
    }

    public void setApellidosusuario(String apellidosusuario) {
        this.apellidosusuario = apellidosusuario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIdentificacionusuario() {
        return identificacionusuario;
    }

    public void setIdentificacionusuario(String identificacionusuario) {
        this.identificacionusuario = identificacionusuario;
    }

    public String getTelefonousuario() {
        return telefonousuario;
    }

    public void setTelefonousuario(String telefonousuario) {
        this.telefonousuario = telefonousuario;
    }

    @XmlTransient
    public List<Devolucion> getDevolucionList() {
        return devolucionList;
    }

    public void setDevolucionList(List<Devolucion> devolucionList) {
        this.devolucionList = devolucionList;
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
        hash += (identificacionusuario != null ? identificacionusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.identificacionusuario == null && other.identificacionusuario != null) || (this.identificacionusuario != null && !this.identificacionusuario.equals(other.identificacionusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Usuario[ identificacionusuario=" + identificacionusuario + " ]";
    }
    
}
