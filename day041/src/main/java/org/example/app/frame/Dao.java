package org.example.app.frame;

import org.example.app.data.ItemDto;

import java.util.List;

public interface Dao<K, V> {
    // 무언가가 들어감
    int insert(V v); // 매개변수의 다형성

    int delete(K k); // 매개변수의 다형성

    int update(V v); // 매개변수의 다형성

    V select(K k); //


    //
    List<V> select(); // 선택한 걸 리스트에 담음.


}
