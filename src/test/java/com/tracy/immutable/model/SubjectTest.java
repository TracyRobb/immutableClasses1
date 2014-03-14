/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model;

import com.tracy.immutable.model.school.Subject;
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
public class SubjectTest {
    
    private static Subject sub;
    private static Subject subUpdate;
    
    public SubjectTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        
        sub = new Subject.Builder("S001").name("Biology").modules("Anatomy Of Mice").textbook(null).build();
        
        Assert.assertEquals(sub.getId(), "S001");
        Assert.assertEquals(sub.getName(),"Biology");
        Assert.assertEquals(sub.getModules(),"Anatomy Of Mice");
        Assert.assertEquals(sub.getTextbook(),null);
    }
    
    @Test
    public void testUpdate(){
        
        subUpdate = new Subject.Builder("S001").name("Biology").modules("Anatomy Of Men").textbook(null).build();
        
        Assert.assertEquals(subUpdate.getId(), "S001");
        Assert.assertEquals(subUpdate.getName(),"Biology");
        Assert.assertEquals(subUpdate.getModules(),"Anatomy Of Men");
        Assert.assertEquals(subUpdate.getTextbook(),null);
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
