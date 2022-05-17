package com.study.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.study.dto.BookDTO;


@Service("service")
public interface Bookservice {
	public List<BookDTO> getList();
	
	public BookDTO getRow(int code);
	
	public boolean bookInsert(BookDTO insertDto);
	public boolean bookUpdate(int code, int price);
	public boolean bookDelete(int code);
	public List<BookDTO> searchList(String criteria,String keyword);
}
