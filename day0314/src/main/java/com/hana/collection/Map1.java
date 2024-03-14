package com.hana.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");

        System.out.println(map.get("k1"));

        // 키 추출
        Set<String> strings = map.keySet();// return key로 된 집합
        System.out.println(strings);  // [k1, k2, k3]
        strings.forEach((s)-> System.out.print(s+" "));

        // 값 추출
        Collection<String> values = map.values();
        values.forEach((v)-> System.out.print(v+" "));




    }
}
