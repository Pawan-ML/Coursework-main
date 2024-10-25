/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.controller;

import edu.ijse.dto.CategoryDto;
import edu.ijse.service.ServiceFactory;
import edu.ijse.service.custom.CategoryService;
import java.util.ArrayList;

/**
 *
 * @author tharu
 */
public class CategoryController {
    private CategoryService categoryService = (CategoryService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CATEGORY);
    public String save(CategoryDto categoryDto) throws Exception {
        return categoryService.save(categoryDto);
    }
    public String update(CategoryDto categoryDto) throws Exception {
        return categoryService.update(categoryDto);
    }
    public String delete(String catcode) throws Exception {
        return categoryService.delete(catcode);
    }
    public ArrayList<CategoryDto> getAll() throws Exception{
        return categoryService.getAll();
    }
    public CategoryDto get(String catcode) throws Exception {
        return categoryService.get(catcode);
    }
    
}
