package org.example;

import java.util.Arrays;

public class ObjectMake {
    public int size = 1;

    public Object[] elementData = new Object[size];

    //add 구현
    public void addLast(Object element) {
        size++;
        if(elementData[0] != null){
            elementData = Arrays.copyOf(elementData, size-1);
            elementData[size-2] = element;
        }
        else{
            elementData[0]=element;
        }
        allDataPrint();
    }

    public boolean addFirst(Object element) {
        if(size == 0){
            size ++;
            elementData[size] = element;
        }
        else {
            elementData[size] = element;
            size++;
        }
        return true;
    }

    public void delLast(){
        if(size == 0){
            System.out.println("현재 배열에 값이 없습니다!");
        }
        else{
            elementData = Arrays.copyOf(elementData, size-1);
            size --;
        }

    }
    public void delFirst(){
        if(size == 0){
            System.out.println("현재 배열에 값이 없습니다!");
        }
        else{
            size = size -2;
            int sizeCheck = size();
            elementData = Arrays.copyOfRange(elementData,1,size+1);

        }
        int sizeCheck = size();
        System.out.println("현재 배열 사이즈 "+ sizeCheck);
    }

    public void allDelete(){
        if(size > 0){
            for(int i= elementData.length; i>0;i--){
                elementData = Arrays.copyOf(elementData,size-1);
                size --;
            }
        }
        else{
            System.out.println("현재 배열의 값이 없습니다");
        }
        size = 1;
    }

    public int size(){
        return size;
    }

    public void allDataPrint(){
        System.out.print("현재 배열 값 : ");
        for(int n = 0; n <elementData.length; n++){
            System.out.print(elementData[n]);
        }
        System.out.println("");
    }
    
}
