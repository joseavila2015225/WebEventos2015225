/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joseavila.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author josej
 */
@Entity
@Table(name = "detallecotizacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallecotizacion.findAll", query = "SELECT d FROM Detallecotizacion d")
    , @NamedQuery(name = "Detallecotizacion.findByIddetallecotizacion", query = "SELECT d FROM Detallecotizacion d WHERE d.iddetallecotizacion = :iddetallecotizacion")
    , @NamedQuery(name = "Detallecotizacion.findByDescripcion", query = "SELECT d FROM Detallecotizacion d WHERE d.descripcion = :descripcion")
    , @NamedQuery(name = "Detallecotizacion.findByCantidad", query = "SELECT d FROM Detallecotizacion d WHERE d.cantidad = :cantidad")
    , @NamedQuery(name = "Detallecotizacion.findByPrecioventa", query = "SELECT d FROM Detallecotizacion d WHERE d.precioventa = :precioventa")
    , @NamedQuery(name = "Detallecotizacion.findByAlimentosIdalimentos", query = "SELECT d FROM Detallecotizacion d WHERE d.alimentosIdalimentos = :alimentosIdalimentos")
    , @NamedQuery(name = "Detallecotizacion.findByCotizacionIdcotizacion", query = "SELECT d FROM Detallecotizacion d WHERE d.cotizacionIdcotizacion = :cotizacionIdcotizacion")})
public class Detallecotizacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddetallecotizacion")
    private Integer iddetallecotizacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "cantidad")
    private String cantidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "precioventa")
    private String precioventa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "alimentos_idalimentos")
    private int alimentosIdalimentos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cotizacion_idcotizacion")
    private int cotizacionIdcotizacion;

    public Detallecotizacion() {
    }

    public Detallecotizacion(Integer iddetallecotizacion) {
        this.iddetallecotizacion = iddetallecotizacion;
    }

    public Detallecotizacion(Integer iddetallecotizacion, String descripcion, String cantidad, String precioventa, int alimentosIdalimentos, int cotizacionIdcotizacion) {
        this.iddetallecotizacion = iddetallecotizacion;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioventa = precioventa;
        this.alimentosIdalimentos = alimentosIdalimentos;
        this.cotizacionIdcotizacion = cotizacionIdcotizacion;
    }

    public Integer getIddetallecotizacion() {
        return iddetallecotizacion;
    }

    public void setIddetallecotizacion(Integer iddetallecotizacion) {
        this.iddetallecotizacion = iddetallecotizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(String precioventa) {
        this.precioventa = precioventa;
    }

    public int getAlimentosIdalimentos() {
        return alimentosIdalimentos;
    }

    public void setAlimentosIdalimentos(int alimentosIdalimentos) {
        this.alimentosIdalimentos = alimentosIdalimentos;
    }

    public int getCotizacionIdcotizacion() {
        return cotizacionIdcotizacion;
    }

    public void setCotizacionIdcotizacion(int cotizacionIdcotizacion) {
        this.cotizacionIdcotizacion = cotizacionIdcotizacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetallecotizacion != null ? iddetallecotizacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallecotizacion)) {
            return false;
        }
        Detallecotizacion other = (Detallecotizacion) object;
        if ((this.iddetallecotizacion == null && other.iddetallecotizacion != null) || (this.iddetallecotizacion != null && !this.iddetallecotizacion.equals(other.iddetallecotizacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.joseavila.entities.Detallecotizacion[ iddetallecotizacion=" + iddetallecotizacion + " ]";
    }
    
}
