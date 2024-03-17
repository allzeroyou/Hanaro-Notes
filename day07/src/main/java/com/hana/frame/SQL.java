package com.hana.frame;

public class SQL {
    // insert: C
    public static String insertCUst = "INSERT INTO db_cust VALUES(?,?,?)";

    // 가져오는거 select where: R
    public static String selectAllCust = "SELECT * FROM db_cust";
    public static String selectCust = "SELECT * FROM db_cust WHERE id=?";

    // 데이터 변경하는거 update: U
    public static String updateCust = "UPDATE db_cust SET pwd=?, name=? WHERE id=?";

    // 데이터 삭제 delete: D
    public static String deleteCust = "DELETE FROM db_cust WHERE id=?";

    // 2번째 과제: Item
    public static String insertCust = "INSERT INTO db_item VALUES (?,?,?)";
    public static String insertItem = "INSERT INTO db_item VALUES (0,?,?,NOW(), NOW())";
    public static String updateItem = "UPDATE db_item SET name=?, price=?, updatedate=NOW() WHERE id=?";
    // 장바구니 id는 일련의 랜덤한 시퀀스 값임.
    public static String deleteItem = "DELETE FROM db_item WHERE id=?";
    public static String selectAllItem = "SELECT * FROM db_item ORDER BY id";
    public static String selectOneItem = "SELECT * FROM db_item WHERE id=?";
}
