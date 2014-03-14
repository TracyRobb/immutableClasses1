/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service;

import com.tracy.immutable.model.activities.Winter;
import com.tracy.immutable.service.crud.WinterCrudService;
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
public class WinterTestCrudService {
    
    @Mock
    WinterCrudService crudService;
    

    @BeforeMethod
    public void setUpMethod() throws Exception { 
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(WinterCrudService.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        
        Winter winter = new Winter.Builder("W001").name("Hockey").coach("Smith").build();
        Winter returnWinter = crudService.persist(winter);
        when(crudService.persist(winter)).thenReturn(returnWinter);
        Mockito.verify(crudService).persist(winter);


    }

    @Test
    public void testRead() throws Exception {
        
        Winter winter = new Winter.Builder("W001").name("Hockey").coach("Smith").build();
        Winter returnWinter = crudService.find(winter.getId());
        when(crudService.find(winter.getId())).thenReturn(returnWinter);
        Mockito.verify(crudService).find(winter.getId());

    }

    @Test
    public void testUpdate() throws Exception 
    {
        Winter winter = new Winter.Builder("W001").name("Hockey").coach("Smith").build();
        Winter returnWinter  = crudService.merge(winter);
        when(crudService.merge(winter)).thenReturn(returnWinter);
        Mockito.verify(crudService).merge(winter);

    }

    @Test
    public void testDelete() throws Exception 
    {

        Winter winter = new Winter.Builder("W001").name("Hockey").coach("Smith").build();
        Winter returnWinter = crudService.remove(winter);
        when(crudService.remove(winter)).thenReturn(returnWinter);
        Mockito.verify(crudService).remove(winter);

    }
}
