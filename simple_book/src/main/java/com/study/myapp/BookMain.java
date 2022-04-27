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
		List<BookDTO> list = service.getList();
		
		//자바코드
//		Bookservice service = new BookServiceImpl();
//		List<BookDTO> list = service.getList();
		
		//도서 정보 삽입
		BookDTO insertDto = new BookDTO(2000,"Query 입문","유광열",28000);
		System.out.println(service.bookInsert(insertDto)?"삽입성공":"삽입실패");
		
	
		for(BookDTO dto : list) {
			System.out.println(dto);
		}
	}

}
