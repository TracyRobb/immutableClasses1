/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model;

import com.tracy.immutable.model.activities.Summer;
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
public class SummerTest {
    
    private static Summer sum;
    private static Summer newSum;
    
    public SummerTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        sum = new Summer.Builder("S001").name("Tennis").coach("Carstens").build();
        
        Assert.assertEquals(sum.getId(), "S001");
        Assert.assertEquals(sum.getName(), "Tennis");
        Assert.assertEquals(sum.getCoach(), "Carstens");

        
    }
    
    @Test
    public void testUpdate(){
        
        newSum = new Summer.Builder("S001").name("Water-Polo").coach("Carstens").build();
        
        Assert.assertEquals(newSum.getId(), "S001");
        Assert.assertEquals(newSum.getName(), "Water-Polo");
        Assert.assertEquals(newSum.getCoach(), "Carstens");
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
