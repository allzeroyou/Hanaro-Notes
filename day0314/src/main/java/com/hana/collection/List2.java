package com.hana.collection;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class List2 {
    public static void main(String[] args) {
        List<CustDto> list = new ArrayList<>();
        // 날짜를 parse를 이용해서 string으로 집어넣음.
        list.add(CustDto.builder().id("id01").pwd("pwd01").name("jame1").age(20).money(30000L).regdate(LocalDate.parse("2024-03-14")).build());
        list.add(CustDto.builder().id("id02").pwd("pwd02").name("jame2").age(20).money(30000L).regdate(LocalDate.parse("2024-03-14")).build());
        list.add(CustDto.builder().id("id03").pwd("pwd03").name("jame3").age(20).money(30000L).regdate(LocalDate.parse("2024-03-14")).build());
        list.add(CustDto.builder().id("id04").pwd("pwd04").name("jame4").age(20).money(30000L).regdate(LocalDate.parse("2024-03-14")).build());
        list.add(CustDto.builder().id("id05").pwd("pwd05").name("jame5").age(20).money(30000L).regdate(LocalDate.parse("2024-03-14")).build());

        list.forEach((s) -> System.out.println(s));

        // 1번째 실습-get해서 사용(무식)
        System.out.println("---------------------------------------");
        for (CustDto c : list) {
            System.out.printf("고객정보: %s %d살 %, d원 %s년 %s월 %s일 %n", c.getId(), c.getAge(), c.getMoney(), c.getRegdate().getYear(), c.getRegdate().getMonthValue(), c.getRegdate().getDayOfMonth());
        }
        // 2번째 실습-formatter 이용
        System.out.println("---------------------------------------");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일");

        for (CustDto c : list) {
            System.out.printf("고객정보: %s %d살 %, d원 날짜: %s %n", c.getId(), c.getAge(), c.getMoney(), c.getRegdate().format(formatter));
        }


    }
}
