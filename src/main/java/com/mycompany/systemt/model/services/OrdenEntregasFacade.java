/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemt.model.services;

import com.mycompany.systemt.model.entities.OrdenEntregas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author natalia
 */
@Stateless
public class OrdenEntregasFacade extends AbstractFacade<OrdenEntregas> {

    @PersistenceContext(unitName = "com.mycompany_SystemT_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrdenEntregasFacade() {
        super(OrdenEntregas.class);
    }
    
}
