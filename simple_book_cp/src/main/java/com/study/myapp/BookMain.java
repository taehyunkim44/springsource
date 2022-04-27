package com.study.myapp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.myapp.dto.BookDTO;
import com.study.myapp.service.Bookservice;

public class BookMain {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Bookservice service = (Bookservice) ctx.getBean("service");
		
		
		//자바코드
//		Bookservice service = new BookServiceImpl();
//		List<BookDTO> list = service.getList();
		
		//도서 정보 삽입
		BookDTO insertDto = new BookDTO(2002,"파이썬 데이터 분석2","유광열",28000);
		System.out.println(service.bookInsert(insertDto)?"삽입성공":"삽입실패");
		
	
		List<BookDTO> list = service.getList();
		for(BookDTO dto : list) {
			System.out.println(dto);
		}
	}

}
