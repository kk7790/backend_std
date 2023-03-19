package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class stackTestSource {
    public static void main(String[] args) {
        ArrayList<Integer> test_list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i <5; i++){
            int input_v = sc.nextInt();
            test_list.add(input_v) ;
        }
        int count = test_list.size();
        System.out.println("add 6,7");
        test_list.add(6);
        test_list.add(7);
        System.out.println(test_list);

        System.out.println("last element pop");
        test_list.remove(test_list.size()-1);
        System.out.println(test_list);
    }
}
