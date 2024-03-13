package org.example.app;

import org.example.app.data.CustDto;
import org.example.app.exception.DuplicatedIdException;
import org.example.app.frame.Service;
import org.example.app.service.CustService;

public class InsertCustTest {
    public static void main(String[] args) {
        // cust
        Service<String, CustDto> service;
        service = new CustService();

        // insert test
        CustDto custDto = CustDto.builder().id("id01").build();
        try {
            service.add(custDto);
        }catch (DuplicatedIdException e) {
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Error~");
        }

    }
}
