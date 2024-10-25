/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.service.custom;

import edu.ijse.dto.CategoryDto;
import edu.ijse.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author tharu
 */
public interface CategoryService extends SuperService{
    String save(CategoryDto categoryDto) throws Exception;
    String update(CategoryDto categoryDto) throws Exception;
    String delete(String catcode) throws Exception;
    CategoryDto get(String catcode) throws Exception;
    ArrayList<CategoryDto> getAll()throws Exception;
}
