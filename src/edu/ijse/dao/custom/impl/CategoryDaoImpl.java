/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao.custom.impl;

import java.sql.ResultSet;
import edu.ijse.dao.CrudUtil;
import edu.ijse.dao.custom.CategoryDao;
import edu.ijse.entity.CategoryEntity;
import java.util.ArrayList;

/**
 *
 * @author tharu
 */
public class CategoryDaoImpl implements CategoryDao{

    @Override
    public boolean create(CategoryEntity t) throws Exception {
      return CrudUtil.executeUpdate("INSERT INTO category VALUES(?,?,?)", t.getCatcode(),t.getTitle(),t.getDescription());
// throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(CategoryEntity t) throws Exception {
       
       return CrudUtil.executeUpdate("UPDATE category SET title = ?, description = ?WHERE code = ?",t.getTitle(),t.getDescription(), t.getCatcode());    
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate(("DELETE FROM category WHERE code = ?"), id);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CategoryEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM category WHERE code = ?", id);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      if(rst.next()){
      CategoryEntity entity = new CategoryEntity(rst.getString("code"),rst.getString("title"),rst.getString("description"));
      return entity;
      }   
      return null;
    }
    

    @Override
    public ArrayList<CategoryEntity> getAll() throws Exception {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    ArrayList<CategoryEntity> categoryEntitys = new ArrayList<>();
    ResultSet rst = CrudUtil.executeQuery("SELECT * FROM category");
    while(rst.next()){
    CategoryEntity entity = new CategoryEntity(rst.getString("code"),rst.getString("title"),rst.getString("description"));
      categoryEntitys.add(entity);
    }
    return categoryEntitys;
    }
    
}
