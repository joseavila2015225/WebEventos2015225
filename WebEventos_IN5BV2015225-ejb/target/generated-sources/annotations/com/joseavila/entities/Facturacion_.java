package com.joseavila.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-19T16:56:27")
@StaticMetamodel(Facturacion.class)
public class Facturacion_ { 

    public static volatile SingularAttribute<Facturacion, String> descripcion;
    public static volatile SingularAttribute<Facturacion, Double> total;
    public static volatile SingularAttribute<Facturacion, Date> nombrefactura;
    public static volatile SingularAttribute<Facturacion, Integer> cotizacionesIdcotizaciones;
    public static volatile SingularAttribute<Facturacion, Integer> idfacturacion;
    public static volatile SingularAttribute<Facturacion, Integer> productosIdproductos;

}