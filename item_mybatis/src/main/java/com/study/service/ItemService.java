package com.study.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.study.dto.ItemDTO;

@Service("service")
public interface ItemService {
 //CRUD 호출
	public boolean ItemInsert(ItemDTO insertDto);
	public List<ItemDTO> searchList();
	public boolean ItemDelete(int num);
	public boolean ItemUpdate(int num, int price, String psize);
	public List<ItemDTO> getList(int num);
}
