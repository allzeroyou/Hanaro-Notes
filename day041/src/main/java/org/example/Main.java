package org.example;

import org.example.app.data.CustDto;
import org.example.app.data.ItemDto;
import org.example.app.frame.Service;
import org.example.app.service.CustService;
import org.example.app.service.ItemService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // test 코드

        Service<String, CustDto> service;
        service = new CustService();

        // insert
        // 리액트에서 input한 값 이용해서 백엔드 코드 돌리고 db에 저장됨
        CustDto custDto = CustDto.builder().id("id01").pwd("pwd01").name("allzero").build();
        service.add(custDto);

        List<CustDto> custList = null; // 예외처리 위해서 코드를 쪼개자.
        custList = service.get();
        for (CustDto cust : custList) {
            System.out.println(cust); // 이 데이터를 json화해서 react로 보낸다~
        }

        // item 코드
        Service<Long, ItemDto> itemService;
        itemService = new ItemService();

        // test
        ItemDto itemDto = ItemDto.builder().id(20240312).name("test").price(100).build();
        itemService.add(itemDto);

        List<ItemDto> itemList = null;
        itemList = itemService.get();

        for(ItemDto item: itemList){
            System.out.println(item); // 데이터 출력
        }
    }
}