package com.study.myapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.study.myapp.dto.BookDTO;

@Service("service")
public interface Bookservice {
	public List<BookDTO> getList();
	public boolean bookInsert(BookDTO insertDto);
}
