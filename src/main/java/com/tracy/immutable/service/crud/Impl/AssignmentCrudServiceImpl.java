/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service.crud.Impl;

import com.tracy.immutable.model.school.Assignment;
import com.tracy.immutable.service.crud.AssignmentCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class AssignmentCrudServiceImpl implements AssignmentCrudService{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Assignment find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Assignment persist(Assignment entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Assignment merge(Assignment entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Assignment remove(Assignment entity) {

        return null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Assignment> findAll() {
        return null;
    }
    
}
