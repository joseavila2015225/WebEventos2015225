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
@Table(name = "cotizaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cotizaciones.findAll", query = "SELECT c FROM Cotizaciones c")
    , @NamedQuery(name = "Cotizaciones.findByIdcotizaciones", query = "SELECT c FROM Cotizaciones c WHERE c.idcotizaciones = :idcotizaciones")
    , @NamedQuery(name = "Cotizaciones.findByNombrecotizacion", query = "SELECT c FROM Cotizaciones c WHERE c.nombrecotizacion = :nombrecotizacion")})
public class Cotizaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcotizaciones")
    private Integer idcotizaciones;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombrecotizacion")
    private String nombrecotizacion;

    public Cotizaciones() {
    }

    public Cotizaciones(Integer idcotizaciones) {
        this.idcotizaciones = idcotizaciones;
    }

    public Cotizaciones(Integer idcotizaciones, String nombrecotizacion) {
        this.idcotizaciones = idcotizaciones;
        this.nombrecotizacion = nombrecotizacion;
    }

    public Integer getIdcotizaciones() {
        return idcotizaciones;
    }

    public void setIdcotizaciones(Integer idcotizaciones) {
        this.idcotizaciones = idcotizaciones;
    }

    public String getNombrecotizacion() {
        return nombrecotizacion;
    }

    public void setNombrecotizacion(String nombrecotizacion) {
        this.nombrecotizacion = nombrecotizacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcotizaciones != null ? idcotizaciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cotizaciones)) {
            return false;
        }
        Cotizaciones other = (Cotizaciones) object;
        if ((this.idcotizaciones == null && other.idcotizaciones != null) || (this.idcotizaciones != null && !this.idcotizaciones.equals(other.idcotizaciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.joseavila.entities.Cotizaciones[ idcotizaciones=" + idcotizaciones + " ]";
    }
    
}
