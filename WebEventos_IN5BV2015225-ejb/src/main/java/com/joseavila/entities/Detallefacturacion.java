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
@Table(name = "detallefacturacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallefacturacion.findAll", query = "SELECT d FROM Detallefacturacion d")
    , @NamedQuery(name = "Detallefacturacion.findByIddetallefacturacion", query = "SELECT d FROM Detallefacturacion d WHERE d.iddetallefacturacion = :iddetallefacturacion")
    , @NamedQuery(name = "Detallefacturacion.findByAlimentosIdalimentos", query = "SELECT d FROM Detallefacturacion d WHERE d.alimentosIdalimentos = :alimentosIdalimentos")
    , @NamedQuery(name = "Detallefacturacion.findByCantidad", query = "SELECT d FROM Detallefacturacion d WHERE d.cantidad = :cantidad")
    , @NamedQuery(name = "Detallefacturacion.findByPreciove", query = "SELECT d FROM Detallefacturacion d WHERE d.preciove = :preciove")
    , @NamedQuery(name = "Detallefacturacion.findByFacturacionIdfacturacion", query = "SELECT d FROM Detallefacturacion d WHERE d.facturacionIdfacturacion = :facturacionIdfacturacion")})
public class Detallefacturacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddetallefacturacion")
    private Integer iddetallefacturacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "alimentos_idalimentos")
    private int alimentosIdalimentos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "cantidad")
    private String cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "preciove")
    private double preciove;
    @Basic(optional = false)
    @NotNull
    @Column(name = "facturacion_idfacturacion")
    private int facturacionIdfacturacion;

    public Detallefacturacion() {
    }

    public Detallefacturacion(Integer iddetallefacturacion) {
        this.iddetallefacturacion = iddetallefacturacion;
    }

    public Detallefacturacion(Integer iddetallefacturacion, int alimentosIdalimentos, String cantidad, double preciove, int facturacionIdfacturacion) {
        this.iddetallefacturacion = iddetallefacturacion;
        this.alimentosIdalimentos = alimentosIdalimentos;
        this.cantidad = cantidad;
        this.preciove = preciove;
        this.facturacionIdfacturacion = facturacionIdfacturacion;
    }

    public Integer getIddetallefacturacion() {
        return iddetallefacturacion;
    }

    public void setIddetallefacturacion(Integer iddetallefacturacion) {
        this.iddetallefacturacion = iddetallefacturacion;
    }

    public int getAlimentosIdalimentos() {
        return alimentosIdalimentos;
    }

    public void setAlimentosIdalimentos(int alimentosIdalimentos) {
        this.alimentosIdalimentos = alimentosIdalimentos;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public double getPreciove() {
        return preciove;
    }

    public void setPreciove(double preciove) {
        this.preciove = preciove;
    }

    public int getFacturacionIdfacturacion() {
        return facturacionIdfacturacion;
    }

    public void setFacturacionIdfacturacion(int facturacionIdfacturacion) {
        this.facturacionIdfacturacion = facturacionIdfacturacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetallefacturacion != null ? iddetallefacturacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallefacturacion)) {
            return false;
        }
        Detallefacturacion other = (Detallefacturacion) object;
        if ((this.iddetallefacturacion == null && other.iddetallefacturacion != null) || (this.iddetallefacturacion != null && !this.iddetallefacturacion.equals(other.iddetallefacturacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.joseavila.entities.Detallefacturacion[ iddetallefacturacion=" + iddetallefacturacion + " ]";
    }
    
}
