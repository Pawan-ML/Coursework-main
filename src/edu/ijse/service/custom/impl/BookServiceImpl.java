/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.impl;

import java.util.ArrayList;
import edu.ijse.dto.BookDto;
import edu.ijse.service.custom.BookService;
import edu.ijse.dao.DaoFactory;
import edu.ijse.dao.custom.BookDao;
import edu.ijse.entity.BookEntity;

/**
 *
 * @author tharu
 */
public class BookServiceImpl implements BookService{
    private BookDao bookDao = (BookDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOK);

    @Override
    public String save(BookDto bookDto) throws Exception {
        BookEntity entity = getBookEntity(bookDto);
        return bookDao.create(entity) ? "Success" : "Fail";
                }

    @Override
    public String update(BookDto bookDto) throws Exception {
        BookEntity entity = getBookEntity(bookDto);
        return bookDao.update(entity) ? "Success" : "Fail";
    }

    @Override
    public String delete(String bookId) throws Exception {
      return bookDao.delete(bookId) ?  "Success" : "Fail";
    }

    @Override
    public BookDto get(String bookId) throws Exception {
        BookEntity entity = bookDao.get(bookId);
        if(entity != null){
            return getbookDto(entity);
        }
        return null; }

    
     public ArrayList<BookDto> getAll() throws Exception {
        ArrayList<BookEntity> bookEntitys = bookDao.getAll();
        if(bookEntitys != null && !bookEntitys.isEmpty()){
            ArrayList<BookDto> bookDtos = new ArrayList<>();
            
            for (BookEntity bookEntity : bookEntitys) {
                bookDtos.add(getbookDto(bookEntity));
            }
            
            return bookDtos;
        }
        return null;
    }
    
//    private BookDto getBookDto(BookEntity entity){
//        return  new BookDto(
//                entity.getBookId(),
//                entity.getBtitle(),
//                entity.getBcategory(), 
//                entity.getAuthor(),
//                entity.getDate());
//    }
     private BookEntity getBookEntity(BookDto bookDto){
        return  new BookEntity(
                bookDto.getBookId(),
                bookDto.getBtitle(), 
                bookDto.getAuthor(), 
                bookDto.getDate(),
                bookDto.getBcategory());
    }
      private BookDto getbookDto(BookEntity entity){
        return  new BookDto(
                entity.getBookId(),
                entity.getBtitle(),
                entity.getAuthor(),
                entity.getDate(),
        entity.getBcategory());
        
    }

}
