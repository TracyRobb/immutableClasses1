/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service;

import com.tracy.immutable.model.school.Textbook;
import com.tracy.immutable.service.crud.TextBookCrudService;
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
public class TextBookTestCrudService {
    
    @Mock
    TextBookCrudService crudService;
    

    @BeforeMethod
    public void setUpMethod() throws Exception { 
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(TextBookCrudService.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        
        Textbook textbook = new Textbook.Builder("AB001").name("Ancient Biology").author("Debra Messing").publisher("Penguin").build();
        Textbook returnText = crudService.persist(textbook);
        when(crudService.persist(textbook)).thenReturn(returnText);
        Mockito.verify(crudService).persist(textbook);


    }

    @Test
    public void testRead() throws Exception {
        
        Textbook textbook = new Textbook.Builder("AB001").name("Ancient Biology").author("Debra Messing").publisher("Penguin").build();
        Textbook returnText = crudService.find(textbook.getId());
        when(crudService.find(textbook.getId())).thenReturn(returnText);
        Mockito.verify(crudService).find(textbook.getId());

    }

    @Test
    public void testUpdate() throws Exception 
    {
        Textbook textbook = new Textbook.Builder("AB001").name("Ancient Biology").author("Debra Messing").publisher("Penguin").build();

        Textbook returnText  = crudService.merge(textbook);
        when(crudService.merge(textbook)).thenReturn(returnText);
        Mockito.verify(crudService).merge(textbook);

    }

    @Test
    public void testDelete() throws Exception 
    {

        Textbook textbook = new Textbook.Builder("AB001").name("Ancient Biology").author("Debra Messing").publisher("Penguin").build();
        Textbook returnText = crudService.remove(textbook);
        when(crudService.remove(textbook)).thenReturn(returnText);
        Mockito.verify(crudService).remove(textbook);

    }
}
