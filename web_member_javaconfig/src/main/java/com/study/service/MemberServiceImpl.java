package com.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.dto.AuthDTO;
import com.study.dto.ChangeDTO;
import com.study.dto.MemberDTO;
import com.study.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper mapper;
	
	@Override
	public boolean register(MemberDTO register) {
		return mapper.insert(register)==1?true:false;
	}

	@Override
	public AuthDTO login(String userid, String password) {
		return mapper.login(userid, password);
	}

	@Override
	public boolean changePwd(ChangeDTO changeDto) {
		return mapper.update(changeDto)==1?true:false;
	}

	@Override
	public boolean leave(String userid, String password) {
		return mapper.delete(userid, password)==1?true:false;
	}

	@Override
	public String dupId(String userid) {
		return mapper.dupId(userid);
	}

	

}
