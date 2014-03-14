/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service;

import com.tracy.immutable.model.school.Assignment;
import com.tracy.immutable.service.crud.AssignmentCrudService;
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
public class AssignmentTestCrudService {
    
    @Mock
    AssignmentCrudService crudService;
    

    @BeforeMethod
    public void setUpMethod() throws Exception { 
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(AssignmentCrudService.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        
        Assignment ass = new Assignment.Builder("ASS001").subject(null).mark(67.0).build();
        Assignment returnAss = crudService.persist(ass);
        when(crudService.persist(ass)).thenReturn(returnAss);
        Mockito.verify(crudService).persist(ass);


    }

    @Test
    public void testRead() throws Exception {
        Assignment ass = new Assignment.Builder("ASS001").subject(null).mark(67.0).build();
        
        Assignment returnAss = crudService.find(ass.getId());
        when(crudService.find(ass.getId())).thenReturn(returnAss);
        Mockito.verify(crudService).find(ass.getId());

    }

    @Test
    public void testUpdate() throws Exception 
    {
        Assignment ass = new Assignment.Builder("ASS001").subject(null).mark(67.0).build();

        Assignment returnAss = crudService.merge(ass);
        when(crudService.merge(ass)).thenReturn(returnAss);
        Mockito.verify(crudService).merge(ass);

    }

    @Test
    public void testDelete() throws Exception 
    {

        Assignment ass = new Assignment.Builder("ASS001").subject(null).mark(67.0).build();
        Assignment returnAss = crudService.remove(ass);
        when(crudService.remove(ass)).thenReturn(returnAss);
        Mockito.verify(crudService).remove(ass);

    }
}
