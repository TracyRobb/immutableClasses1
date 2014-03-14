/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model;

import com.tracy.immutable.config.AppConfig;
import com.tracy.immutable.model.members.Address;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
public class AddressTest {
    
    private static Address addr;
    private static Address newAddr;
    
    public AddressTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        addr = new Address.Builder(37).streetName("Orchid").areaName("Goodwood").areaCode("7460").build();
        
        Assert.assertEquals(addr.getHouseNumber(), 37);
        Assert.assertEquals(addr.getStreetName(), "Orchid");
        Assert.assertEquals(addr.getAreaName(), "Goodwood");
        Assert.assertEquals(addr.getAreaCode(), "7460");
        
        
    }
    
    @Test
    public void testUpdate(){
        
        newAddr = new Address.Builder(37).streetName("Zinnia").areaName("Goodwood").areaCode("7460").build();
        
        Assert.assertEquals(newAddr.getHouseNumber(), 37);
        Assert.assertEquals(newAddr.getStreetName(), "Zinnia");
        Assert.assertEquals(newAddr.getAreaName(), "Goodwood");
        Assert.assertEquals(newAddr.getAreaCode(), "7460");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        //ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        //addr = (Address)ctx.getBean("addrObj");
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
