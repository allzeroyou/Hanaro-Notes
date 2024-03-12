package org.example.app.dao;

import org.example.app.data.CustDto;
import org.example.app.frame.Dao;

import java.util.ArrayList;
import java.util.List;

public class CustDao implements Dao<String, CustDto> {


    @Override
    public int insert(CustDto custDto) {
        System.out.println("Duplicated ID Exception 발생..."); // 백엔드에서만 버그발생 -> 이걸 프론트에게 알려주려면?
        //--> 예외처리 해줘야 함.

        // System.out.println("Oracle DB: Inserted ..." + custDto);
        return 0;
    }

    @Override
    public int delete(String s) {
        System.out.println("Oracle DB: Deleted..." + s);
        return 0;
    }

    @Override
    public int update(CustDto custDto) {
        System.out.println("Oracle DB: Updated ..." + custDto);
        return 0;
    }

    @Override
    public CustDto select(String s) {
        return CustDto.builder().id(s).pwd("pw1").name("allzero").build();
    }

    @Override
    public List<CustDto> select() {
        // List: 불변
        // ArrayList: 가변
        List list = new ArrayList<CustDto>();
        list.add(CustDto.builder().id("id01").pwd("pw01").name("a").build());
        list.add(CustDto.builder().id("id02").pwd("pw02").name("b").build());
        list.add(CustDto.builder().id("id03").pwd("pw03").name("c").build());
        return list;
    }
}
