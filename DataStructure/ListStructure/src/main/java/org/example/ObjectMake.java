package org.example;

import java.util.Arrays;

public class ObjectMake {
    private int size = 0;
    private int realSize = 100;
    private Object[] elementData = new Object[100];

    //메모리 할당
//    private boolean memoryAlloc(){
//        if(size == 100) {
//            return false;
//        }
//        return true;
//
//    }

    //add 구현
    public boolean addLast(int element) {
//        memoryAlloc();
        elementData[size]=element;
        size++;
        return true;
    }
//Stack 과 queue에선 안씀..
    public boolean addFirst(int element) {
//        memoryAlloc();
        for(int i=size; i>=0; i--){
            elementData[i+1] = elementData[i];
            elementData[i] = null;
        }
        elementData[0] = element;
        size++;
        allDataPrint();
        return true;
    }

    public boolean delLast(){
        size();
        if(size == 0){
            return false;
        }
        else{
            elementData[size] = null;
            size --;
            return true;
        }
    }
    public boolean delFirst(){
        if(size == 0){
            return false;
        }
        else{
            for(int i = 0; i<size ; i++){
                elementData[i]=elementData[i+1];
            }
            elementData[size] = null;
            size --;
            return true;
        }
    }

    public boolean delObject(int userDelete){
        int remember = 0;
        if(size == 0){
            return false;
        }
        else{
            for(int i = 0; i<size ; i++){
                if((int) elementData[i] == userDelete){
                    remember = i;
                }
            }
            for(int j=remember; j<size;j++){
                elementData[j] = elementData[j+1];
            }
            elementData[size]= null;
            size --;
            allDataPrint();
            return true;
        }
    }

    public boolean allDelete(){
        if(size > 0){
            for(int i=0; i>size;i++){
                elementData[i] = null;
            }
            size=0;
            return true;
        }
        else{
            return false;
        }
    }

    public int size(){
        return size;
    }

    public boolean allDataPrint(){
        System.out.print("현재 배열 값 : ");
        for(int n = 0; n <size; n++){
            System.out.print(elementData[n]);
        }
        System.out.println("");
        return true;
    }
    
}
