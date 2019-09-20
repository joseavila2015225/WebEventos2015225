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
@Table(name = "alimentos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alimentos.findAll", query = "SELECT a FROM Alimentos a")
    , @NamedQuery(name = "Alimentos.findByIdalimentos", query = "SELECT a FROM Alimentos a WHERE a.idalimentos = :idalimentos")
    , @NamedQuery(name = "Alimentos.findByDescripcion", query = "SELECT a FROM Alimentos a WHERE a.descripcion = :descripcion")
    , @NamedQuery(name = "Alimentos.findByPrecioventa", query = "SELECT a FROM Alimentos a WHERE a.precioventa = :precioventa")
    , @NamedQuery(name = "Alimentos.findByFechavencimiento", query = "SELECT a FROM Alimentos a WHERE a.fechavencimiento = :fechavencimiento")
    , @NamedQuery(name = "Alimentos.findByTipoproductoIdtipoproducto", query = "SELECT a FROM Alimentos a WHERE a.tipoproductoIdtipoproducto = :tipoproductoIdtipoproducto")})
public class Alimentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idalimentos")
    private Integer idalimentos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precioventa")
    private double precioventa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "fechavencimiento")
    private String fechavencimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipoproducto_idtipoproducto")
    private int tipoproductoIdtipoproducto;

    public Alimentos() {
    }

    public Alimentos(Integer idalimentos) {
        this.idalimentos = idalimentos;
    }

    public Alimentos(Integer idalimentos, String descripcion, double precioventa, String fechavencimiento, int tipoproductoIdtipoproducto) {
        this.idalimentos = idalimentos;
        this.descripcion = descripcion;
        this.precioventa = precioventa;
        this.fechavencimiento = fechavencimiento;
        this.tipoproductoIdtipoproducto = tipoproductoIdtipoproducto;
    }

    public Integer getIdalimentos() {
        return idalimentos;
    }

    public void setIdalimentos(Integer idalimentos) {
        this.idalimentos = idalimentos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(double precioventa) {
        this.precioventa = precioventa;
    }

    public String getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(String fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    public int getTipoproductoIdtipoproducto() {
        return tipoproductoIdtipoproducto;
    }

    public void setTipoproductoIdtipoproducto(int tipoproductoIdtipoproducto) {
        this.tipoproductoIdtipoproducto = tipoproductoIdtipoproducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idalimentos != null ? idalimentos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alimentos)) {
            return false;
        }
        Alimentos other = (Alimentos) object;
        if ((this.idalimentos == null && other.idalimentos != null) || (this.idalimentos != null && !this.idalimentos.equals(other.idalimentos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.joseavila.entities.Alimentos[ idalimentos=" + idalimentos + " ]";
    }
    
}
