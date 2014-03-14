/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model;

import com.tracy.immutable.model.members.Teacher;
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
public class TeacherTest {
    
    private static Teacher teach;
    private static Teacher teachUpdate;
    
    public TeacherTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        
        teach = new Teacher.Builder("TE001").firstName("Lana").lastName("Nel").address(null).subjects(null).students(null).build();
        
        Assert.assertEquals(teach.getId(), "TE001");
        Assert.assertEquals(teach.getFirstName(),"Lana");
        Assert.assertEquals(teach.getLastName(),"Nel");
        Assert.assertEquals(teach.getAddress(),null);
        Assert.assertEquals(teach.getSubjects(),null);
        Assert.assertEquals(teach.getStudents(),null);
    }
    
    @Test
    public void testUpdate(){
        
        teachUpdate = new Teacher.Builder("TE002").firstName("Lana").lastName("Nel").address(null).subjects(null).students(null).build();
        
        Assert.assertEquals(teachUpdate.getId(), "TE002");
        Assert.assertEquals(teachUpdate.getFirstName(),"Lana");
        Assert.assertEquals(teachUpdate.getLastName(),"Nel");
        Assert.assertEquals(teachUpdate.getAddress(),null);
        Assert.assertEquals(teachUpdate.getSubjects(),null);
        Assert.assertEquals(teachUpdate.getStudents(),null);
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
