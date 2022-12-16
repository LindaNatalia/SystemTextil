package com.mycompany.systemt.model.entities;

import com.mycompany.systemt.model.entities.Permisos;
import com.mycompany.systemt.model.entities.Personas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-12-16T12:14:12")
@StaticMetamodel(Roles.class)
public class Roles_ { 

    public static volatile SingularAttribute<Roles, Integer> idrol;
    public static volatile ListAttribute<Roles, Personas> personasList;
    public static volatile SingularAttribute<Roles, String> nombreRol;
    public static volatile ListAttribute<Roles, Permisos> permisosList;

}