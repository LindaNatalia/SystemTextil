package com.mycompany.systemt.model.entities;

import com.mycompany.systemt.model.entities.Clientes;
import com.mycompany.systemt.model.entities.DetalleOrdenVentas;
import com.mycompany.systemt.model.entities.Novedades;
import com.mycompany.systemt.model.entities.Personas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-12-16T12:14:12")
@StaticMetamodel(OrdenVentas.class)
public class OrdenVentas_ { 

    public static volatile SingularAttribute<OrdenVentas, Integer> idordenVenta;
    public static volatile SingularAttribute<OrdenVentas, Clientes> clienteIdcliente;
    public static volatile SingularAttribute<OrdenVentas, Short> domicilio;
    public static volatile ListAttribute<OrdenVentas, DetalleOrdenVentas> detalleOrdenVentasList;
    public static volatile ListAttribute<OrdenVentas, Novedades> novedadesList;
    public static volatile SingularAttribute<OrdenVentas, Long> totalVenta;
    public static volatile SingularAttribute<OrdenVentas, Date> fechaVenta;
    public static volatile SingularAttribute<OrdenVentas, Personas> personaIdpersona;

}