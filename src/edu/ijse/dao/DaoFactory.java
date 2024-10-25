/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao;

import edu.ijse.dao.custom.impl.BookDaoImpl;
import edu.ijse.dao.custom.impl.CategoryDaoImpl;
import edu.ijse.dao.custom.impl.IssueDaoImpl;
import edu.ijse.dao.custom.impl.MemberDaoImpl;

/**
 *
 * @author tharu
 */
public class DaoFactory {
    private static DaoFactory daoFactory;
    private DaoFactory(){
    }
    public static DaoFactory getInstance(){
    if(daoFactory == null){
    daoFactory=new DaoFactory();
    }
    return daoFactory;
    }
    
    public SuperDao getDao(DaoTypes type){
    switch(type){
        case CATEGORY:
            return new CategoryDaoImpl();
        case BOOK:
            return new BookDaoImpl();
        case MEMBERS:
            return new MemberDaoImpl();
        case BISSUE:
            return new IssueDaoImpl();
        default:
            return null;
    }
    }
    
    public enum DaoTypes{
    CATEGORY, BOOK, MEMBERS, ORDERS, ORDER_DETAIL,BISSUE;
    
    }
}
