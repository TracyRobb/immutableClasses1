/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service;

import com.tracy.immutable.model.school.TestMark;
import com.tracy.immutable.service.crud.TestMarkCrudService;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class TestMarkTestCrudService {
    
   @Mock
   TestMarkCrudService crudService;
    

    @BeforeMethod
    public void setUpMethod() throws Exception { 
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(TestMarkCrudService.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        
        TestMark testMark = new TestMark.Builder("TS001").subject(null).mark(67.0).build();
        TestMark returnTest = crudService.persist(testMark);
        when(crudService.persist(testMark)).thenReturn(returnTest);
        Mockito.verify(crudService).persist(testMark);


    }

    @Test
    public void testRead() throws Exception {
        
        TestMark testMark = new TestMark.Builder("TS001").subject(null).mark(67.0).build();
        TestMark returnTest = crudService.find(testMark.getId());
        when(crudService.find(testMark.getId())).thenReturn(returnTest);
        Mockito.verify(crudService).find(testMark.getId());

    }

    @Test
    public void testUpdate() throws Exception 
    {
        TestMark testMark = new TestMark.Builder("TS001").subject(null).mark(67.0).build();

        TestMark returnTest  = crudService.merge(testMark);
        when(crudService.merge(testMark)).thenReturn(returnTest);
        Mockito.verify(crudService).merge(testMark);

    }

    @Test
    public void testDelete() throws Exception 
    {

        TestMark testMark = new TestMark.Builder("TS001").subject(null).mark(67.0).build();
        TestMark returnTest = crudService.remove(testMark);
        when(crudService.remove(testMark)).thenReturn(returnTest);
        Mockito.verify(crudService).remove(testMark);

    }
}
