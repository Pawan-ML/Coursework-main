/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.impl;


import edu.ijse.dto.MemberDto;
import edu.ijse.service.custom.MemberService;
import java.util.ArrayList;
import edu.ijse.dao.DaoFactory;
import edu.ijse.dao.custom.MemberDao;
import edu.ijse.dto.MemberDto;
import edu.ijse.entity.MemberEntity;

/**
 *
 * @author tharu
 */
public class MemberServiceImpl implements MemberService{
    
    private MemberDao memberDao = (MemberDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.MEMBERS);

    @Override
    public String save(MemberDto memberDto) throws Exception {
 
        MemberEntity entity = getMemberEntity(memberDto);
        return memberDao.create(entity)? "Success":"Fail";
    }

    @Override
    public String update(MemberDto memberDto) throws Exception {

        MemberEntity entity = getMemberEntity(memberDto);
        return memberDao.update(entity)? "Success":"Fail";
    }

    @Override
    public String delete(String nic) throws Exception {
       return memberDao.delete(nic)?"Success":"Fail";
    }

    @Override
    public MemberDto get(String nic) throws Exception {
        MemberEntity entity = memberDao.get(nic);
        if(entity != null){
            return getMemberDto(entity);
        }
        return null;
    }

    @Override
    public ArrayList<MemberDto> getAll() throws Exception {
               ArrayList<MemberEntity> memberEntitys = memberDao.getAll();
        if(memberEntitys != null && !memberEntitys.isEmpty()){
            ArrayList<MemberDto> itemDtos = new ArrayList<>();

            for (MemberEntity memberEntity : memberEntitys) {
                itemDtos.add(getMemberDto(memberEntity));
            }

            return itemDtos;
        }
        return null;
    }
    
    private MemberEntity getMemberEntity(MemberDto memberDto){
    return new MemberEntity(
            memberDto.getNic(),
            memberDto.getName(),
            memberDto.getAddress(),
            memberDto.getPassword());
    }
    private MemberDto getMemberDto(MemberEntity memberEntity){
    return new MemberDto(
            memberEntity.getNic(),
            memberEntity.getName(),
            memberEntity.getAddress(),
            memberEntity.getPassword());
    }
    
}
