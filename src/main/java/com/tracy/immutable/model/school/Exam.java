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
public final class Exam implements Mark{
    
    private String id;
    private double mark;
    private Subject sub;
    
    private Exam()
    {
        
    }
    
    private Exam(Builder builder) {
        id = builder.id;
        mark = builder.mark;
        sub = builder.sub;

    }
    
    public static class Builder{
        private String id;
        private double mark;
        private Subject sub;

        public Builder(String id) {
            this.id = id;
        }

        public Builder mark(double value){
            mark = value;
            return this;
        }

        public Builder subject(Subject value){
            sub = value;
            return this;
        }
        

        public Exam build(){
            return new Exam(this);
        }
    }

    public void calcMark(int score, int total) {
        mark = score/total * 100;
    }
    
    public String getId() {
        return id;
    }
    
    public double getMark() {
        return mark;
    }

    public Subject getSub() {
        return sub;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Exam other = (Exam) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    
    
    

    
    
    
    
}
