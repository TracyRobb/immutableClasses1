/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service.crud.Impl;
import com.tracy.immutable.model.salary.PrincipleSalary;
import com.tracy.immutable.service.crud.PrincipleSalCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class PrincipleSalCrudServiceImpl implements PrincipleSalCrudService{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public PrincipleSalary find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public PrincipleSalary persist(PrincipleSalary entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public PrincipleSalary merge(PrincipleSalary entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public PrincipleSalary remove(PrincipleSalary entity) {

        return null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<PrincipleSalary> findAll() {
        return null;
    }
    
}
