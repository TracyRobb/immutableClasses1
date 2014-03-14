/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model;

import com.tracy.immutable.model.members.Address;
import com.tracy.immutable.model.members.DeputyHeadPrinciple;
import com.tracy.immutable.model.members.Teacher;
import java.util.ArrayList;
import java.util.List;
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
public class DeputyHeadTest {
    
    private static DeputyHeadPrinciple dep;
    private static DeputyHeadPrinciple updateDep;
    private static Address addr;
    private static Teacher teacher;
    
    public DeputyHeadTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        
        List<Teacher> teach = new ArrayList <Teacher> ();
        teach.add(teacher);
        addr = new Address.Builder(37).streetName("Orchid").areaName("Goodwood").areaCode("7460").build();
        updateDep = new DeputyHeadPrinciple.Builder("DP001").firstName("Travis").lastName("Van Rensburg").address(addr).teacher(teach).build();
        
        Assert.assertEquals(updateDep.getId(), "DP001");
        Assert.assertEquals(updateDep.getFirstName(),"Travis");
        Assert.assertEquals(updateDep.getLastName(),"Van Rensburg");
        Assert.assertEquals(updateDep.getAddress(),addr);
        Assert.assertEquals(updateDep.getTeachers(),teach);
    }
    
    @Test
    public void testUpdate(){
        
        List<Teacher> teach = new ArrayList <Teacher> ();
        teach.add(teacher);
        addr = new Address.Builder(37).streetName("Orchid").areaName("Goodwood").areaCode("7460").build();
        dep = new DeputyHeadPrinciple.Builder("DP001").firstName("Treck").lastName("Van Rensburg").address(addr).teacher(teach).build();
        
        Assert.assertEquals(dep.getId(), "DP001");
        Assert.assertEquals(dep.getFirstName(),"Treck");
        Assert.assertEquals(dep.getLastName(),"Van Rensburg");
        Assert.assertEquals(dep.getAddress(),addr);
        Assert.assertEquals(dep.getTeachers(),teach);
    
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
