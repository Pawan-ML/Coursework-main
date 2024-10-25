/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.controller;


import edu.ijse.dto.MemberDto;
import java.util.ArrayList;
import edu.ijse.service.custom.MemberService;
import edu.ijse.service.ServiceFactory;
/**
 *
 * @author tharu
 */
public class MemberController {
    
    
    private MemberService memberService = (MemberService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.MEMBER);
    
    public String save(MemberDto memberDto) throws Exception{
    return memberService.save(memberDto);
    }
    
    public String update(MemberDto memberDto) throws Exception{
        return memberService.update(memberDto);
    }

    public String delete(String nic) throws Exception{
        return memberService.delete(nic);
    }

    public ArrayList<MemberDto> getAll() throws Exception{
        return memberService.getAll();
    }

    public MemberDto get(String nic) throws Exception{
        return memberService.get(nic);
    }
    
}
