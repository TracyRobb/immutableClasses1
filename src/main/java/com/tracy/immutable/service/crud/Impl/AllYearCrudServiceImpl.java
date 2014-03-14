/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service.crud.Impl;

import com.tracy.immutable.model.activities.AllYear;
import com.tracy.immutable.service.crud.AllYearCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class AllYearCrudServiceImpl implements AllYearCrudService{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public AllYear find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public AllYear persist(AllYear entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public AllYear merge(AllYear entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public AllYear remove(AllYear entity) {

        return null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<AllYear> findAll() {
        return null;
    }
    
}
