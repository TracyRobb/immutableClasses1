/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model;

import com.tracy.immutable.model.members.Student;
import com.tracy.immutable.model.salary.Fees;
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
public class FeesTest {
    
    private static Fees fee;
    private static Fees feeUpdate;
    private static Student stud;
    
    public FeesTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        fee = new Fees.Builder(null).build();
        
        Assert.assertEquals(fee.getStud(), null);
        
    }
    
    @Test
    public void testUpdate(){
        
        feeUpdate = new Fees.Builder(stud).build();
        
        Assert.assertEquals(feeUpdate.getStud(), stud);
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
