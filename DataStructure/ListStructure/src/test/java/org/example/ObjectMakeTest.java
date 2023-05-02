package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObjectMakeTest {

    @Test
    void mainTest22(){
        ListObject listObject = new ListObject();
        listObject.addLast(1);
        listObject.allData();
        for(int i = 0; i < 10; i++){
            listObject.addObject(i+1);
        }

//        System.out.println("1번째 값 삭제");
//        listObject.delObjectFirst();
//        listObject.allData();
//        listObject.size();
//        System.out.println("마지막 값 삭제");
//        listObject.delObject();
//        listObject.allData();
//        listObject.size();
//        System.out.println("임의의 값 맨 앞에 삽입");
//        listObject.addObjectFirst(99);
//        System.out.println("임의의 값 삭제");
//        listObject.delObjectChoose(3);
//        listObject.allData();
//        listObject.size();
//        System.out.println("전부 삭제합니다");
//        listObject.AllDelObject();
    }

}