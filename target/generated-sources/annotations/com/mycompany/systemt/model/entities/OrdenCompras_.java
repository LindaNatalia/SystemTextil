package com.mycompany.systemt.model.entities;

import com.mycompany.systemt.model.entities.DetalleOrdenCompras;
import com.mycompany.systemt.model.entities.Novedades;
import com.mycompany.systemt.model.entities.Personas;
import com.mycompany.systemt.model.entities.Proveedores;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-12-16T12:14:12")
@StaticMetamodel(OrdenCompras.class)
public class OrdenCompras_ { 

    public static volatile SingularAttribute<OrdenCompras, Long> totalCompra;
    public static volatile SingularAttribute<OrdenCompras, Date> fechaCompra;
    public static volatile ListAttribute<OrdenCompras, Novedades> novedadesList;
    public static volatile ListAttribute<OrdenCompras, DetalleOrdenCompras> detalleOrdenComprasList;
    public static volatile SingularAttribute<OrdenCompras, Proveedores> proveedorIdproveedor;
    public static volatile SingularAttribute<OrdenCompras, Integer> idordenCompra;
    public static volatile SingularAttribute<OrdenCompras, Personas> personaIdpersona;

}