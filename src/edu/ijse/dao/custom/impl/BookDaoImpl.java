/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao.custom.impl;

import edu.ijse.dao.custom.BookDao;
import edu.ijse.entity.BookEntity;
import java.util.ArrayList;
import edu.ijse.dao.CrudUtil;
import java.sql.ResultSet;
/**
 *
 * @author tharu
 */
public class BookDaoImpl implements BookDao{

    @Override
    public boolean create(BookEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO books VALUES(?,?,?,?,?)", t.getBookId(),t.getBtitle(),t.getAuthor(),t.getBcategory(),t.getDate());}

    @Override
    public boolean update(BookEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE books SET Author = ?, Category =?, Date = ?, Title = ? WHERE bookId = ?", 
                t.getAuthor(),t.getBcategory(),t.getDate(),t.getBtitle(),t.getBookId());  }

    @Override
    public boolean delete(String id) throws Exception {
     return CrudUtil.executeUpdate("DELETE FROM books WHERE bookId=?", id);
             }

    @Override
    public BookEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM books WHERE bookId = ?", id);
        if(rst.next()){
            BookEntity entity = new BookEntity(rst.getString("bookId"), 
                    rst.getString("Title"), rst.getString("Author"), 
                    rst.getString("Date"), rst.getString("Category"));
            return entity;
        }
        return null;
    }

    @Override
    public ArrayList<BookEntity> getAll() throws Exception {
    ArrayList<BookEntity> bookEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM books");
        while (rst.next()) {            
            BookEntity entity = new BookEntity(rst.getString("bookId"), 
                    rst.getString("Title"), rst.getString("Author"), 
                    rst.getString("Date"), rst.getString("Category"));
            bookEntities.add(entity);
        }
       return bookEntities;
    }    

 
    }
    

