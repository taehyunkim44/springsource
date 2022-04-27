package com.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.dto.ItemDTO;
import com.study.mapper.ItemMapper;

@Service("service")
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemMapper mapper;

	@Override
	public boolean ItemInsert(ItemDTO insertDto) {
		return mapper.insert(insertDto)==1?true:false;
	}

	@Override
	public List<ItemDTO> searchList() {
		return mapper.search();
	}

	@Override
	public boolean ItemDelete(int num) {
		return mapper.delete(num)==1?true:false;
	}

	@Override
	public boolean ItemUpdate(int num, int price, String psize) {
		return mapper.update(num, price, psize)==1?true:false;
	}

	@Override
	public List<ItemDTO> getList(int num) {
		return mapper.select(num);
	}
	
	
	
}
