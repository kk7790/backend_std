package org.example;

public class MakeObject {
    ObjectMake ListTest = new ObjectMake();
//    Queue<Integer> queue = new LinkedList<>();

    void addQueue(Object userInput){
        ListTest.addLast(userInput);
//        System.out.println(newqueueTest.length);
//        queueTest.allDataPrint();
    }

     void delQueue(){
        ListTest.delFirst();
        int sizeCheck = ListTest.size;
        ListTest.allDataPrint();
        ListTest.size();
    }

    void alldelQueue(){
        ListTest.allDelete();
        System.out.println("값 전체 삭제 완료 : ");
        ListTest.allDataPrint();
        ListTest.size();
    }


}
