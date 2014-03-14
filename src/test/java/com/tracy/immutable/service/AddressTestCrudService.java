/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service;

import com.tracy.immutable.config.AppConfig;
import com.tracy.immutable.model.members.Address;
import com.tracy.immutable.service.crud.AddressCrudService;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
public class AddressTestCrudService {
    
    @Mock
    AddressCrudService crudService;
    
    public AddressTestCrudService() {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception { 
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(AddressCrudService.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        Address addre = new Address.Builder(37).streetName("Orchid").areaName("Goodwood").areaCode("7460").build();
        Address returnAddress = crudService.persist(addre);
        when(crudService.persist(addre)).thenReturn(returnAddress);
        Mockito.verify(crudService).persist(addre);


    }

    @Test
    public void testRead() throws Exception {
        Address addre = new Address.Builder(37).streetName("Orchid").areaName("Goodwood").areaCode("7460").build();
        
        Address returnAddress = crudService.find(addre.getStreetName());
        when(crudService.find(addre.getStreetName())).thenReturn(returnAddress);
        Mockito.verify(crudService).find(addre.getStreetName());

    }

    @Test
    public void testUpdate() throws Exception 
    {
        Address addre = new Address.Builder(37).streetName("Orchid").areaName("Goodwood").areaCode("7460").build();

        Address returnAddress = crudService.merge(addre);
        when(crudService.merge(addre)).thenReturn(returnAddress);
        Mockito.verify(crudService).merge(addre);

    }

    @Test
    public void testDelete() throws Exception 
    {

        Address addre = new Address.Builder(37).streetName("Orchid").areaName("Goodwood").areaCode("7460").build();
        Address returnAddress = crudService.remove(addre);
        when(crudService.remove(addre)).thenReturn(returnAddress);
        Mockito.verify(crudService).remove(addre);

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        //ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        //crudService = (AddressCrudService)ctx.getBean("addressCrudService");
    }
    

}
