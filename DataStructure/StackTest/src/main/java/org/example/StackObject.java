package org.example;

import java.util.Stack;

public class StackObject {
    Stack<Integer> userMakeStack = new Stack<>();
    Stack<Integer> addStack(int userInput){
        userMakeStack.add(userInput);
        System.out.println("추가 완료. 현재 스택 : "+ userMakeStack);
        stackSize();
        return userMakeStack;
    }

    Stack<Integer> delStack(){
        userMakeStack.pop();
        System.out.println("삭제 완료, 현재 스택 : "+ userMakeStack);
        stackSize();
        return userMakeStack;
    }

    Stack<Integer> alldelStack(){
        userMakeStack.clear();
        System.out.print("스택 값 전부 삭제 완료 : "+ userMakeStack);
        stackSize();
        return userMakeStack;
    }
    void stackSize(){
        System.out.println("현재 스택 크기 : "+ userMakeStack.size());
    }
}
