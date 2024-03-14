package com.hana.collection;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class List3 {
    public static void main(String[] args) {
        List<UserDto> list = new ArrayList<>();

        list.add(new UserDto("id", "pwd", "allzero", 20,  20000L, LocalDate.parse("2024-03-14")));
        list.add(new UserDto("id2", "pwd2", "allzero", 20, 20000L, LocalDate.parse("2024-03-14")));
        list.add(new UserDto("id03", "pwd3", "allzero", 20, 20000L, LocalDate.parse("2024-03-14")));

        // 삭제
        // id 값이 key 값임.
//        for(UserDto u:list){
//            if(u.getId().equals("id03")){
//                list.remove(u);
//                break;
//            }
//        }
        // 수정
        // id03을 말숙이로 수정
        for(UserDto u:list){
            if(u.getId().equals("id03")){
                u.setName("말숙이"); // 레퍼런스 값을 바꾸겠음!
                break;
            }
        }
        // 검색
        for(UserDto u:list){
            if(u.getId().equals("id03")){
                System.out.println(u);
            }
        }


        // 2번째 실습-formatter 이용
        System.out.println("---------------------------------------");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일");

        for (UserDto c : list) {
            System.out.printf("고객정보: %s %d살 이름: %s %, d원 날짜: %s %n", c.getId(), c.getAge(), c.getName(), c.getMoney(), c.getRegdate().format(formatter));
        }


    }
}
