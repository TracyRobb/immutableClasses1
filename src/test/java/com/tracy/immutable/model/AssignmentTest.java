/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model;

import com.tracy.immutable.model.school.Assignment;
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
public class AssignmentTest {
    
    private static Assignment ass;
    private static Assignment newAss;
    
    public AssignmentTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        ass = new Assignment.Builder("ASS001").subject(null).mark(67.0).build();
        
        Assert.assertEquals(ass.getId(), "ASS001");
        Assert.assertEquals(ass.getMark(), 67.0);
        Assert.assertEquals(ass.getSub(), null);
        
        
        
    }
    
    @Test
    public void testUpdate(){
        
        newAss = new Assignment.Builder("ASS001").subject(null).mark(30.0).build();
        
        Assert.assertEquals(newAss.getId(), "ASS001");
        Assert.assertEquals(newAss.getMark(), 30.0);
        Assert.assertEquals(newAss.getSub(), null);
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
