/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.service;

import com.tracy.immutable.model.school.Department;
import com.tracy.immutable.service.crud.DepartmentCrudService;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
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
public class DepartmentTestCrudService {
    
    @Mock
    DepartmentCrudService crudService;
    

    @BeforeMethod
    public void setUpMethod() throws Exception { 
        
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(DepartmentCrudService.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        
        Department dep = new Department.Builder("D0001").name("Department Of Maths").sub(null).teacher(null).build();
        Department returnDep = crudService.persist(dep);
        when(crudService.persist(dep)).thenReturn(returnDep);
        Mockito.verify(crudService).persist(dep);


    }

    @Test
    public void testRead() throws Exception {
        
        Department dep = new Department.Builder("D0001").name("Department Of Maths").sub(null).teacher(null).build(); 
        Department returnDep = crudService.find(dep.getId());
        when(crudService.find(dep.getId())).thenReturn(returnDep);
        Mockito.verify(crudService).find(dep.getId());

    }

    @Test
    public void testUpdate() throws Exception 
    {
        Department dep = new Department.Builder("D0001").name("Department Of Maths").sub(null).teacher(null).build();

        Department returnDep = crudService.merge(dep);
        when(crudService.merge(dep)).thenReturn(returnDep);
        Mockito.verify(crudService).merge(dep);

    }

    @Test
    public void testDelete() throws Exception 
    {

        Department dep = new Department.Builder("D0001").name("Department Of Maths").sub(null).teacher(null).build();
        Department returnDep = crudService.remove(dep);
        when(crudService.remove(dep)).thenReturn(returnDep);
        Mockito.verify(crudService).remove(dep);

    }
}
