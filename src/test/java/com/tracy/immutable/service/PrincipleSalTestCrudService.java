/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service;

import com.tracy.immutable.model.salary.PrincipleSalary;
import com.tracy.immutable.service.crud.PrincipleSalCrudService;
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
public class PrincipleSalTestCrudService {
    
    @Mock
    PrincipleSalCrudService crudService;
    

    @BeforeMethod
    public void setUpMethod() throws Exception { 
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(PrincipleSalCrudService.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        
        PrincipleSalary prinSal = new PrincipleSalary.Builder("PS001").principle(null).build();
        PrincipleSalary returnPS = crudService.persist(prinSal);
        when(crudService.persist(prinSal)).thenReturn(returnPS);
        Mockito.verify(crudService).persist(prinSal);


    }

    @Test
    public void testRead() throws Exception {
        
        PrincipleSalary prinSal = new PrincipleSalary.Builder("PS001").principle(null).build();
        PrincipleSalary returnPS = crudService.find(prinSal.getId());
        when(crudService.find(prinSal.getId())).thenReturn(returnPS);
        Mockito.verify(crudService).find(prinSal.getId());

    }

    @Test
    public void testUpdate() throws Exception 
    {
        PrincipleSalary prinSal = new PrincipleSalary.Builder("PS001").principle(null).build();

        PrincipleSalary returnPS = crudService.merge(prinSal);
        when(crudService.merge(prinSal)).thenReturn(returnPS);
        Mockito.verify(crudService).merge(prinSal);

    }

    @Test
    public void testDelete() throws Exception 
    {

        PrincipleSalary prinSal = new PrincipleSalary.Builder("PS001").principle(null).build();
        PrincipleSalary returnPS = crudService.remove(prinSal);
        when(crudService.remove(prinSal)).thenReturn(returnPS);
        Mockito.verify(crudService).remove(prinSal);

    }
}
