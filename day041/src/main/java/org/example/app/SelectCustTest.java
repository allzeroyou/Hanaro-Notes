package org.example.app;

import org.example.app.data.CustDto;
import org.example.app.exception.IdNotFoundException;
import org.example.app.exception.NotFoundException;
import org.example.app.frame.Service;
import org.example.app.service.CustService;

public class SelectCustTest {
    public static void main(String[] args) {
        // delete test
        Service<String, CustDto> service;
        service = new CustService();

        try {
            service.get("notExistedId");
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
