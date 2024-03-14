package com.hana.collection;

import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        System.out.println(list);

        for (String i : list) {
            System.out.println(i);
        }
        // 컬렉션에 stream() 함수 사용 가능
        list.stream().forEach((s) -> System.out.println(s));
        System.out.println(list.size());

        list.remove("B");
        list.stream().forEach((s)-> System.out.println(s));
        // 삽입
        list.add("D");
        list.add("E");
        System.out.println(list.indexOf("A"));
        // get(인덱스)로 값 추출 가능
        String result = list.get(list.indexOf("A"));
        System.out.println(result);
        // 삭제
        list.remove("A");

    }
}
