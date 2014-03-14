/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model.salary;
import com.tracy.immutable.model.members.Student;

/**
 *
 * @author student
 */
public final class Fees {
    
    private String id;
    private Student stud;
    private double outstandingAmount;
    
    public double CalcFees()
    {
        outstandingAmount = stud.getSubjects().size() * 1700 * 1.5;
        return outstandingAmount;
    }
    
    private Fees()
    {
        
    }
    
    private Fees(Builder builder) {
        stud = builder.stud;
        
    }
    
    public static class Builder{
        
        private String id;
        private double outstandingAmount;
        private Student stud;
        
        public Builder student(double value){
            outstandingAmount = value;
            return this;
        } 
        
        public Builder(Student stud) {
            this.stud = stud;
        }
        
        public Builder id(String value){
            id = value;
            return this;
        }
        
        public Fees build(){
            return new Fees(this);
        }
    }
    
    public String getId() {
        return id;
    }

    public Student getStud() {
        return stud;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + (this.stud != null ? this.stud.hashCode() : 0);
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
        final Fees other = (Fees) obj;
        if (this.stud != other.stud && (this.stud == null || !this.stud.equals(other.stud))) {
            return false;
        }
        return true;
    }
    
    
    
}
