/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service;

import com.tracy.immutable.model.salary.DeputySalary;
import com.tracy.immutable.service.crud.DeputySalaryCrudService;
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
public class DeputySalTestCrudService {
    
    @Mock
    DeputySalaryCrudService crudService;
    

    @BeforeMethod
    public void setUpMethod() throws Exception { 
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(DeputySalaryCrudService.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        
        DeputySalary depSal = new DeputySalary.Builder("DPS003").deputyHead(null).build();
        DeputySalary returnSal = crudService.persist(depSal);
        when(crudService.persist(depSal)).thenReturn(returnSal);
        Mockito.verify(crudService).persist(depSal);


    }

    @Test
    public void testRead() throws Exception {
        
        DeputySalary depSal = new DeputySalary.Builder("DPS003").deputyHead(null).build();
        DeputySalary returnSal = crudService.find(depSal.getId());
        when(crudService.find(depSal.getId())).thenReturn(returnSal);
        Mockito.verify(crudService).find(depSal.getId());

    }

    @Test
    public void testUpdate() throws Exception 
    {
        DeputySalary depSal = new DeputySalary.Builder("DPS003").deputyHead(null).build();

        DeputySalary returnSal = crudService.merge(depSal);
        when(crudService.merge(depSal)).thenReturn(returnSal);
        Mockito.verify(crudService).merge(depSal);

    }

    @Test
    public void testDelete() throws Exception 
    {

        DeputySalary depSal = new DeputySalary.Builder("DPS003").deputyHead(null).build();
        DeputySalary returnSal = crudService.remove(depSal);
        when(crudService.remove(depSal)).thenReturn(returnSal);
        Mockito.verify(crudService).remove(depSal);

    }
}
