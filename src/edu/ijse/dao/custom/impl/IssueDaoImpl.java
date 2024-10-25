/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao.custom.impl;

/**
 *
 * @author tharu
 */
import edu.ijse.dao.custom.IssueDao;
import edu.ijse.entity.IssueEntity;
import java.util.ArrayList;
import edu.ijse.dao.CrudUtil;
import java.sql.ResultSet;


public class IssueDaoImpl implements IssueDao{

    @Override
    public boolean create(IssueEntity t) throws Exception {
    return CrudUtil.executeUpdate("INSERT INTO issue VALUES (?,?,?,?,?)", t.getNic(),t.getBookid(),t.getIssuedate(),t.getDuedate(),t.getReturnBook());
    }

    @Override
    public boolean update(IssueEntity t) throws Exception {
    return CrudUtil.executeUpdate("UPDATE issue SET returnBook=? WHERE NIC=?", "Yes",t.getNic());
    }

    @Override
    public boolean delete(String id) throws Exception {
      return CrudUtil.executeUpdate("UPDATE issue SET returnBook='Yes' WHERE NIC=?", id);
    }

    @Override
    public IssueEntity get(String id) throws Exception {
      ResultSet rst = CrudUtil.executeQuery("SELECT * FROM issue WHERE NIC = ?", id);
        if(rst.next()){
            IssueEntity entity = new IssueEntity(rst.getString("nic"), 
                    rst.getString("bookid"), rst.getString("issuedate"), 
                    rst.getString("duedate"), rst.getString("returnbook"));
            return entity;
        }
        return null;  
    }

    @Override
    public ArrayList<IssueEntity> getAll() throws Exception {
      ArrayList<IssueEntity> itemEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM issue");
        while (rst.next()) {            
            IssueEntity entity = new IssueEntity(rst.getString("NIC"),
                    rst.getString("bookid"),rst.getString("issueDate"),rst.getString("dueDate"),rst.getString("returnBook"));
            itemEntities.add(entity);
        }
        return itemEntities;
    }

    }
    
