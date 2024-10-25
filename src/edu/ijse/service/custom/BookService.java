/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.service.custom;

import edu.ijse.dto.BookDto;
import edu.ijse.service.SuperService;
import java.util.ArrayList;
/**
 *
 * @author tharu
 */
public interface BookService extends SuperService{
    String save(BookDto bookDto) throws Exception;
    String update(BookDto bookDto) throws Exception;
    String delete(String bookId) throws Exception;
    BookDto get(String bookId) throws Exception;
    ArrayList<BookDto> getAll() throws Exception; 
   
}
