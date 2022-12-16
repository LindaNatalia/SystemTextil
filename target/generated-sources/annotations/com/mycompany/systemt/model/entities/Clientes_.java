package com.mycompany.systemt.model.entities;

import com.mycompany.systemt.model.entities.OrdenEntregas;
import com.mycompany.systemt.model.entities.OrdenVentas;
import com.mycompany.systemt.model.entities.Personas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-12-16T12:14:12")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile ListAttribute<Clientes, OrdenVentas> ordenVentasList;
    public static volatile SingularAttribute<Clientes, Personas> clienteIdpersona;
    public static volatile SingularAttribute<Clientes, Integer> idcliente;
    public static volatile ListAttribute<Clientes, OrdenEntregas> ordenEntregasList;

}