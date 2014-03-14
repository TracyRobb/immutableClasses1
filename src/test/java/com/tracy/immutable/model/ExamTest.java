/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model;

import com.tracy.immutable.model.school.Exam;
import org.testng.Assert;
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
public class ExamTest {
    
    private static Exam exam;
    private static Exam newExam;
    
    public ExamTest() {
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        exam = new Exam.Builder("EX001").subject(null).mark(80.0).build();
        
        Assert.assertEquals(exam.getId(), "EX001");
        Assert.assertEquals(exam.getMark(), 80.0);
        Assert.assertEquals(exam.getSub(), null);
        
        
        
    }
    
    @Test
    public void testUpdate(){
        
        newExam = new Exam.Builder("EX001").subject(null).mark(30.0).build();
        
        Assert.assertEquals(newExam.getId(), "EX001");
        Assert.assertEquals(newExam.getMark(), 30.0);
        Assert.assertEquals(newExam.getSub(), null);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
