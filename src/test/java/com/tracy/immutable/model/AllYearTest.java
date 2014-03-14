/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model;

import com.tracy.immutable.model.activities.AllYear;
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
public class AllYearTest {
    
    private static AllYear year;
    private static AllYear newYear;
    
    public AllYearTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        year = new AllYear.Builder("AY001").name("Choir").coach("Bruwer").build();
        
        Assert.assertEquals(year.getId(), "AY001");
        Assert.assertEquals(year.getName(), "Choir");
        Assert.assertEquals(year.getCoach(), "Bruwer");

        
    }
    
    @Test
    public void testUpdate(){
        
        newYear = new AllYear.Builder("AY001").name("Drama").coach("Bruwer").build();
        
        Assert.assertEquals(newYear.getId(), "AY001");
        Assert.assertEquals(newYear.getName(), "Drama");
        Assert.assertEquals(newYear.getCoach(), "Bruwer");
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
