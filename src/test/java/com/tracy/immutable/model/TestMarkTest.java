/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model;

import com.tracy.immutable.model.school.TestMark;
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
public class TestMarkTest {
    
    private static TestMark test;
    private static TestMark newTest;
    
    public TestMarkTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        test = new TestMark.Builder("TS001").subject(null).mark(67.0).build();
        
        Assert.assertEquals(test.getId(), "TS001");
        Assert.assertEquals(test.getMark(), 67.0);
        Assert.assertEquals(test.getSub(), null);
        
        
        
    }
    
    @Test
    public void testUpdate(){
        
        newTest = new TestMark.Builder("TS002").subject(null).mark(70.0).build();
        
        Assert.assertEquals(newTest.getId(), "TS002");
        Assert.assertEquals(newTest.getMark(), 70.0);
        Assert.assertEquals(newTest.getSub(), null);
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
