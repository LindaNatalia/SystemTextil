package com.mycompany.systemt.model.entities;

import com.mycompany.systemt.model.entities.OrdenCompras;
import com.mycompany.systemt.model.entities.Personas;
import com.mycompany.systemt.model.entities.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-12-16T12:14:12")
@StaticMetamodel(Proveedores.class)
public class Proveedores_ { 

    public static volatile SingularAttribute<Proveedores, Integer> idproveedor;
    public static volatile ListAttribute<Proveedores, OrdenCompras> ordenComprasList;
    public static volatile ListAttribute<Proveedores, Productos> productosList;
    public static volatile SingularAttribute<Proveedores, Personas> personaIdpersona;

}