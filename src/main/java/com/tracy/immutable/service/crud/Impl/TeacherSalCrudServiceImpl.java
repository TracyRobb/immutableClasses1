/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service.crud.Impl;
import com.tracy.immutable.model.salary.TeacherSalary;
import com.tracy.immutable.service.crud.TeacherSalCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class TeacherSalCrudServiceImpl implements TeacherSalCrudService{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public TeacherSalary find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public TeacherSalary persist(TeacherSalary entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public TeacherSalary merge(TeacherSalary entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public TeacherSalary remove(TeacherSalary entity) {

        return null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<TeacherSalary> findAll() {
        return null;
    }
    
}
