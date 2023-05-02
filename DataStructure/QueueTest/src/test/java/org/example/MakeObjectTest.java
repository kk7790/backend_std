package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeObjectTest {
    MakeObject makeObject = new MakeObject();
    @Test
    public void addQueue(){
        makeObject.addQueue(1);
        makeObject.allData();
        makeObject.addQueue(1);
        makeObject.addQueue(2);
        makeObject.addQueue(3);
        makeObject.addQueue(4);
        System.out.println("현재 큐 : "+makeObject.allData());
        System.out.println("큐의 사이즈는 "+ makeObject.sizeCheck());
        makeObject.delQueue();
        makeObject.allData();
        makeObject.allDelQueue();
    }


}