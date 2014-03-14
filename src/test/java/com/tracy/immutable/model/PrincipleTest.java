/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model;

import com.tracy.immutable.model.members.Address;
import com.tracy.immutable.model.members.Principle;
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
public class PrincipleTest {
    
    private static Principle principle;
    private static Principle newPrinciple;
    private static Address addr;
    
    public PrincipleTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        
        addr = new Address.Builder(37).streetName("Orchid").areaName("Goodwood").areaCode("7460").build();
        
        principle = new Principle.Builder("P0001").firstName("Jan").lastName("Steyl").address(addr).dpHeads(null).build();
        
        Assert.assertEquals(principle.getId(), "P0001");
        Assert.assertEquals(principle.getFirstName(),"Jan");
        Assert.assertEquals(principle.getLastName(),"Steyl");
        Assert.assertEquals(principle.getAddress(),addr);
        Assert.assertEquals(principle.getDpHeads(),null);
    
    }
    
    @Test
    public void testUpdate(){
        
        addr = new Address.Builder(37).streetName("Orchid").areaName("Goodwood").areaCode("7460").build();
        
        newPrinciple = new Principle.Builder("P0002").firstName("Jan").lastName("Steyl").address(addr).dpHeads(null).build();
        
        Assert.assertEquals(newPrinciple.getId(), "P0002");
        Assert.assertEquals(newPrinciple.getFirstName(),"Jan");
        Assert.assertEquals(newPrinciple.getLastName(),"Steyl");
        Assert.assertEquals(newPrinciple.getAddress(),addr);
        Assert.assertEquals(newPrinciple.getDpHeads(),null);
    
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
