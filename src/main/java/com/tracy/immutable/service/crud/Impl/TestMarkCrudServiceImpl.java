/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service.crud.Impl;
import com.tracy.immutable.model.school.TestMark;
import com.tracy.immutable.service.crud.TestMarkCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class TestMarkCrudServiceImpl implements TestMarkCrudService{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public TestMark find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public TestMark persist(TestMark entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public TestMark merge(TestMark entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public TestMark remove(TestMark entity) {

        return null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<TestMark> findAll() {
        return null;
    }
    
}
