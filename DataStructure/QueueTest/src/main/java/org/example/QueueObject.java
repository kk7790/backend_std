package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class QueueObject {
    Queue<Integer> queue = new LinkedList<>();

    void addQueue(int userInput){
        queue.add(userInput);
        System.out.println("현재 큐 : "+queue);
        queueSize();

    }

     void delQueue(){
        Integer pollValue = queue.poll();
        if(pollValue != null){
            System.out.println("현재 큐의 값이 없습니다!");
        } else {
            System.out.println("현재 큐 : " + queue);
            queueSize();
        }
    }

    void alldelQueue(){
        queue.clear();
        System.out.println("값 전체 삭제 완료 : "+ queue);
        queueSize();
    }

    void queueSize(){
        System.out.println("큐의 사이즈는 "+ queue.size());
    }

}
