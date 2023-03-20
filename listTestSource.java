package org.example;

import java.util.Scanner;

public class listTestSource {
    public static void main(String[] args) {
        int listLength = 3;
        int[] testArray = new int[3];
        int i;

        System.out.println("현재 배열 값 : ");
        for (i = 0; i < 3; i++) {
            testArray[i] = i+1;
            System.out.print(testArray[i]);
        }

        System.out.println("배열 길이와 값 추가+1");
        listLength++;
        System.out.println("length : "+listLength);
        int[] newArray = new int[listLength];
        for (i = 0; i < listLength-1; i++) {
            newArray[i] = testArray[i];
        }
        newArray[listLength-1] = testArray.length+1;

        for(i=0; i<newArray.length;i++){
            System.out.print(newArray[i]);
        }

        System.out.println("배열 길이 추가+1");
        listLength++;
        int[] newArray2 = new int[listLength];
        for (i = 0; i < listLength-1; i++) {
            newArray2[i] = newArray[i];
        }
        newArray2[listLength-1] = newArray.length+1;
        for(i=0; i<newArray2.length;i++){
            System.out.print(newArray2[i]);
        }

    }
}
