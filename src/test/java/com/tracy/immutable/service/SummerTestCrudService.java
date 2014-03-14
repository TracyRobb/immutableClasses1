/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service;

import com.tracy.immutable.model.activities.Summer;
import com.tracy.immutable.service.crud.SummerCrudService;
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
public class SummerTestCrudService {
    
    @Mock
    SummerCrudService crudService;
    

    @BeforeMethod
    public void setUpMethod() throws Exception { 
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(SummerCrudService.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        
        Summer sum = new Summer.Builder("S001").name("Tennis").coach("Carstens").build();
        Summer returnSum = crudService.persist(sum);
        when(crudService.persist(sum)).thenReturn(returnSum);
        Mockito.verify(crudService).persist(sum);


    }

    @Test
    public void testRead() throws Exception {
        
        Summer sum = new Summer.Builder("S001").name("Tennis").coach("Carstens").build();
        Summer returnSum = crudService.find(sum.getId());
        when(crudService.find(sum.getId())).thenReturn(returnSum);
        Mockito.verify(crudService).find(sum.getId());

    }

    @Test
    public void testUpdate() throws Exception 
    {
        Summer sum = new Summer.Builder("S001").name("Tennis").coach("Carstens").build();

        Summer returnSum = crudService.merge(sum);
        when(crudService.merge(sum)).thenReturn(returnSum);
        Mockito.verify(crudService).merge(sum);

    }

    @Test
    public void testDelete() throws Exception 
    {

        Summer sum = new Summer.Builder("S001").name("Tennis").coach("Carstens").build();
        Summer returnSum = crudService.remove(sum);
        when(crudService.remove(sum)).thenReturn(returnSum);
        Mockito.verify(crudService).remove(sum);

    }
}
