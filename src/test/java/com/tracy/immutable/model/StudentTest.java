/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model;

import com.tracy.immutable.model.members.Student;
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
public class StudentTest {
    
    private static Student stud;
    private static Student studUpdate;
    
    public StudentTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        stud = new Student.Builder("W10207").firstName("Tracy").lastName("Lance").address(null).stubjects(null).build();
        
        Assert.assertEquals(stud.getId(), "W10207");
        Assert.assertEquals(stud.getFirstName(),"Tracy");
        Assert.assertEquals(stud.getLastName(),"Lance");
        Assert.assertEquals(stud.getAddress(),null);
        Assert.assertEquals(stud.getSubjects(),null);
    }
    
    @Test
    public void testUpdate(){
        
        studUpdate = new Student.Builder("W10207").firstName("Trevor").lastName("Lance").address(null).stubjects(null).build();
        
        Assert.assertEquals(studUpdate.getId(), "W10207");
        Assert.assertEquals(studUpdate.getFirstName(),"Trevor");
        Assert.assertEquals(studUpdate.getLastName(),"Lance");
        Assert.assertEquals(studUpdate.getAddress(),null);
        Assert.assertEquals(studUpdate.getSubjects(),null);
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
