/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service;

import com.tracy.immutable.model.members.Student;
import com.tracy.immutable.service.crud.StudentCrudService;
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
public class StudentTestCrudService {
    
    @Mock
    StudentCrudService crudService;
    

    @BeforeMethod
    public void setUpMethod() throws Exception { 
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(StudentCrudService.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        
        Student stud = new Student.Builder("W10207").firstName("Tracy").lastName("Lance").address(null).stubjects(null).build();
        Student returnStud = crudService.persist(stud);
        when(crudService.persist(stud)).thenReturn(returnStud);
        Mockito.verify(crudService).persist(stud);


    }

    @Test
    public void testRead() throws Exception {
        
        Student stud = new Student.Builder("W10207").firstName("Tracy").lastName("Lance").address(null).stubjects(null).build();
        Student returnStud = crudService.find(stud.getId());
        when(crudService.find(stud.getId())).thenReturn(returnStud);
        Mockito.verify(crudService).find(stud.getId());

    }

    @Test
    public void testUpdate() throws Exception 
    {
        Student stud = new Student.Builder("W10207").firstName("Tracy").lastName("Lance").address(null).stubjects(null).build();

        Student returnStud = crudService.merge(stud);
        when(crudService.merge(stud)).thenReturn(returnStud);
        Mockito.verify(crudService).merge(stud);

    }

    @Test
    public void testDelete() throws Exception 
    {

        Student stud = new Student.Builder("W10207").firstName("Tracy").lastName("Lance").address(null).stubjects(null).build();
        Student returnStud = crudService.remove(stud);
        when(crudService.remove(stud)).thenReturn(returnStud);
        Mockito.verify(crudService).remove(stud);

    }
}
