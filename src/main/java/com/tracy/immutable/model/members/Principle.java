/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model.members;

import java.util.List;

/**
 *
 * @author student
 */
public final class Principle implements SchoolMember{
    
    private String id;
    private String firstName;
    private String lastName;
    private Address address;
    private List<DeputyHeadPrinciple> dpHeads;
    
    private Principle()
    {
        
    }
    
    private Principle(Builder builder) {
        id = builder.id;
        firstName = builder.firstName;
        lastName = builder.lastName;
        address = builder.address;
        dpHeads = builder.dpHeads;
    }
    
    public static class Builder{
        private String id;
        private String firstName;
        private String lastName;
        private Address address;
        private List<DeputyHeadPrinciple> dpHeads;

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
        
        public Builder dpHeads(List<DeputyHeadPrinciple> value){
            dpHeads = value;
            return this;
        }

        public Principle build(){
            return new Principle(this);
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

    public List<DeputyHeadPrinciple> getDpHeads() {
        return dpHeads;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Principle other = (Principle) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    
    
}
