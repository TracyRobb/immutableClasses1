/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service;

import com.tracy.immutable.model.members.Student;
import com.tracy.immutable.model.salary.Fees;
import com.tracy.immutable.service.crud.FeesCrudService;
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
public class FeesTestCrudService {
    
    @Mock
    FeesCrudService crudService;
    Student stud;
    

    @BeforeMethod
    public void setUpMethod() throws Exception { 
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(FeesCrudService.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        
        
        Fees fees = new Fees.Builder(stud).build();
        Fees returnFees = crudService.persist(fees);
        when(crudService.persist(fees)).thenReturn(returnFees);
        Mockito.verify(crudService).persist(fees);


    }

    @Test
    public void testRead() throws Exception {
        
        
        Fees fees = new Fees.Builder(stud).build();
        Fees returnFees = crudService.find(fees.getId());
        when(crudService.find(fees.getId())).thenReturn(returnFees);
        Mockito.verify(crudService).find(fees.getId());

    }

    @Test
    public void testUpdate() throws Exception 
    {
        Fees fees = new Fees.Builder(stud).build();

        Fees returnFees = crudService.merge(fees);
        when(crudService.merge(fees)).thenReturn(returnFees);
        Mockito.verify(crudService).merge(fees);

    }

    @Test
    public void testDelete() throws Exception 
    {

        Fees fees = new Fees.Builder(stud).build();
        Fees returnFees = crudService.remove(fees);
        when(crudService.remove(fees)).thenReturn(returnFees);
        Mockito.verify(crudService).remove(fees);

    }
}
