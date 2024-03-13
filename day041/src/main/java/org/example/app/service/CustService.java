package org.example.app.service;

import org.example.app.dao.CustDao;
import org.example.app.data.CustDto;
import org.example.app.exception.DuplicatedIdException;
import org.example.app.exception.IdNotFoundException;
import org.example.app.exception.NotFoundException;
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
    public int add(CustDto custDto) throws DuplicatedIdException {

        System.out.println("Start TR...");
        // add는 보통 -> 회원가입
        // service 코드에서 DAO 호출함.
        try {
            dao.insert(custDto);
            dao.insert(custDto);
            System.out.println("COMMIT..."); // 반영
        } catch (DuplicatedIdException e) {
            System.out.println("ROLLBACK..."); // 되돌려라!
            throw e;
        } finally {
            // 정상으로 작업이 끝나도 실행
            // 예외 발생해도 실행
            System.out.println("End TR...");
        }
        // sms
        System.out.println("send SMS...");
        // email
        System.out.println("send mail...");
        return 0;
    }

    @Override
    public int delete(String s) throws IdNotFoundException {
        System.out.println("Strat TR..");
        try { // 성공시
            dao.delete(s);
            System.out.println("Commit!");
        } catch (IdNotFoundException e) { // 에러시
            System.out.println("ROLL BACK...");
            throw e;
        } finally {
            System.out.println("END TR..");
        }
        return 0;
    }

    @Override
    public int modify(CustDto custDto) throws IdNotFoundException {
        try {
            dao.update(custDto);
        } catch (IdNotFoundException e) {
            throw e;
        } finally {
            System.out.println("Send about modify mail...");
        }
        // 회원정보 수정시 메일 전송 -> service 즉, 비즈니스 로직에 들어가야할 내용임.
        // email
        return 0;
    }

    @Override
    public CustDto get(String s) throws NotFoundException {
        // 사용자 정보 -> 여러가지..(포인트, 신용도 등)
        // 하나의 dao에서 가져오지 않음.
        // 여러 dao에서 가져오고 합쳐서 이를 뿌려준다 -> 비즈니스 로직임.
        try {
            CustDto result = dao.select(s);
            System.out.println("사용자 정보 어쩌구 반환");
            return result;
        } catch (NotFoundException e) {
            System.out.println("사용자를 찾을 수 없습니다.");
            throw e;
        } finally {
            // 리소스 정리 및 관리 수행.
            System.out.println("리소스 정리하고 실행 종료");
        }
    }

    @Override
    public List<CustDto> get() throws NotFoundException {
        try {
            List<CustDto> select = dao.select();
            System.out.println("사용자 정보들을 어쩌구 반환");
            return select;
        } catch (NotFoundException e) {
            System.out.println("사용자들을 찾을 수 없습니다.");
            throw e;
        } finally {
            // 리소스 정리 및 관리 수행.
            System.out.println("리소스 정리하고 실행 종료");
        }
    }
}
