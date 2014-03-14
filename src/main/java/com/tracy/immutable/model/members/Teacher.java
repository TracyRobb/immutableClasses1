/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model.members;

import com.tracy.immutable.model.school.Subject;
import java.util.List;

/**
 *
 * @author student
 */
public final class Teacher implements SchoolMember{
    
    private String id;
    private String firstName;
    private String lastName;
    private Address address;
    private List<Student> students;
    private List<Subject> subjects;
    
    private Teacher()
    {
        
    }
    
    private Teacher(Builder builder) {
        id = builder.id;
        firstName = builder.firstName;
        lastName = builder.lastName;
        address = builder.address;
        students = builder.students;
        subjects = builder.subjects;

    }
    
    public static class Builder{
        private String id;
        private String firstName;
        private String lastName;
        private Address address;
        private List<Subject> subjects;
        private List<Student> students;

        public Builder(String id) {
            this.id = id;
        }

        public Builder firstName(String value){
            firstName = value;
            return this;
        }

        public Builder lastName(String value){
            lastName = value;
            return this;
        }
        
        public Builder address(Address value){
            address = value;
            return this;
        }
        
        public Builder students(List<Student> value){
            students = value;
            return this;
        }
        
        public Builder subjects(List<Subject> value){
            subjects = value;
            return this;
        }

        public Teacher build(){
            return new Teacher(this);
        }
    }
    

    public String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName; 
    }

    public Address getAddress() {
        return address;
    }
    
    public List<Subject> getSubjects() {
        return subjects;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Teacher other = (Teacher) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
