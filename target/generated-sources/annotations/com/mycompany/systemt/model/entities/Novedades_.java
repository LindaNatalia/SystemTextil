package com.mycompany.systemt.model.entities;

import com.mycompany.systemt.model.entities.OrdenCompras;
import com.mycompany.systemt.model.entities.OrdenEntregas;
import com.mycompany.systemt.model.entities.OrdenVentas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-12-16T12:14:12")
@StaticMetamodel(Novedades.class)
public class Novedades_ { 

    public static volatile SingularAttribute<Novedades, Integer> idnovedad;
    public static volatile SingularAttribute<Novedades, String> descripcion;
    public static volatile SingularAttribute<Novedades, Date> fecha;
    public static volatile SingularAttribute<Novedades, OrdenVentas> ordenventaId;
    public static volatile SingularAttribute<Novedades, String> tipoNovedad;
    public static volatile SingularAttribute<Novedades, OrdenEntregas> ordenentregaId;
    public static volatile SingularAttribute<Novedades, OrdenCompras> ordencompraId;

}