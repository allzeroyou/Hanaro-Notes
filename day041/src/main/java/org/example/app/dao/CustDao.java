package org.example.app.dao;

import org.example.app.data.CustDto;
import org.example.app.exception.DuplicatedIdException;
import org.example.app.exception.IdNotFoundException;
import org.example.app.exception.NotFoundException;
import org.example.app.frame.Dao;

import java.util.ArrayList;
import java.util.List;

public class CustDao implements Dao<String, CustDto> {


    @Override
    public int insert(CustDto custDto) throws DuplicatedIdException {
        System.out.println("Duplicated ID Exception 발생..."); // 백엔드에서만 버그발생 -> 이걸 프론트에게 알려주려면?
        //--> 예외처리 해줘야 함.
        if (custDto.getId().equals("id01")) {
            throw new DuplicatedIdException("EX0001");
        }
        // System.out.println("Oracle DB: Inserted ..." + custDto);
        return 0;
    }

    @Override
    public int delete(String s) throws IdNotFoundException {

        if (s.equals("notExistedId")) { // 없는 id니까 예외발생.
            throw new IdNotFoundException("EX0002");
        }
        // System.out.println("Oracle DB: Deleted..." + s);
        return 0;
    }

    @Override
    public int update(CustDto custDto) throws IdNotFoundException {
        if (custDto.getId().equals("id01")) {
            throw new IdNotFoundException("EX0003");
        }
        // System.out.println("Oracle DB: Updated ..." + custDto);
        return 0;
    }

    @Override
    public CustDto select(String s) throws NotFoundException {
        if (s.equals("notExistedId")) {
            throw new NotFoundException("EX0004");
        }
        return CustDto.builder().id(s).pwd("pw1").name("allzero").build();
    }

    @Override
    public List<CustDto> select() throws NotFoundException { // 호출되면 예외처리하도록!
        // List: 불변
        // ArrayList: 가변
        List<CustDto> list = new ArrayList<>();
//        list.add(CustDto.builder().id("id01").pwd("pw01").name("a").build());
//        list.add(CustDto.builder().id("id02").pwd("pw02").name("b").build());
//        list.add(CustDto.builder().id("id03").pwd("pw03").name("c").build());
        if (list.isEmpty()) {
            throw new NotFoundException("EX0005");
        }
        return list;
    }
}
