/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model.salary;

import com.tracy.immutable.model.members.DeputyHeadPrinciple;

/**
 *
 * @author student
 */
public final class DeputySalary implements Salary{
    
    private String id;
    private double salary;
    private DeputyHeadPrinciple dpHead;

    public double calcSalary() {
        
        salary = 6500 * 4 * 1.5;
        return salary;
        
    }
    
    private DeputySalary()
    {
        
    }
    
    private DeputySalary(Builder builder) {
        id = builder.id;
        salary = builder.salary;
        dpHead = builder.dpHead;
        
    }
    
    public static class Builder{
        
        private String id;
        private double salary;
        private DeputyHeadPrinciple dpHead;
        
        public Builder(String id) {
            this.id = id;
        }
        
        public Builder salary(double value){
            salary = value;
            return this;
        }
        
        public Builder deputyHead(DeputyHeadPrinciple value){
            dpHead = value;
            return this;
        }
        
        public DeputySalary build(){
            return new DeputySalary(this);
        }
    }

    public String getId() {
        return id;
    }

    public DeputyHeadPrinciple getDpHead() {
        return dpHead;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final DeputySalary other = (DeputySalary) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    

        
    
}
