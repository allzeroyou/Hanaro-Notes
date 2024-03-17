package com.hana.repository;

import com.hana.data.CustDto;
import com.hana.exception.DuplicatedIdException;
import com.hana.exception.NotFoundIdException;
import com.hana.frame.Repository;
import com.hana.frame.SQL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustRepository implements Repository<String, CustDto> {

    @Override
    public CustDto insert(CustDto custDto, Connection con) throws DuplicatedIdException, Exception {
        // 2. Connection -> Service에서 만드니까 connection 만들 필요 없음.
        // 4. PreparedStatement
        PreparedStatement pstmt = null; // try 문에 넣기 위해 선언, 대입을 나눈다.

        try {
            // 3. SQL<-- sql 클래스로 따로 빼줌
            pstmt = con.prepareStatement(SQL.insertCUst); // static -> 바로 접근 가능
            pstmt.setString(1, custDto.getId());
            pstmt.setString(2, custDto.getPwd());
            pstmt.setString(3, custDto.getName());
            pstmt.executeUpdate(); // 업데이트

        } catch (SQLIntegrityConstraintViolationException e) { // 시스템으로 발생하는 에러
            throw new DuplicatedIdException("ER0001"); // 우리가 만든 예외
        } catch (SQLException e) {
            throw new Exception("EX0001");
        } finally {
            // 5. Close
            // null 체크
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return custDto; // custDto 반환
    }

    @Override
    public CustDto update(CustDto custDto, Connection con) throws NotFoundIdException, Exception {
        PreparedStatement pstmt = null;
        // "UPDATE db_cust SET pwd=?, name=? WHERE id=?";
        try {
            pstmt = con.prepareStatement(SQL.updateCust);
            pstmt.setString(1, custDto.getPwd());
            pstmt.setString(2, custDto.getName());
            pstmt.setString(3, custDto.getId());
            // 업데이트
            pstmt.executeUpdate();
        } catch (Exception e) { // id 가 없을 때 에러가 발생하지 않으므로 예외처리 불가능.
            throw new NotFoundIdException("ER002");
        } finally {
            // close 작업
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return custDto;
    }

    @Override
    public Boolean delete(String s, Connection con) throws NotFoundIdException, Exception {
        // delete
        // public static String deleteCust = "DELETE FROM db_cust WHERE id=?";
        PreparedStatement pstmt = null;
        int deleteFlag = 0;
        try {
            pstmt = con.prepareStatement(SQL.deleteCust);
            pstmt.setString(1, s); // s: custDto.getId()
            // 4. sql 전송
            deleteFlag = pstmt.executeUpdate(); // 데이터 변경 있으니까 executeUpdate()
        } catch (Exception e) { // id 가 없을 때 에러가 발생하지 않으므로 예외처리 불가능.
            throw new NotFoundIdException("ER002");
        } finally {
            // close 작업
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        // 5. 결과 출력
        if (deleteFlag == 1) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    @Override
    public List<CustDto> select(Connection con) throws Exception {
        // db 데이터를 모두 가져와서 보여준다.
        PreparedStatement pstmt = null;
        List<CustDto> custData = new ArrayList<>();
        // select의 경우 조회 결과는 ResultSet으로 받는다
        ResultSet res = null;

        try {
            pstmt = con.prepareStatement(SQL.selectAllCust);
            res = pstmt.executeQuery(); // 3건
            //
            System.out.println(res);
            // 5. 결과 출력
            while (res.next()) { // 각각의 데이터를 가리키는 포인터(초기는 맨 위를 가리킴)
                String custID = res.getString("id");
                String custPWD = res.getString("pwd");
                String custNAME = res.getString("name");
                // dto 만들어서 리스트에 저장
                CustDto custDto = new CustDto(custID, custPWD, custNAME);
                custData.add(custDto); // 삽입.
                //System.out.printf("%s %s %s", custID, custPWD, custNAME);
            }
            System.out.println("Get Data .... ");
        } catch (Exception e) {
            throw new RuntimeException("ER003");
        } finally {
            // close 작업
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return custData;
    }

    @Override
    public CustDto select(String s, Connection con) throws DuplicatedIdException, Exception {
        // CustDto 하나만 출력.
        PreparedStatement pstmt = null;
        CustDto custData = null;
        // select의 경우 조회 결과는 ResultSet으로 받는다
        ResultSet res = null;

        try {
            pstmt = con.prepareStatement(SQL.selectCust);
            pstmt.setString(1, s); // s: custDto.getId()

            res = pstmt.executeQuery(); //
            System.out.println(res);
            // 5. 결과 출력
            while (res.next()) { // 각각의 데이터를 가리키는 포인터(초기는 맨 위를 가리킴)
                String custID = res.getString("id");
                String custPWD = res.getString("pwd");
                String custNAME = res.getString("name");
                // dto 만들어서 리스트에 저장
                CustDto custDto = new CustDto(custID, custPWD, custNAME);
                custData = custDto; // 삽입.
                //System.out.printf("%s %s %s", custID, custPWD, custNAME);
            }
            System.out.println("Get Data .... ");
        } catch (Exception e) {
            throw new RuntimeException("ER003");
        } finally {
            // close 작업
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return custData;
    }
}
