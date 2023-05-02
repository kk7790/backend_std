package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackObjectTest {
    @Test
    void stackTest(){
        StackObject stackObject = new StackObject();
        stackObject.stackSize();
        stackObject.addStack(1);
        stackObject.addStack(2);
        stackObject.addStack(3);
        stackObject.addStack(4);
        stackObject.addStack(5);
        stackObject.allDataPrint();

        stackObject.delStack();
        stackObject.allDataPrint();
        stackObject.allDelStack();
        stackObject.allDataPrint();
    }

}