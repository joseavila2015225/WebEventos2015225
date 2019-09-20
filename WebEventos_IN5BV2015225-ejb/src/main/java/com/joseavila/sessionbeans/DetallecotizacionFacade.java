/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joseavila.sessionbeans;

import com.joseavila.entities.Detallecotizacion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author josej
 */
@Stateless
public class DetallecotizacionFacade extends AbstractFacade<Detallecotizacion> implements DetallecotizacionFacadeLocal {

    @PersistenceContext(unitName = "WebEventos_IN5BV2015225-PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DetallecotizacionFacade() {
        super(Detallecotizacion.class);
    }
    
}
