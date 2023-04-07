package org.example;

public class Main {
    public static void main(String[] args) {
        QueueObject queueObject = new QueueObject();
        queueObject.addQueue(1);
        queueObject.addQueue(2);
        queueObject.addQueue(3);
        queueObject.addQueue(4);

        queueObject.delQueue();

        queueObject.alldelQueue();
    }
}