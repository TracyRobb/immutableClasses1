/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model.school;

/**
 *
 * @author student
 */
public interface Mark {
    
    public String getId();
    public double getMark();
    public void calcMark( int score, int total);
    
}
