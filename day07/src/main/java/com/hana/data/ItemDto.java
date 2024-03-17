package com.hana.data;

import java.util.Date;

public class ItemDto {
    private int id;
    private String name;
    private long price;
    // mysql는 옛날거라 자바에서의 최근 시간 클래스인 Datatime은 맞지 않음
    private Date regdate;
    private Date updatedate;

}
