/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model;

import com.tracy.immutable.model.salary.TeacherSalary;
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
public class TeacherSalTest {
    
    private static TeacherSalary tSal;
    private static TeacherSalary newTsal;
    
    public TeacherSalTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        tSal = new TeacherSalary.Builder("TS002").teacher(null).build();
        
        Assert.assertEquals(tSal.getId(), "TS002");
        Assert.assertEquals(tSal.getTeacher(), null);
        Assert.assertEquals(tSal.calcSalary(), 27000.0);
         
    }
    
    @Test
    public void testUpdate(){
        
        newTsal = new TeacherSalary.Builder("TS001").teacher(null).build();
        
        Assert.assertEquals(newTsal.getId(), "TS001");
        Assert.assertEquals(newTsal.getTeacher(), null);
        Assert.assertEquals(newTsal.calcSalary(), 27000.0);
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
