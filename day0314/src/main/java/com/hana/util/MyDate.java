package com.hana.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class MyDate {
    public static void main(String[] args) {
        // 전통적인 Date 클래스
        // 현재는 deprecated 됨
        Date d = new Date();
        System.out.println(d);

        System.out.println(d.getYear()); // 1900년부터~
        System.out.println(d.getMonth()); // 0부터 1월

        System.out.println("-----------------------------");

//        // 최근에는 LocalDate 사용
//        LocalDate localNow = LocalDate.now();
//        // System.out.println(localNow);
//        // 특정 날짜의 LocalDate 객체 만들기
//        LocalDate localDate1 = LocalDate.of(2024, 3, 14);
//        System.out.println(localDate1);
//        // parse는 int형으로 변경해줌!
//        LocalDate localDate2 = LocalDate.parse("2024-03-14"); // 형식 맞춰야함
//        System.out.println(localDate2);
//
//        // now는 현재 컴퓨터 시간
//        LocalDateTime localTimeNow = LocalDateTime.now();
//        System.out.println(localTimeNow);


        // LocalDateTime
        // e.g. 로그인한 일시(날짜, 시,분,초까지 필요할 때)
        LocalDateTime localDateTime1 = LocalDateTime.of(2024, 03, 14, 11, 11, 11);
        System.out.println(localDateTime1);
        LocalDateTime localTime2 = LocalDateTime.parse("2024-03-14T11:11:11");
        System.out.println(localTime2.getClass());
        // LocalDate vs LocalDateTime
        // LocalTime: 시간만 필요할 때(시,분,초)
        LocalTime localTime = LocalTime.of(11, 11, 11);
        System.out.println(localTime);

    }
}
