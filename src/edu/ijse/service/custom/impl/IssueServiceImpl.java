/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.impl;

import edu.ijse.dto.IssueDto;
import java.util.ArrayList;
import edu.ijse.service.custom.IssueService;
import edu.ijse.dao.DaoFactory;
import edu.ijse.dao.custom.IssueDao;
import edu.ijse.entity.IssueEntity;

/**
 *
 * @author tharu
 */
public class IssueServiceImpl implements IssueService{
    private IssueDao issueDao = (IssueDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BISSUE);

    @Override
    public ArrayList<IssueDto> getAll() throws Exception {
    ArrayList<IssueEntity> issueEntitys = issueDao.getAll();
        if(issueEntitys != null && !issueEntitys.isEmpty()){
            ArrayList<IssueDto> issueDtos = new ArrayList<>();

            for (IssueEntity issueEntity : issueEntitys) {
                issueDtos.add(getIssueDto(issueEntity));
            }

            return issueDtos;
        }
        return null;
    }
    private IssueDto getIssueDto(IssueEntity entity){
    return new IssueDto(
    entity.getNic(),entity.getBookid(),entity.getIssuedate(),entity.getDuedate(),entity.getReturnBook()
    );
    }

    @Override
    public String save(IssueDto issueDto) throws Exception {
     IssueEntity entity = getIssueEntity(issueDto);
     return issueDao.create(entity)? "Success":"Fail";
    }

    @Override
    public String update(IssueDto issueDto) throws Exception {
     IssueEntity entity = getIssueEntity(issueDto);
     return issueDao.update(entity)? "Success":"Fail";  
    }

    @Override
    public String delete(String nic) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public IssueDto get(String nic) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private IssueEntity getIssueEntity(IssueDto issueDto){
    return new IssueEntity(
    issueDto.getNic(),issueDto.getBookid(),issueDto.getIssuedate(),issueDto.getDuedate(),issueDto.getReturnBook());
    }
}
