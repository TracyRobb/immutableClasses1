/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service.crud.Impl;
import com.tracy.immutable.model.members.DeputyHeadPrinciple;
import com.tracy.immutable.service.crud.DeputyHeadCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class DeputyHeadCrudServiceImpl  implements DeputyHeadCrudService{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public DeputyHeadPrinciple find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public DeputyHeadPrinciple persist(DeputyHeadPrinciple entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public DeputyHeadPrinciple merge(DeputyHeadPrinciple entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public DeputyHeadPrinciple remove(DeputyHeadPrinciple entity) {

        return null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<DeputyHeadPrinciple> findAll() {
        return null;
    }
    
}
