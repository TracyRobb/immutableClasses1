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
public final class Textbook {
    
    private String id;
    private String name;
    private String author;
    private String publisher;
    
    private Textbook()
    {
        
    }
    
    private Textbook(Builder builder) {
        id = builder.id;
        name = builder.name;
        author = builder.author;
        publisher = builder.publisher;
    }
    
    public static class Builder{
        
        private String id;
        private String name;
        private String author;
        private String publisher;

        public Builder(String id) {
            this.id = id;
        }

        public Builder name(String value){
            name = value;
            return this;
        }

        public Builder author(String value){
            author = value;
            return this;
        }
        
        public Builder publisher(String value){
            publisher = value;
            return this;
        }

        public Textbook build(){
            return new Textbook(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Textbook other = (Textbook) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
