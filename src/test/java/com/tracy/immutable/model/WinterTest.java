/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model;

import com.tracy.immutable.model.activities.Winter;
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
public class WinterTest {
    
    private static Winter winter;
    private static Winter newWinter;
    
    public WinterTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        winter = new Winter.Builder("W001").name("Hockey").coach("Smith").build();
        
        Assert.assertEquals(winter.getId(), "W001");
        Assert.assertEquals(winter.getName(), "Hockey");
        Assert.assertEquals(winter.getCoach(), "Smith");

        
    }
    
    @Test
    public void testUpdate(){
        
        newWinter = new Winter.Builder("W001").name("Netball").coach("Smith").build();
        
        Assert.assertEquals(newWinter.getId(), "W001");
        Assert.assertEquals(newWinter.getName(), "Netball");
        Assert.assertEquals(newWinter.getCoach(), "Smith");
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
