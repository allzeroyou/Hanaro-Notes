package com.hana.ex1;

import java.io.InputStreamReader;

public class Ex6 {
    public static void main(String[] args) {
        // try-with-resource 문 사용
// try-with-resources 문은 try 블록 안에서 자원을 선언하고\
// 초기화하는 동시에 해당 자원에 대한 참조를 제공합니다.\
// 이때 선언된 자원은 AutoCloseable 인터페이스를 구현한 클래스의 객체이어야 합니다.
// try-with-resources 문은 try 블록이 끝나면 자동으로 이 자원을 닫아줍니다.
        // AutoCloseable 인터페이스: 닫힐 수 있는(closeable) 자원
        // 파일을 다루는 클래스, input 클래스는
        // AutoCloseable을 구현하고 있어서 try-with-resources 문에서 쉽게 사용
        try (InputStreamReader is = new InputStreamReader(System.in)) {
            System.out.println(is.read());
        } catch (Exception e) {
            // 비워두기.

        }
    }

}
