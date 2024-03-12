package org.example.app.dao;

import org.example.app.data.ItemDto;
import org.example.app.frame.Dao;

import java.util.ArrayList;
import java.util.List;

public class ItemDao implements Dao<Long, ItemDto> {


    @Override
    public int insert(ItemDto itemDto) {
        System.out.println("Oracle DB: Inserted ..." + itemDto);
        return 0;
    }

    @Override
    public int delete(Long id) {
        System.out.println("Deleted..." + id);
        return 0;
    }

    @Override
    public int update(ItemDto itemDto) {
        System.out.println("Oracle DB: Updated ..." + itemDto);
        return 0;
    }

    @Override
    public ItemDto select(Long aLong) {
        return ItemDto.builder().id(aLong).name("신형 맥북").price(2430000).build();
    }


    @Override
    public List<ItemDto> select() {
        List list = new ArrayList<ItemDto>();
        list.add(ItemDto.builder().id(20240312).name("신형 맥북 Air M3 13인치").price(1890000).build());
        list.add(ItemDto.builder().id(20240313).name("신형 맥북 Air M3 15인치").price(2430000).build());
        list.add(ItemDto.builder().id(20240314).name("신형 맥북 Pro M3 15인치 ").price(3430000).build());

        return list;
    }
}
