package org.example;

import java.util.Stack;

public class StackObject {
    int size = 1;
    ObjectMake stackMake = new ObjectMake();
//    Stack<Integer> userMakeStack = new Stack<>();
    public void addStack(Object userInput){
        stackMake.addLast(userInput);
        System.out.print("추가 완료. 현재 스택 : ");
        stackMake.allDataPrint();
        System.out.println("사이즈 : "+stackMake.size());
    }

    public void delStack(){
        stackMake.delLast();
        System.out.print("삭제 완료, 현재 스택 : ");
        stackMake.allDataPrint();
        System.out.println("스택사이즈 : "+ stackMake.size());
    }

    void alldelStack(){
        stackMake.allDelete();
        System.out.print("스택 값 전부 삭제 완료 : ");
        stackMake.allDataPrint();
        System.out.println("스택사이즈 : "+ stackMake.size());
    }
    void stackSize(){
        System.out.println("스택사이즈 : "+ stackMake.size());
    }
}
