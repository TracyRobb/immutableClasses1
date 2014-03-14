/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service.crud.Impl;
import com.tracy.immutable.model.members.Teacher;
import com.tracy.immutable.service.crud.TeacherCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class TeacherCrudServiceImpl implements TeacherCrudService{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Teacher find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Teacher persist(Teacher entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Teacher merge(Teacher entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Teacher remove(Teacher entity) {

        return null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Teacher> findAll() {
        return null;
    }
    
}
