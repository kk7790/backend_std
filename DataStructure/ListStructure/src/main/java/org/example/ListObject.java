package org.example;

import java.util.ArrayList;
import java.util.List;
public class ListObject {
    ObjectMake listMake = new ObjectMake();
//    List<Integer> listA = new ArrayList<Integer>();
    public void addObject(int userInput){
        listMake.addLast(userInput);
    }

    public void delObject(int userDelete){
        listMake.delObject(userDelete);
        System.out.println("값"+userDelete+"이 삭제되었습니다.");
        System.out.println("---------------------------------");
        listMake.allDataPrint();
        listMake.size();

    }
    public void delFirst(){
        listMake.delFirst();
        System.out.println("첫번째 값이 삭제되었습니다.");
        listMake.allDataPrint();
        listMake.size();

    }

    public void delLast(){
        listMake.delLast();
        System.out.println("마지막 값이 삭제되었습니다.");
        listMake.allDataPrint();
        listMake.size();

    }

    public void AllDelObject(){
        listMake.allDelete();
        System.out.println("전체 값이 삭제되었습니다.");
        listMake.allDataPrint();
        listMake.size();
    }

    void allData(){
        listMake.allDataPrint();
    }
}
