package org.example.app;

import org.example.app.data.CustDto;
import org.example.app.exception.IdNotFoundException;
import org.example.app.frame.Service;
import org.example.app.service.CustService;

public class UpdateCustTest {
    public static void main(String[] args) {
        // delete test
        Service<String, CustDto> service;
        service = new CustService();

        // test용
        CustDto custDto = new CustDto("id01", "pwd", "allzero");

        try {
            service.modify(custDto);
        } catch (IdNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
