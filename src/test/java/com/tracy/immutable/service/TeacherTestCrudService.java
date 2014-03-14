/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service;

import com.tracy.immutable.model.members.Teacher;
import com.tracy.immutable.service.crud.TeacherCrudService;
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
public class TeacherTestCrudService {
    
    @Mock
    TeacherCrudService crudService;
    

    @BeforeMethod
    public void setUpMethod() throws Exception { 
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(TeacherCrudService.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        
        Teacher teach = new Teacher.Builder("TE001").firstName("Lana").lastName("Nel").address(null).subjects(null).students(null).build();
        Teacher returnTeach  = crudService.persist(teach);
        when(crudService.persist(teach)).thenReturn(returnTeach);
        Mockito.verify(crudService).persist(teach);


    }

    @Test
    public void testRead() throws Exception {
        
        Teacher teach = new Teacher.Builder("TE001").firstName("Lana").lastName("Nel").address(null).subjects(null).students(null).build();
        Teacher returnTeach  = crudService.find(teach.getId());
        when(crudService.find(teach.getId())).thenReturn(returnTeach);
        Mockito.verify(crudService).find(teach.getId());

    }

    @Test
    public void testUpdate() throws Exception 
    {
        Teacher teach = new Teacher.Builder("TE001").firstName("Lana").lastName("Nel").address(null).subjects(null).students(null).build();

        Teacher returnTeach  = crudService.merge(teach);
        when(crudService.merge(teach)).thenReturn(returnTeach);
        Mockito.verify(crudService).merge(teach);

    }

    @Test
    public void testDelete() throws Exception 
    {

        Teacher teach = new Teacher.Builder("TE001").firstName("Lana").lastName("Nel").address(null).subjects(null).students(null).build();
        Teacher returnTeach = crudService.remove(teach);
        when(crudService.remove(teach)).thenReturn(returnTeach);
        Mockito.verify(crudService).remove(teach);
    }

   
}
