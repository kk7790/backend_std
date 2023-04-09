package org.example;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class QueueObjectTest {
    Queue<Integer> queue = new LinkedList<>();
    @Test
    void addQueue(int userInput){
        queue.add(userInput);
        System.out.println("현재 큐 : "+queue);
//        assertEquals(queue,0);
        queueSize();

    }

    void queueSize(){
        System.out.println("큐의 사이즈는 "+ queue.size());
    }


}