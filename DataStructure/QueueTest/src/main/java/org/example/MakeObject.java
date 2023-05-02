package org.example;

public class MakeObject extends ObjectMake{
//    ObjectMake ListTest = new ObjectMake();
//    Queue<Integer> queue = new LinkedList<>();

//    ObjectMake objectmake = new ObjectMake();

    void addQueue(int userInput){
        addLast(userInput);
    }

     void delQueue(){
         delFirst();
         allDataPrint();
         size();
    }

    void allDelQueue(){
        allDelete();
        allDataPrint();
        size();
    }

    public int sizeCheck(){
        int returnSize = size();
        return returnSize;
    }

    public boolean allData(){
        allDataPrint();
        return true;
    }


}
