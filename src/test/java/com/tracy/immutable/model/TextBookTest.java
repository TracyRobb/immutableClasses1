/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model;

import com.tracy.immutable.model.school.Textbook;
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
public class TextBookTest {
    
    private static Textbook text;
    private static Textbook textUpdate;
    
    public TextBookTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation() {
        
        text = new Textbook.Builder("AB001").name("Ancient Biology").author("Debra Messing").publisher("Penguin").build();
        
        Assert.assertEquals(text.getId(), "AB001");
        Assert.assertEquals(text.getName(),"Ancient Biology");
        Assert.assertEquals(text.getAuthor(),"Debra Messing");
        Assert.assertEquals(text.getPublisher(), "Penguin");
    }
    
    @Test
    public void testUpdate(){
        
        textUpdate = new Textbook.Builder("AB001").name("Ancient Biology").author("Debra Messing").publisher("Cengage").build();
        
        Assert.assertEquals(textUpdate.getId(), "AB001");
        Assert.assertEquals(textUpdate.getName(),"Ancient Biology");
        Assert.assertEquals(textUpdate.getAuthor(),"Debra Messing");
        Assert.assertEquals(textUpdate.getPublisher(), "Cengage");
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
