/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service;

import com.tracy.immutable.model.school.Exam;
import com.tracy.immutable.service.crud.ExamCrudService;
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
public class ExamTestCrudService {
    
    @Mock
    ExamCrudService crudService;
    

    @BeforeMethod
    public void setUpMethod() throws Exception { 
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(ExamCrudService.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        
        Exam exam = new Exam.Builder("EX001").subject(null).mark(80.0).build();
        Exam returnExam = crudService.persist(exam);
        when(crudService.persist(exam)).thenReturn(returnExam);
        Mockito.verify(crudService).persist(exam);


    }

    @Test
    public void testRead() throws Exception {
        
        Exam exam = new Exam.Builder("EX001").subject(null).mark(80.0).build();
        Exam returnExam = crudService.find(exam.getId());
        when(crudService.find(exam.getId())).thenReturn(returnExam);
        Mockito.verify(crudService).find(exam.getId());

    }

    @Test
    public void testUpdate() throws Exception 
    {
        Exam exam = new Exam.Builder("EX001").subject(null).mark(80.0).build();

        Exam returnExam = crudService.merge(exam);
        when(crudService.merge(exam)).thenReturn(returnExam);
        Mockito.verify(crudService).merge(exam);

    }

    @Test
    public void testDelete() throws Exception 
    {

        Exam exam = new Exam.Builder("EX001").subject(null).mark(80.0).build();
        Exam returnExam = crudService.remove(exam);
        when(crudService.remove(exam)).thenReturn(returnExam);
        Mockito.verify(crudService).remove(exam);

    }
}
