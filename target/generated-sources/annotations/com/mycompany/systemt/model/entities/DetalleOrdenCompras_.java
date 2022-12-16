package com.mycompany.systemt.model.entities;

import com.mycompany.systemt.model.entities.OrdenCompras;
import com.mycompany.systemt.model.entities.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-12-16T12:14:12")
@StaticMetamodel(DetalleOrdenCompras.class)
public class DetalleOrdenCompras_ { 

    public static volatile SingularAttribute<DetalleOrdenCompras, String> cantidadCompra;
    public static volatile SingularAttribute<DetalleOrdenCompras, Long> totalCompra;
    public static volatile SingularAttribute<DetalleOrdenCompras, OrdenCompras> ordenCompraIdordenCompra;
    public static volatile SingularAttribute<DetalleOrdenCompras, Long> precioUnidad;
    public static volatile SingularAttribute<DetalleOrdenCompras, Integer> iddetalleOrdenCompra;
    public static volatile SingularAttribute<DetalleOrdenCompras, Productos> productoIdproducto;

}