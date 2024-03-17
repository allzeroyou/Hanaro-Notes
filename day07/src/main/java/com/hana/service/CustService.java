package com.hana.service;

import com.hana.data.CustDto;
import com.hana.exception.DuplicatedIdException;
import com.hana.exception.NotFoundIdException;
import com.hana.frame.ConnectionPool;
import com.hana.frame.Service;
import com.hana.repository.CustRepository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CustService implements Service<String, CustDto> {

    CustRepository repository;
    ConnectionPool cp;

    // new CustRepository와 동일
    public CustService() {
        repository = new CustRepository();
        try {
            cp = ConnectionPool.create();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public CustDto add(CustDto custDto) throws DuplicatedIdException, Exception {
        Connection con = cp.getConnection();
        try {
            con.setAutoCommit(false); // insert시 자동커밋 해제
            repository.insert(custDto, con); // 여기서 예외 던지면 아래 코드 실행 x
            repository.insert(custDto, con); // 여기서 예외 던지면 아래 코드 실행 x
            con.commit(); // 정상적으로 작업 후에 commit
        } catch (Exception e) { // DuplicatedIdException 발생해도 처리 가능
            con.rollback(); //
            throw e;
        } finally {
            // 정상으로 끝나던 예외발생하던 finally 실행됨
            cp.releaseConnection(con); // 해체
        }
        return null;
    }

    @Override
    public CustDto modify(CustDto custDto) throws NotFoundIdException, Exception {
        Connection con = cp.getConnection();
        try {
            con.setAutoCommit(false); // update 시 자동커밋 해제
            repository.update(custDto, con);
            con.commit(); // 정상 작업 후에 commit한다.
        } catch (Exception e) {
            con.rollback();
            throw e;
        } finally {
            //
            cp.releaseConnection(con);
        }
        return null;
    }

    @Override
    public Boolean remove(String s) throws NotFoundIdException, Exception {
        Connection con = cp.getConnection();
        try {
            con.setAutoCommit(false); // update 시 자동커밋 해제
            repository.delete(s, con); // 인자로 뭐가 들어가는게 좋을까-getId() 값이니까 String
            con.commit(); // 정상 작업 후에 commit한다.
        } catch (Exception e) {
            con.rollback();
            throw e;
        } finally {
            cp.releaseConnection(con);
        }
        return null;
    }

    @Override
    public List<CustDto> get() throws Exception {
        Connection con = cp.getConnection();
        List<CustDto> custDtos;
        try {
            custDtos = repository.select(con);
        } catch (Exception e) {
            throw e;
        } finally {
            cp.releaseConnection(con);
        }
        return custDtos;
    }

    @Override
    public CustDto get(String s) throws DuplicatedIdException, Exception {
        //     public static String selectCust = "SELECT * FROM db_cust WHERE id=?";
        Connection con = cp.getConnection();
        CustDto cd = null;
        try {
            cd = repository.select(s, con);
        } catch (Exception e) {
            throw e;
        } finally {
            cp.releaseConnection(con);
        }
        return cd;
    }

}
