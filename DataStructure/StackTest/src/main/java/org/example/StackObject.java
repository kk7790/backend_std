package org.example;

import java.util.Stack;

public class StackObject extends ObjectMake{
//    int size = 1;
//    ObjectMake stackMake = new ObjectMake();
//    Stack<Integer> userMakeStack = new Stack<>();
    public void addStack(int userInput){
        addLast(userInput);
        allDataPrint();
        size();
    }

    public void delStack(){
        delLast();
        allDataPrint();
    }

    void allDelStack(){
        allDelete();
        allDataPrint();
    }
    void stackSize(){
        size();
    }
}
