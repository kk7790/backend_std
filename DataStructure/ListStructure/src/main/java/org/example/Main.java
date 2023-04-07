package org.example;

public class Main {
    public static void main(String[] args) {
        ListObject listObject = new ListObject();
        listObject.size();
        listObject.addObject(1);
        listObject.addObject(2);
        listObject.addObject(3);

        listObject.delObject(1);
        listObject.AllDelObject();
    }
}