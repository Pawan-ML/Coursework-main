/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.service.custom;

/**
 *
 * @author tharu
 */
import edu.ijse.dto.IssueDto;
import edu.ijse.service.SuperService;
import java.util.ArrayList;

public interface IssueService extends SuperService {
    String save(IssueDto issueDto) throws Exception;
    String update(IssueDto issueDto) throws Exception;
    String delete(String nic) throws Exception;
    IssueDto get(String nic) throws Exception;
    ArrayList<IssueDto> getAll() throws Exception;
  
    
}
