/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service.crud.Impl;

import com.tracy.immutable.model.school.Department;
import com.tracy.immutable.service.crud.DepartmentCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author student
 */
public class DepartmentCrudServiceImpl implements DepartmentCrudService{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Department find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Department persist(Department entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Department merge(Department entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Department remove(Department entity) {

        return null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Department> findAll() {
        return null;
    }
    
}
