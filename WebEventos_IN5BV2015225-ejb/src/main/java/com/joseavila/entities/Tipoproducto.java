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
@Table(name = "tipoproducto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoproducto.findAll", query = "SELECT t FROM Tipoproducto t")
    , @NamedQuery(name = "Tipoproducto.findByIdtipoproducto", query = "SELECT t FROM Tipoproducto t WHERE t.idtipoproducto = :idtipoproducto")
    , @NamedQuery(name = "Tipoproducto.findByDescripcion", query = "SELECT t FROM Tipoproducto t WHERE t.descripcion = :descripcion")})
public class Tipoproducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipoproducto")
    private Integer idtipoproducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descripcion")
    private String descripcion;

    public Tipoproducto() {
    }

    public Tipoproducto(Integer idtipoproducto) {
        this.idtipoproducto = idtipoproducto;
    }

    public Tipoproducto(Integer idtipoproducto, String descripcion) {
        this.idtipoproducto = idtipoproducto;
        this.descripcion = descripcion;
    }

    public Integer getIdtipoproducto() {
        return idtipoproducto;
    }

    public void setIdtipoproducto(Integer idtipoproducto) {
        this.idtipoproducto = idtipoproducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoproducto != null ? idtipoproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoproducto)) {
            return false;
        }
        Tipoproducto other = (Tipoproducto) object;
        if ((this.idtipoproducto == null && other.idtipoproducto != null) || (this.idtipoproducto != null && !this.idtipoproducto.equals(other.idtipoproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.joseavila.entities.Tipoproducto[ idtipoproducto=" + idtipoproducto + " ]";
    }
    
}
