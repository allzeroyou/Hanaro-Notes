package org.example.app.frame;

import org.example.app.data.ItemDto;
import org.example.app.exception.DuplicatedIdException;
import org.example.app.exception.IdNotFoundException;
import org.example.app.exception.NotFoundException;

import java.util.List;

public interface Dao<K, V> {
    /**
     * 2024.3.13
     * @param v: CustDto
     * @return int
     * @throws DuplicatedIdException
     */
    // 무언가가 들어감
    int insert(V v) throws DuplicatedIdException; // 매개변수의 다형성

    int delete(K k) throws IdNotFoundException; // 삭제할 때도 id가 없을 수 있음. 예외처리 필요.
    // 하위에서 예외처리 필요.

    int update(V v) throws IdNotFoundException; // 업데이트 시 id가 없을 수 있음. 예외처리 필요.

    V select(K k) throws NotFoundException; // 가져올 게 없을 수 있음.


    List<V> select() throws NotFoundException; // 선택한 걸 리스트에 담음.


}
