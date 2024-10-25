/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao.custom.impl;

import edu.ijse.dao.DaoFactory;
import edu.ijse.dao.custom.MemberDao;
import edu.ijse.dto.MemberDto;
import edu.ijse.entity.MemberEntity;
import edu.ijse.service.custom.MemberService;
import java.util.ArrayList;
import edu.ijse.dao.CrudUtil;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author tharu
 */
public class MemberDaoImpl implements MemberDao{

    @Override
    public boolean create(MemberEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO members VALUES(?,?,?,?)", t.getNic(),t.getName(),t.getAddress(),t.getPassword());
    
    }

    @Override
    public boolean update(MemberEntity t) throws Exception {
     return CrudUtil.executeUpdate("UPDATE members SET Name=?, Address=?, password=? WHERE NIC=?", t.getName(),t.getAddress(),t.getPassword(),t.getNic());
    }

    @Override
    public boolean delete(String id) throws Exception {
     return CrudUtil.executeUpdate("DELETE FROM members WHERE NIC =?", id);
    }

    @Override
    public MemberEntity get(String id) throws Exception {
         ResultSet rst = CrudUtil.executeQuery("SELECT * FROM members WHERE NIC = ?", id);
        if(rst.next()){
            MemberEntity entity = new MemberEntity(rst.getString("NIC"),rst.getString("Name"), rst.getString("Address"),rst.getString("password"));
            return entity;
        }
        return null;
    }

    @Override
    public ArrayList<MemberEntity> getAll() throws Exception {
        ArrayList<MemberEntity> memberEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM members;");
        while (rst.next()) {            
            MemberEntity entity = new MemberEntity(rst.getString("NIC"),rst.getString("Name"), rst.getString("Address"),rst.getString("password"));
            memberEntities.add(entity);
        }
        return memberEntities;
    }
    
}
