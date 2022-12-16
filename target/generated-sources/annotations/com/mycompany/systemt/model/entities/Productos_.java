package com.mycompany.systemt.model.entities;

import com.mycompany.systemt.model.entities.Colores;
import com.mycompany.systemt.model.entities.DetalleOrdenCompras;
import com.mycompany.systemt.model.entities.DetalleOrdenVentas;
import com.mycompany.systemt.model.entities.Proveedores;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-12-16T12:14:12")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, String> descripcion;
    public static volatile ListAttribute<Productos, Proveedores> proveedoresList;
    public static volatile SingularAttribute<Productos, Integer> unidadMedida;
    public static volatile ListAttribute<Productos, DetalleOrdenVentas> detalleOrdenVentasList;
    public static volatile ListAttribute<Productos, DetalleOrdenCompras> detalleOrdenComprasList;
    public static volatile SingularAttribute<Productos, Long> precioUnidad;
    public static volatile SingularAttribute<Productos, Colores> colorIdcolor;
    public static volatile SingularAttribute<Productos, Integer> stock;
    public static volatile SingularAttribute<Productos, Integer> idproducto;
    public static volatile SingularAttribute<Productos, String> nombreProducto;

}