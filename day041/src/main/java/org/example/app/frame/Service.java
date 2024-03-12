package org.example.app.frame;

import java.util.List;

public interface Service<K, V> {
    // 무언가가 들어감
    int add(V v); // 매개변수의 다형성

    int delete(K k); // 매개변수의 다형성

    int modify(V v); // 매개변수의 다형성

    V get(K k); //

    //
    List<V> get(); // 선택한 걸 리스트에 담음.


}
