/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service;

import com.tracy.immutable.model.members.Principle;
import com.tracy.immutable.service.crud.PrincipleCrudService;
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
public class PrincipleTestCrudService {
    
    @Mock
    PrincipleCrudService crudService;
    

    @BeforeMethod
    public void setUpMethod() throws Exception { 
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(PrincipleCrudService.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        
        Principle prince = new Principle.Builder("P0001").firstName("Jan").lastName("Steyl").address(null).dpHeads(null).build();
        Principle returnPrin = crudService.persist(prince);
        when(crudService.persist(prince)).thenReturn(returnPrin);
        Mockito.verify(crudService).persist(prince);


    }

    @Test
    public void testRead() throws Exception {
        
        Principle prince = new Principle.Builder("P0001").firstName("Jan").lastName("Steyl").address(null).dpHeads(null).build();
        Principle returnPrin = crudService.find(prince.getId());
        when(crudService.find(prince.getId())).thenReturn(returnPrin);
        Mockito.verify(crudService).find(prince.getId());

    }

    @Test
    public void testUpdate() throws Exception 
    {
        Principle prince = new Principle.Builder("P0001").firstName("Jan").lastName("Steyl").address(null).dpHeads(null).build();

        Principle returnPrin = crudService.merge(prince);
        when(crudService.merge(prince)).thenReturn(returnPrin);
        Mockito.verify(crudService).merge(prince);

    }

    @Test
    public void testDelete() throws Exception 
    {

        Principle prince = new Principle.Builder("P0001").firstName("Jan").lastName("Steyl").address(null).dpHeads(null).build();
        Principle returnPrin = crudService.remove(prince);
        when(crudService.remove(prince)).thenReturn(returnPrin);
        Mockito.verify(crudService).remove(prince);

    }
}
