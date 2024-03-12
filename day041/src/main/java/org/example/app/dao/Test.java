//package org.example.app.dao;
//
//import org.example.app.frame.Dao;
//
//public class Test implements Dao {
//
//    @Override
//    public int method1() { // 추상메소드는 반드시 구현해야 함.
//        int i = method2(); // 상위클래스 default 함수는 자유롭게 쓸 수도 있고,
//        // i에는 100이 들어감.
//        return 0;
//    }
//    // 재정의 할 수도~
//    public int method2(){
//        int i = Dao.method3(); // 오버라이딩 불가.
//        return 100;
//    }
//
//}
