// cust test 하기위해 주석처리
//package org.example.app.service;
//
//import org.example.app.dao.CustDao;
//import org.example.app.dao.ItemDao;
//import org.example.app.data.CustDto;
//import org.example.app.data.ItemDto;
//import org.example.app.exception.DuplicatedIdException;
//import org.example.app.frame.Dao;
//import org.example.app.frame.Service;
//
//import java.util.List;
//
//public class ItemService implements Service<Long, ItemDto> {
//
//    Dao<Long, ItemDto> itemDao;
//
//    public ItemService() {
//        itemDao = new ItemDao();
//    }
//
//    @Override
//    public int add(ItemDto itemDto) throws DuplicatedIdException {
//        itemDao.insert(itemDto);
//        // 쇼핑몰 사이트에 insert 잘 되었는지
//        System.out.println("쇼핑몰 사이트에 업로드 되었습니다...");
//        return 0;
//    }
//
//    @Override
//    public int delete(Long aLong) throws Exception {
//        itemDao.delete(aLong);
//        return 0;
//    }
//
//    @Override
//    public int modify(ItemDto itemDto) throws Exception {
//        itemDao.update(itemDto);
//        System.out.println("쇼핑몰 사이트에 수정 되었습니다...");
//
//        return 0;
//    }
//
//    @Override
//    public ItemDto get(Long aLong) throws Exception {
//        return itemDao.select(aLong);
//    }
//
//    @Override
//    public List<ItemDto> get() throws Exception {
//        return itemDao.select();
//    }
//}