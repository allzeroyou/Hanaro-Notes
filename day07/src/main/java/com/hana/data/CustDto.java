package com.hana.data;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustDto {
    private String id;
    private String name;
    //private String custName; // cust name을 어떻게 표기하는게 좋을까
    private String pwd;

}
