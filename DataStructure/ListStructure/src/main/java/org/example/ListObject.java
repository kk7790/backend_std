package org.example;

import java.util.ArrayList;
import java.util.List;
public class ListObject {
    List<Integer> listA = new ArrayList<Integer>();
    public List<Integer> addObject(int userInput){
        listA.add(userInput);
        System.out.println("값"+userInput+"이 추가되었습니다.");
        System.out.println("현재 리스트 : "+listA);
        size();
        return listA;
    }

    public List<Integer> delObject(int userDelete){
        listA.remove(userDelete);
        System.out.println("값"+userDelete+"이 삭제되었습니다.");
        System.out.println("현재 리스트 : "+listA);
        size();
        return listA;
    }

    public void AllDelObject(){
        listA.clear();
        System.out.println("전체 값이 삭제되었습니다.");
        System.out.println("현재 리스트 : "+listA);
        size();
    }
    void size() {
        System.out.println("리스트 사이즈 :" + listA.size());
//        return listA.size();
    }
}
