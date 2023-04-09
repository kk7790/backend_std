package org.example;

public class Main {
    public static void main(String[] args) {
        MakeObject makeObject = new MakeObject();
        System.out.println("배열생성");

        makeObject.addQueue(1);
        makeObject.addQueue(2);
        makeObject.addQueue(3);
        makeObject.addQueue(4);

        makeObject.delQueue();

        makeObject.alldelQueue();
    }
}