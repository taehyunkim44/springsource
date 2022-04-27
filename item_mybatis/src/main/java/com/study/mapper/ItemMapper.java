package com.study.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.study.dto.ItemDTO;

public interface ItemMapper {
	public List<ItemDTO> select(int num);
	public int insert(ItemDTO insertDto);
	public int delete(int num);
	public int update(@Param("num") int num, @Param("price") int price, @Param("psize") String psize);
	public List<ItemDTO> search();
}
