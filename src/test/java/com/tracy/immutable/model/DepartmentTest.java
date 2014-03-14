/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model;

import com.tracy.immutable.model.school.Department;
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
public class DepartmentTest {
    
    private static Department depart;
    private static Department departUpdate;
    
    public DepartmentTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        
        depart = new Department.Builder("D0001").name("Department Of Maths").sub(null).teacher(null).build();
        
        Assert.assertEquals(depart.getId(), "D0001");
        Assert.assertEquals(depart.getName(), "Department Of Maths");
        Assert.assertEquals(depart.getSub(), null);
        Assert.assertEquals(depart.getTeacher(), null);
        
    }
    
    @Test
    public void testUpdate(){
        
        departUpdate = new Department.Builder("D0003").name("Department Of Maths").sub(null).teacher(null).build();
        
        Assert.assertEquals(departUpdate.getId(), "D0003");
        Assert.assertEquals(departUpdate.getName(), "Department Of Maths");
        Assert.assertEquals(departUpdate.getSub(), null);
        Assert.assertEquals(departUpdate.getTeacher(), null);
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
