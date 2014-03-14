/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model.salary;

import com.tracy.immutable.model.members.Principle;

/**
 *
 * @author student
 */
public final class PrincipleSalary implements Salary{
    
    private String id;
    private double salary;
    private Principle principle;
    
    public double calcSalary() {
        
        salary = 8500 * 4 * 1.5;
        return salary;
        
    }
    
    private PrincipleSalary()
    {
        
    }
    
    private PrincipleSalary(Builder builder) {
        id = builder.id;
        salary = builder.salary;
        principle = builder.principle;
        
    }
    
    public static class Builder{
        
        private String id;
        private double salary;
        private Principle principle;
        

        public Builder(String id) {
            this.id = id;
        }
        
        public Builder salary(double value){
            salary = value;
            return this;
        }
        
        public Builder principle(Principle value){
            principle = value;
            return this;
        }
        
        public PrincipleSalary build(){
            return new PrincipleSalary(this);
        }
    }

    public String getId() {
        return id;
    }

    public Principle getPrinciple() {
        return principle;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PrincipleSalary other = (PrincipleSalary) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    
    
}
