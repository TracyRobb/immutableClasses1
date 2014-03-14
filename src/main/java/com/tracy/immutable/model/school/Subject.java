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
public final class Subject {
    
    private String id;
    private String name;
    private String modules;
    private Textbook textbook;
    
    private Subject()
    {
        
    }
    
    private Subject(Builder builder) {
        id = builder.id;
        name = builder.name;
        modules = builder.modules;
        textbook = builder.textbook;
    }
    
    public static class Builder{
        
        private String id;
        private String name;
        private String modules;
        private Textbook textbook;

        public Builder(String id) {
            this.id = id;
        }

        public Builder name(String value){
            name = value;
            return this;
        }

        public Builder modules(String value){
            modules = value;
            return this;
        }
        
        public Builder textbook(Textbook value){
            textbook = value;
            return this;
        }

        public Subject build(){
            return new Subject(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getModules() {
        return modules;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Subject other = (Subject) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    
    
}
