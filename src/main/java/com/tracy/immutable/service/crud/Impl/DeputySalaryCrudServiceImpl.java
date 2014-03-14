/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service.crud.Impl;
import com.tracy.immutable.model.salary.DeputySalary;
import com.tracy.immutable.service.crud.DeputySalaryCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class DeputySalaryCrudServiceImpl implements DeputySalaryCrudService {
    
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public DeputySalary find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public DeputySalary persist(DeputySalary entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public DeputySalary merge(DeputySalary entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public DeputySalary remove(DeputySalary entity) {

        return null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<DeputySalary> findAll() {
        return null;
    }
    
}
