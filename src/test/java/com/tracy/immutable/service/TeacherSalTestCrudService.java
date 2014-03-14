/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service;

import com.tracy.immutable.model.salary.TeacherSalary;
import com.tracy.immutable.service.crud.TeacherSalCrudService;
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
public class TeacherSalTestCrudService {
    
    @Mock
    TeacherSalCrudService crudService;
    

    @BeforeMethod
    public void setUpMethod() throws Exception { 
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(TeacherSalCrudService.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        
        TeacherSalary tSal = new TeacherSalary.Builder("TS002").teacher(null).build();
        TeacherSalary returnTSal = crudService.persist(tSal);
        when(crudService.persist(tSal)).thenReturn(returnTSal);
        Mockito.verify(crudService).persist(tSal);


    }

    @Test
    public void testRead() throws Exception {
        
        TeacherSalary tSal = new TeacherSalary.Builder("TS002").teacher(null).build();
        TeacherSalary returnTSal = crudService.find(tSal.getId());
        when(crudService.find(tSal.getId())).thenReturn(returnTSal);
        Mockito.verify(crudService).find(tSal.getId());

    }

    @Test
    public void testUpdate() throws Exception 
    {
        TeacherSalary tSal = new TeacherSalary.Builder("TS002").teacher(null).build();

        TeacherSalary returnTSal = crudService.merge(tSal);
        when(crudService.merge(tSal)).thenReturn(returnTSal);
        Mockito.verify(crudService).merge(tSal);

    }

    @Test
    public void testDelete() throws Exception 
    {

        TeacherSalary tSal = new TeacherSalary.Builder("TS002").teacher(null).build();
        TeacherSalary returnTSal = crudService.remove(tSal);
        when(crudService.remove(tSal)).thenReturn(returnTSal);
        Mockito.verify(crudService).remove(tSal);

    }
}
