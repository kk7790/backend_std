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
            size --;
            elementData = Arrays.copyOf(elementData, size);
        }
        System.out.println("마지막 값 삭제 후 사이즈 : " + size());
    }
    public void delFirst(){
        if(size == 0){
            System.out.println("현재 배열에 값이 없습니다!");
        }
        else{
            size --;
            elementData = Arrays.copyOfRange(elementData,1,size+1);

        }
//        int sizeCheck = size();
        System.out.println("처음 값 삭제 후 사이즈 : " + size());
    }

    public void delObject(Object userDelete){
        System.out.println("---------------특정 값 삭제------------------");
        int remember = 0;
        for(int i = 0; i<size-1 ; i++){
            if(elementData[i] == userDelete){
                remember = i;
                System.out.println("찾은 위치 : "+ remember);
            }
        }
        int resultSize = elementData.length -1;
        if(size == 0){
            System.out.println("현재 배열에 값이 없습니다!");
        }
        else{
            Object[] tmpData = new Object[remember+1];
            Object[] tmpData2 = new Object[resultSize-remember];
            tmpData = Arrays.copyOf(elementData,remember);

            tmpData2 = Arrays.copyOfRange(elementData,remember+1,resultSize+1);

            elementData = Arrays.copyOf(tmpData,tmpData.length);
            int addCount = resultSize - (remember+1);

            size = addCount-1;
            for(int i=0;i <= addCount; i++){
                addLast(tmpData2[i]);
            }
            allDataPrint();
//            elementData = Arrays.copyOfRange(tmpData2,remember+1,resultSize);

        }
        size --;
        System.out.println("현재 배열 사이즈 "+ size());
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
