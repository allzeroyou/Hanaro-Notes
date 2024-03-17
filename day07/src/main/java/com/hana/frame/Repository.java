package com.hana.frame;

import com.hana.data.CustDto;
import com.hana.exception.DuplicatedIdException;
import com.hana.exception.NotFoundIdException;

import java.sql.Connection;
import java.util.List;

public interface Repository<K, V> {
    V insert(V v, Connection con) throws DuplicatedIdException, Exception;

    V update(V v, Connection con) throws NotFoundIdException, Exception;

    // 반환형으로 보통 primitive 타입은 안씀(소문자: boolean)
    Boolean delete(K k, Connection con) throws NotFoundIdException, Exception;

    List<V> select(Connection con) throws Exception;

    V select(K k, Connection con) throws DuplicatedIdException, Exception;


}
