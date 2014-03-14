/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service;

import com.tracy.immutable.model.members.Address;
import com.tracy.immutable.model.members.DeputyHeadPrinciple;
import com.tracy.immutable.model.members.Teacher;
import com.tracy.immutable.service.crud.DeputyHeadCrudService;
import java.util.ArrayList;
import java.util.List;
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
public class DeputyHeadTestCrudService {
    
    @Mock
    DeputyHeadCrudService crudService;
    private Teacher teacher;
    

    @BeforeMethod
    public void setUpMethod() throws Exception { 
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(DeputyHeadCrudService.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        
        
        List<Teacher> teach = new ArrayList <Teacher> ();
        teach.add(teacher);
        Address addr = new Address.Builder(37).streetName("Orchid").areaName("Goodwood").areaCode("7460").build();
        DeputyHeadPrinciple dp = new DeputyHeadPrinciple.Builder("DP001").firstName("Travis").lastName("Van Rensburg").address(addr).teacher(teach).build();
        
        DeputyHeadPrinciple returnDep = crudService.persist(dp);
        when(crudService.persist(dp)).thenReturn(returnDep);
        Mockito.verify(crudService).persist(dp);


    }

    @Test
    public void testRead() throws Exception {
        
        
        List<Teacher> teach = new ArrayList <Teacher> ();
        teach.add(teacher);
        Address addr = new Address.Builder(37).streetName("Orchid").areaName("Goodwood").areaCode("7460").build();
        DeputyHeadPrinciple dp = new DeputyHeadPrinciple.Builder("DP001").firstName("Travis").lastName("Van Rensburg").address(addr).teacher(teach).build();
        
        DeputyHeadPrinciple returnDep = crudService.find(dp.getId());
        when(crudService.find(dp.getId())).thenReturn(returnDep);
        Mockito.verify(crudService).find(dp.getId());

    }

    @Test
    public void testUpdate() throws Exception 
    {
        
        List<Teacher> teach = new ArrayList <Teacher> ();
        teach.add(teacher);
        Address addr = new Address.Builder(37).streetName("Orchid").areaName("Goodwood").areaCode("7460").build();
        DeputyHeadPrinciple dp = new DeputyHeadPrinciple.Builder("DP001").firstName("Travis").lastName("Van Rensburg").address(addr).teacher(teach).build();
        
        DeputyHeadPrinciple returnDep = crudService.merge(dp);
        when(crudService.merge(dp)).thenReturn(returnDep);
        Mockito.verify(crudService).merge(dp);

    }

    @Test
    public void testDelete() throws Exception 
    {

        
        List<Teacher> teach = new ArrayList <Teacher> ();
        teach.add(teacher);
        Address addr = new Address.Builder(37).streetName("Orchid").areaName("Goodwood").areaCode("7460").build();
        DeputyHeadPrinciple dp = new DeputyHeadPrinciple.Builder("DP001").firstName("Travis").lastName("Van Rensburg").address(addr).teacher(teach).build();
        DeputyHeadPrinciple returnDep = crudService.remove(dp);
        when(crudService.remove(dp)).thenReturn(returnDep);
        Mockito.verify(crudService).remove(dp);

    }
}
