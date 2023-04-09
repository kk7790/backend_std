package org.example;

import java.util.Objects;

public class HashMake {
    private long id;
    private String name;
    private String number;
    public HashMake(long id, String name, String number){
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public int hashCode(){
        int hash = 7;
        hash = 31 * hash + (int)id;
        hash = 31 * hash + (name == null ? 0 : name.hashCode());
        hash = 31 * hash + (number == null ? 0 : number.hashCode());
        System.out.println("hashCode() called - Computed hash : "+ hash);
        return hash;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        HashMake user = (HashMake) o;
        return id == user.id && Objects.equals(name, user.name) &&
                Objects.equals(number, user.number);
    }
}
