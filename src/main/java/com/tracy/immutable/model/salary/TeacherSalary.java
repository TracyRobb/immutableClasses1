/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model.salary;

import com.tracy.immutable.model.members.Teacher;

/**
 *
 * @author student
 */
public final class TeacherSalary implements Salary{
    
    private String id;
        private double salary;
        private Teacher teacher;
    
    public double calcSalary() {
        
        salary = 4500 * 4 * 1.5;
        return salary;
        
    }
    
    private TeacherSalary()
    {
        
    }
    
    private TeacherSalary(Builder builder) {
        id = builder.id;
        salary = builder.salary;
        teacher = builder.teacher;
    }
    
    public static class Builder{
        
        private String id;
        private double salary;
        private Teacher teacher;
        
        public Builder(String id) {
            this.id = id;
        }
        
        public Builder salary(double value){
            salary = value;
            return this;
        }
        
        public Builder teacher(Teacher value){
            teacher = value;
            return this;
        }
        
        public TeacherSalary build(){
            return new TeacherSalary(this);
        }
    }

    public String getId() {
        return id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final TeacherSalary other = (TeacherSalary) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    
    
}
