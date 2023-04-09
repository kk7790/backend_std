package org.example;

public class Main {
    public static void main(String[] args) {
        ListObject listObject = new ListObject();
        for(int i = 0; i < 10; i++){
            listObject.addObject(i+1);
        }
        listObject.allData();

        listObject.delObject(4);
        listObject.delFirst();
        listObject.delLast();
        listObject.AllDelObject();
    }
}