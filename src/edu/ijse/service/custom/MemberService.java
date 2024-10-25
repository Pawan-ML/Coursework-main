/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.service.custom;


import edu.ijse.dto.MemberDto;
import edu.ijse.service.SuperService;
import java.util.ArrayList;
/**
 *
 * @author tharu
 */
public interface MemberService extends SuperService{
    String save(MemberDto memberDto) throws Exception;
    String update(MemberDto memberDto) throws Exception;
    String delete(String nic) throws Exception;
    MemberDto get(String nic) throws Exception;
    ArrayList<MemberDto> getAll() throws Exception;
}
