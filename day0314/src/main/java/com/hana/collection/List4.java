package com.hana.collection;

import java.util.*;

public class List4 {
    public static void main(String[] args) {
        Set<String> setData = new HashSet<>();
        setData.add("A");
        setData.add("C");
        setData.add("B");
        setData.add("C");
        setData.add("A");
        System.out.println(setData);// 중복 제거한 결과 나옴.

        // 1~100까지 랜덤 숫자 중복없이 10개 발생
        Random r = new Random();
        Set<Integer> ranSet = new HashSet<>();

        for(int i =0; i<10; i++){
            int ranNum = r.nextInt(100)+1;
            ranSet.add(ranNum);
        }

        if(ranSet.size() != 10){
            for(int i = 0; i<10-ranSet.size(); i++){
                int ranNum = r.nextInt(100)+1;
                ranSet.add(ranNum);
            }
        }
        System.out.println(ranSet);
        // set은 정렬 메소드 없음 주의
        // set -> list 변환 후 정렬
        List ranList = new ArrayList(ranSet);
        Collections.sort(ranList);
        for (Object s:ranList){
            System.out.println(s);
        }
//        ranSet.stream().sorted();
//        System.out.println(ranSet);
    }
}
