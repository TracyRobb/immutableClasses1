/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service;

import com.tracy.immutable.model.school.Subject;
import com.tracy.immutable.service.crud.SubjectCrudService;
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
public class SubjectTestCrudService {
    
    @Mock
    SubjectCrudService crudService;
    

    @BeforeMethod
    public void setUpMethod() throws Exception { 
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(SubjectCrudService.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        
        Subject sub = new Subject.Builder("S001").name("Biology").modules("Anatomy Of Mice").textbook(null).build();
        Subject returnSub = crudService.persist(sub);
        when(crudService.persist(sub)).thenReturn(returnSub);
        Mockito.verify(crudService).persist(sub);


    }

    @Test
    public void testRead() throws Exception {
        
        Subject sub = new Subject.Builder("S001").name("Biology").modules("Anatomy Of Mice").textbook(null).build();
        Subject returnSub = crudService.find(sub.getId());
        when(crudService.find(sub.getId())).thenReturn(returnSub);
        Mockito.verify(crudService).find(sub.getId());

    }

    @Test
    public void testUpdate() throws Exception 
    {
        Subject sub = new Subject.Builder("S001").name("Biology").modules("Anatomy Of Mice").textbook(null).build();

        Subject returnSub = crudService.merge(sub);
        when(crudService.merge(sub)).thenReturn(returnSub);
        Mockito.verify(crudService).merge(sub);

    }

    @Test
    public void testDelete() throws Exception 
    {

        Subject sub = new Subject.Builder("S001").name("Biology").modules("Anatomy Of Mice").textbook(null).build();
        Subject returnSub = crudService.remove(sub);
        when(crudService.remove(sub)).thenReturn(returnSub);
        Mockito.verify(crudService).remove(sub);

    }
}
