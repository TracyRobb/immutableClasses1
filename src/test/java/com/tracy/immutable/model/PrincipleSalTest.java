/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model;

import com.tracy.immutable.model.salary.PrincipleSalary;
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
public class PrincipleSalTest {
    
    private static PrincipleSalary pSal;
    private static PrincipleSalary newPsal;
    
    public PrincipleSalTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        pSal = new PrincipleSalary.Builder("PS001").principle(null).build();
        
        Assert.assertEquals(pSal.getId(), "PS001");
        Assert.assertEquals(pSal.getPrinciple(), null);
        Assert.assertEquals(pSal.calcSalary(), 51000.0);
         
    }
    
    @Test
    public void testUpdate(){
        
        newPsal = new PrincipleSalary.Builder("PS002").principle(null).build();
        
        Assert.assertEquals(newPsal.getId(), "PS002");
        Assert.assertEquals(newPsal.getPrinciple(), null);
        Assert.assertEquals(newPsal.calcSalary(), 51000.0);
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
