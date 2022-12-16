package com.mycompany.systemt.model.entities;

import com.mycompany.systemt.model.entities.OrdenEntregas;
import com.mycompany.systemt.model.entities.OrdenVentas;
import com.mycompany.systemt.model.entities.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-12-16T12:14:12")
@StaticMetamodel(DetalleOrdenVentas.class)
public class DetalleOrdenVentas_ { 

    public static volatile SingularAttribute<DetalleOrdenVentas, String> cantidadVenta;
    public static volatile SingularAttribute<DetalleOrdenVentas, OrdenVentas> ordenVentaIdordenVenta;
    public static volatile SingularAttribute<DetalleOrdenVentas, Integer> iddetalleOrdenVenta;
    public static volatile SingularAttribute<DetalleOrdenVentas, Long> precioUnidad;
    public static volatile SingularAttribute<DetalleOrdenVentas, Long> totalVenta;
    public static volatile SingularAttribute<DetalleOrdenVentas, Productos> productoIdproducto;
    public static volatile ListAttribute<DetalleOrdenVentas, OrdenEntregas> ordenEntregasList;

}