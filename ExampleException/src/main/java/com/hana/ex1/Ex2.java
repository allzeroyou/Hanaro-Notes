package com.hana.ex1;

// 스레드 사용
public class Ex2 {
    public static void main(String[] args) {

        System.out.println("start");
        try {
            Thread.sleep(3000);
            // 3초 기다리다가 process가 중단될 수도 있으므로
            // try~catch문으로 감싸줘야 함.
        } catch (InterruptedException e) {
            System.out.println("Interrupted ..");
        }
        System.out.println("end");

        try {
            Class.forName("org.mysql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("File not Found ..");
        }
    }

}
