package com.hana.collection;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustDto {
    private String id;
    private String pwd;
    private String name;
    private int age;
    private long money;
    // java 8부터는 java.time 패키지 사용(LocalDate)
    private LocalDate regdate;
}
