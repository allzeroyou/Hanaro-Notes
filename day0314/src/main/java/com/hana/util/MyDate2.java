package com.hana.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class MyDate2 {
    public static void main(String[] args) {
        // 하나은행 아프리카점에서 입금한 금액을 처리할 때, 시간 맞춰야 함.
        Date date = new Date();
        // 아프리카 날짜 확인
        LocalDate localDate = date.toInstant().atZone(ZoneId.of("Africa/Cairo")).toLocalDate();
        System.out.println(localDate);
        // 서울 날짜 & 시간 확인
        LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.of("Asia/Seoul")).toLocalDateTime();
        System.out.println(localDateTime);
    }
}
