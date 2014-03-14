/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service.crud.Impl;
import com.tracy.immutable.model.activities.Summer;
import com.tracy.immutable.service.crud.SummerCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class SummerCrudServiceImpl implements SummerCrudService{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Summer find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Summer persist(Summer entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Summer merge(Summer entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Summer remove(Summer entity) {

        return null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Summer> findAll() {
        return null;
    }
    
}
