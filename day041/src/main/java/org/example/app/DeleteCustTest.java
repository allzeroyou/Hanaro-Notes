package org.example.app;

import org.example.app.data.CustDto;
import org.example.app.exception.IdNotFoundException;
import org.example.app.frame.Service;
import org.example.app.service.CustService;

public class DeleteCustTest {
    public static void main(String[] args) {
        // delete test
        Service<String, CustDto> service;
        service = new CustService();

        try{
            service.delete("notExistedId");
        } catch (IdNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
