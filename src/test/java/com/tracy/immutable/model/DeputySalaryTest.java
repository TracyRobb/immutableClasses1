/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model;

import com.tracy.immutable.model.salary.DeputySalary;
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
public class DeputySalaryTest {
    
    private static DeputySalary dpSal;
    private static DeputySalary newdpSal;
    
    public DeputySalaryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        dpSal = new DeputySalary.Builder("DPS003").deputyHead(null).build();
        
        Assert.assertEquals(dpSal.getId(), "DPS003");
        Assert.assertEquals(dpSal.getDpHead(), null);
        Assert.assertEquals(dpSal.calcSalary(), 39000.0);
         
    }
    
    @Test
    public void testUpdate(){
        
        newdpSal = new DeputySalary.Builder("DPS004").deputyHead(null).build();
        
        Assert.assertEquals(newdpSal.getId(), "DPS004");
        Assert.assertEquals(newdpSal.getDpHead(), null);
        Assert.assertEquals(newdpSal.calcSalary(), 39000.0);
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
