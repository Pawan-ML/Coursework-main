/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.controller;

import edu.ijse.dto.IssueDto;
import edu.ijse.service.ServiceFactory;
import edu.ijse.service.custom.IssueService;
import java.util.ArrayList;
/**
 *
 * @author tharu
 */
public class IssueController {
    private IssueService issueService = (IssueService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BISSUE);
    
    public String save(IssueDto issueDto) throws Exception{
    return issueService.save(issueDto);
    }
    
    public String update(IssueDto issueDto) throws Exception{
        return issueService.update(issueDto);
    }

    public String delete(String nic) throws Exception{
        return issueService.delete(nic);
    }
    
   public ArrayList<IssueDto> getAll() throws Exception{
   return issueService.getAll();
   }
   
    public IssueDto get(String nic) throws Exception{
        return issueService.get(nic);
    }

}
