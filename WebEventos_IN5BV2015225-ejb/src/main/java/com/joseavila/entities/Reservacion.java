/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joseavila.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author josej
 */
@Entity
@Table(name = "reservacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservacion.findAll", query = "SELECT r FROM Reservacion r")
    , @NamedQuery(name = "Reservacion.findByIdreservacion", query = "SELECT r FROM Reservacion r WHERE r.idreservacion = :idreservacion")
    , @NamedQuery(name = "Reservacion.findByFecha", query = "SELECT r FROM Reservacion r WHERE r.fecha = :fecha")
    , @NamedQuery(name = "Reservacion.findByHorainicio", query = "SELECT r FROM Reservacion r WHERE r.horainicio = :horainicio")
    , @NamedQuery(name = "Reservacion.findByHorafin", query = "SELECT r FROM Reservacion r WHERE r.horafin = :horafin")
    , @NamedQuery(name = "Reservacion.findByDescripcion", query = "SELECT r FROM Reservacion r WHERE r.descripcion = :descripcion")
    , @NamedQuery(name = "Reservacion.findByLugarEventoidlugarEvento", query = "SELECT r FROM Reservacion r WHERE r.lugarEventoidlugarEvento = :lugarEventoidlugarEvento")
    , @NamedQuery(name = "Reservacion.findByAreaIdarea", query = "SELECT r FROM Reservacion r WHERE r.areaIdarea = :areaIdarea")
    , @NamedQuery(name = "Reservacion.findByEventoIdevento", query = "SELECT r FROM Reservacion r WHERE r.eventoIdevento = :eventoIdevento")
    , @NamedQuery(name = "Reservacion.findByCotizacionIdcotizacion", query = "SELECT r FROM Reservacion r WHERE r.cotizacionIdcotizacion = :cotizacionIdcotizacion")
    , @NamedQuery(name = "Reservacion.findByClienteIdcliente", query = "SELECT r FROM Reservacion r WHERE r.clienteIdcliente = :clienteIdcliente")})
public class Reservacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idreservacion")
    private Integer idreservacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "horainicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horainicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "horafin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horafin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lugarEvento_idlugarEvento")
    private int lugarEventoidlugarEvento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "area_idarea")
    private int areaIdarea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "evento_idevento")
    private int eventoIdevento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cotizacion_idcotizacion")
    private int cotizacionIdcotizacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cliente_idcliente")
    private int clienteIdcliente;

    public Reservacion() {
    }

    public Reservacion(Integer idreservacion) {
        this.idreservacion = idreservacion;
    }

    public Reservacion(Integer idreservacion, Date fecha, Date horainicio, Date horafin, String descripcion, int lugarEventoidlugarEvento, int areaIdarea, int eventoIdevento, int cotizacionIdcotizacion, int clienteIdcliente) {
        this.idreservacion = idreservacion;
        this.fecha = fecha;
        this.horainicio = horainicio;
        this.horafin = horafin;
        this.descripcion = descripcion;
        this.lugarEventoidlugarEvento = lugarEventoidlugarEvento;
        this.areaIdarea = areaIdarea;
        this.eventoIdevento = eventoIdevento;
        this.cotizacionIdcotizacion = cotizacionIdcotizacion;
        this.clienteIdcliente = clienteIdcliente;
    }

    public Integer getIdreservacion() {
        return idreservacion;
    }

    public void setIdreservacion(Integer idreservacion) {
        this.idreservacion = idreservacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(Date horainicio) {
        this.horainicio = horainicio;
    }

    public Date getHorafin() {
        return horafin;
    }

    public void setHorafin(Date horafin) {
        this.horafin = horafin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getLugarEventoidlugarEvento() {
        return lugarEventoidlugarEvento;
    }

    public void setLugarEventoidlugarEvento(int lugarEventoidlugarEvento) {
        this.lugarEventoidlugarEvento = lugarEventoidlugarEvento;
    }

    public int getAreaIdarea() {
        return areaIdarea;
    }

    public void setAreaIdarea(int areaIdarea) {
        this.areaIdarea = areaIdarea;
    }

    public int getEventoIdevento() {
        return eventoIdevento;
    }

    public void setEventoIdevento(int eventoIdevento) {
        this.eventoIdevento = eventoIdevento;
    }

    public int getCotizacionIdcotizacion() {
        return cotizacionIdcotizacion;
    }

    public void setCotizacionIdcotizacion(int cotizacionIdcotizacion) {
        this.cotizacionIdcotizacion = cotizacionIdcotizacion;
    }

    public int getClienteIdcliente() {
        return clienteIdcliente;
    }

    public void setClienteIdcliente(int clienteIdcliente) {
        this.clienteIdcliente = clienteIdcliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreservacion != null ? idreservacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservacion)) {
            return false;
        }
        Reservacion other = (Reservacion) object;
        if ((this.idreservacion == null && other.idreservacion != null) || (this.idreservacion != null && !this.idreservacion.equals(other.idreservacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.joseavila.entities.Reservacion[ idreservacion=" + idreservacion + " ]";
    }
    
}
