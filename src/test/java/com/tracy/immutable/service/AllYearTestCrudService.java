/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service;

import com.tracy.immutable.model.activities.AllYear;
import com.tracy.immutable.service.crud.AllYearCrudService;
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
public class AllYearTestCrudService {
    
    @Mock
    AllYearCrudService crudService;
    

    @BeforeMethod
    public void setUpMethod() throws Exception { 
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(AllYearCrudService.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        
        AllYear all = new AllYear.Builder("AY001").name("Choir").coach("Bruwer").build();
        AllYear returnAllYear = crudService.persist(all);
        when(crudService.persist(all)).thenReturn(returnAllYear);
        Mockito.verify(crudService).persist(all);


    }

    @Test
    public void testRead() throws Exception {
        AllYear all = new AllYear.Builder("AY001").name("Choir").coach("Bruwer").build();
        
        AllYear returnYear = crudService.find(all.getId());
        when(crudService.find(all.getId())).thenReturn(returnYear);
        Mockito.verify(crudService).find(all.getId());

    }

    @Test
    public void testUpdate() throws Exception 
    {
        AllYear all = new AllYear.Builder("AY001").name("Choir").coach("Bruwer").build();

        AllYear returnYear = crudService.merge(all);
        when(crudService.merge(all)).thenReturn(returnYear);
        Mockito.verify(crudService).merge(all);

    }

    @Test
    public void testDelete() throws Exception 
    {

        AllYear all = new AllYear.Builder("AY001").name("Choir").coach("Bruwer").build();
        AllYear returnYear = crudService.remove(all);
        when(crudService.remove(all)).thenReturn(returnYear);
        Mockito.verify(crudService).remove(all);

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        //ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        //crudService = (AddressCrudService)ctx.getBean("addressCrudService");
    }
}
