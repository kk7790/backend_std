package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class queueTestSource {
    public static void main(String[] args) {
        ArrayList<Integer> queueList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i <3; i++){
            int input_v = sc.nextInt();
            queueList.add(input_v) ;
        }
        int count = queueList.size();
        System.out.println("add 6,7");
        queueList.add(6);
        queueList.add(7);
        System.out.println(queueList);

        System.out.println("last element pop");
        queueList.remove(0);
        System.out.println(queueList);
    }

}
