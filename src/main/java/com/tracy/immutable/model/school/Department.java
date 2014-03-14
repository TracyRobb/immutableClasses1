/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model.school;

import com.tracy.immutable.model.members.Teacher;

/**
 *
 * @author student
 */
public final class Department {
    
    private String id;
    private String name;
    private Subject sub;
    private Teacher teacher;
    
    private Department()
    {
        
    }
    
    private Department(Builder builder) {
        id = builder.id;
        name = builder.name;
        sub = builder.sub;
        teacher = builder.teacher;
        
    }
    
    public static class Builder{
        private String id;
        private String name;
        private Subject sub;
        private Teacher teacher;

        public Builder(String id) {
            this.id = id;
        }

        public Builder name(String value){
            name = value;
            return this;
        }

        public Builder sub(Subject value){
            sub = value;
            return this;
        }
        
        public Builder teacher(Teacher value){
            teacher = value;
            return this;
        }
        
        public Department build(){
            return new Department(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Subject getSub() {
        return sub;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Department other = (Department) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    
    
}
