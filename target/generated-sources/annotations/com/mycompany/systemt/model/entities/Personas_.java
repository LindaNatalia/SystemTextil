package com.mycompany.systemt.model.entities;

import com.mycompany.systemt.model.entities.Clientes;
import com.mycompany.systemt.model.entities.Estados;
import com.mycompany.systemt.model.entities.OrdenCompras;
import com.mycompany.systemt.model.entities.OrdenVentas;
import com.mycompany.systemt.model.entities.Proveedores;
import com.mycompany.systemt.model.entities.Roles;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-12-16T12:14:12")
@StaticMetamodel(Personas.class)
public class Personas_ { 

    public static volatile ListAttribute<Personas, OrdenVentas> ordenVentasList;
    public static volatile SingularAttribute<Personas, String> barrio;
    public static volatile SingularAttribute<Personas, String> clave;
    public static volatile ListAttribute<Personas, Clientes> clientesList;
    public static volatile SingularAttribute<Personas, Integer> idpersona;
    public static volatile SingularAttribute<Personas, String> direccion;
    public static volatile SingularAttribute<Personas, String> nombre;
    public static volatile SingularAttribute<Personas, Estados> estadoIdestado;
    public static volatile SingularAttribute<Personas, String> tipoDocumento;
    public static volatile ListAttribute<Personas, Proveedores> proveedoresList;
    public static volatile ListAttribute<Personas, OrdenCompras> ordenComprasList;
    public static volatile SingularAttribute<Personas, String> apellido;
    public static volatile SingularAttribute<Personas, String> correo;
    public static volatile SingularAttribute<Personas, String> numeroDocumento;
    public static volatile SingularAttribute<Personas, String> telefono;
    public static volatile SingularAttribute<Personas, Roles> rolIdrol;

}