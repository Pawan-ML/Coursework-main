/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.impl;

import edu.ijse.dao.DaoFactory;
import edu.ijse.dao.custom.CategoryDao;
import edu.ijse.dto.CategoryDto;
import edu.ijse.entity.CategoryEntity;
import edu.ijse.service.custom.CategoryService;
import java.util.ArrayList;

/**
 *
 * @author tharu
 */
public class CategoryServiceImpl implements CategoryService{
    
    private CategoryDao categoryDao = (CategoryDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CATEGORY);

    @Override
    public String save(CategoryDto categoryDto) throws Exception {
        CategoryEntity entity= getCategoryEntity(categoryDto);
        return categoryDao.create(entity)? "Success" : "Fail";
    }

    @Override
    public String update(CategoryDto categoryDto) throws Exception {
        CategoryEntity entity= getCategoryEntity(categoryDto);
        return categoryDao.update(entity)? "Success" : "Fail";
    }

    @Override
    public String delete(String catcode) throws Exception {
       return categoryDao.delete(catcode)?"Success" : "Fail" ;
    }

    @Override
    public CategoryDto get(String catcode) throws Exception {
        CategoryEntity entity = categoryDao.get(catcode);
        if(entity != null){
        return getCategoryDto(entity);
        }
        return null;
    }

    @Override
    public ArrayList<CategoryDto> getAll() throws Exception {
        ArrayList<CategoryEntity> categoryEntitys = categoryDao.getAll();
        if(categoryEntitys != null && !categoryEntitys.isEmpty()){
        ArrayList<CategoryDto> categoryDtos = new ArrayList<>();
        for(CategoryEntity categoryEntity: categoryEntitys){
        categoryDtos.add(getCategoryDto(categoryEntity));
        }
        return categoryDtos;
        }
        return null;
    }
    private CategoryEntity getCategoryEntity(CategoryDto categoryDto){
    return  new CategoryEntity(categoryDto.getCatcode(), categoryDto.getTitle(), categoryDto.getDescription());
    }
    
    private CategoryDto getCategoryDto(CategoryEntity entity){
    return new CategoryDto(entity.getCatcode(), entity.getTitle(), entity.getDescription());
    }
    
    
}
