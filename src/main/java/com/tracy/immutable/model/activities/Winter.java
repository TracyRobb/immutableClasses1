/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.model.activities;

/**
 *
 * @author student
 */
public final class Winter implements Extramural{
    
    private String id;
    private String name;
    private String coach;
    
    private Winter()
    {
        
    }
    
    private Winter(Builder builder) 
    {
        id = builder.id;
        name = builder.name;
        coach = builder.coach;

    }
    
    public static class Builder{
        
        private String id;
        private String name;
        private String coach;

        public Builder(String id) {
            this.id = id;
        }

        public Builder name(String value){
            name = value;
            return this;
        }

        public Builder coach(String value){
            coach = value;
            return this;
        }

        public Winter build(){
            return new Winter(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name; 
    }

    public String getCoach() {
        return coach;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Winter other = (Winter) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    
    
}
