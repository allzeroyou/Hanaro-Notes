package org.example.app.frame;

import org.example.app.exception.DuplicatedIdException;
import org.example.app.exception.IdNotFoundException;
import org.example.app.exception.NotFoundException;

import java.util.List;

public interface Service<K, V> {
    // 무언가가 들어감
    int add(V v) throws DuplicatedIdException; // 매개변수의 다형성

    int delete(K k) throws IdNotFoundException; // 매개변수의 다형성

    int modify(V v) throws IdNotFoundException; // 매개변수의 다형성

    V get(K k) throws NotFoundException;
    List<V> get() throws NotFoundException; // 선택한 걸 리스트에 담음.


}
