package com.joseavila.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-19T16:56:27")
@StaticMetamodel(Reservacion.class)
public class Reservacion_ { 

    public static volatile SingularAttribute<Reservacion, String> descripcion;
    public static volatile SingularAttribute<Reservacion, Date> fecha;
    public static volatile SingularAttribute<Reservacion, Integer> lugarEventoidlugarEvento;
    public static volatile SingularAttribute<Reservacion, Integer> clienteIdcliente;
    public static volatile SingularAttribute<Reservacion, Date> horafin;
    public static volatile SingularAttribute<Reservacion, Integer> areaIdarea;
    public static volatile SingularAttribute<Reservacion, Integer> eventoIdevento;
    public static volatile SingularAttribute<Reservacion, Date> horainicio;
    public static volatile SingularAttribute<Reservacion, Integer> cotizacionIdcotizacion;
    public static volatile SingularAttribute<Reservacion, Integer> idreservacion;

}