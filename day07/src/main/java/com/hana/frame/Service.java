package com.hana.frame;

import com.hana.data.CustDto;
import com.hana.exception.DuplicatedIdException;
import com.hana.exception.NotFoundIdException;

import java.util.List;

public interface Service<K, V> {
    // Repository와 메서드 이름 똑같아도 되긴하지만
    // 아무래도 Service 코드이다 보니까 조금더 not sql 스럽게.

    V add(V v) throws DuplicatedIdException, Exception;

    V modify(V v) throws NotFoundIdException, Exception;

    // 반환형으로 보통 primitive 타입은 안씀(소문자: boolean)
    Boolean remove(K k) throws NotFoundIdException, Exception;

    List<V> get() throws Exception;
    V get(K k) throws DuplicatedIdException, Exception;
}
