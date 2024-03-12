package org.example.app.service;

import org.example.app.dao.CustDao;
import org.example.app.data.CustDto;
import org.example.app.frame.Dao;
import org.example.app.frame.Service;

import java.util.List;

public class CustService implements Service<String, CustDto> {

    // Data Access Object: 데이터를 db에 접근시킴.
    Dao<String, CustDto> dao;

    public CustService() {
        dao = new CustDao(); // dao는 인터페이스임.
    }

    @Override
    public int add(CustDto custDto) {
        // add는 보통 -> 회원가입
        dao.insert(custDto);
        // sms
        System.out.println("send SMS...");
        // email
        System.out.println("send mail...");
        return 0;
    }

    @Override
    public int delete(String s) {
        dao.delete(s);
        return 0;
    }

    @Override
    public int modify(CustDto custDto) {
        dao.update(custDto);
        // 회원정보 수정시 메일 전송 -> service 즉, 비즈니스 로직에 들어가야할 내용임.
        // email
        System.out.println("send mail...");
        return 0;
    }

    @Override
    public CustDto get(String s) {
        // 사용자 정보 -> 여러가지..(포인트, 신용도 등)
        // 하나의 dao에서 가져오지 않음.
        // 여러 dao에서 가져오고 합쳐서 이를 뿌려준다 -> 비즈니스 로직임.
        return dao.select(s);
    }

    @Override
    public List<CustDto> get() {
        return dao.select();
    }
}
