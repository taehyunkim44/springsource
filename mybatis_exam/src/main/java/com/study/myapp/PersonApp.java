package com.study.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.service.PersonService;

//org.mybatis.spring.MyBatisSystemException: nested exception is org.apache.ibatis.binding.BindingException: Parameter 'id' not found. Available parameters are [arg1, arg0, param1, param2]
//		at org.mybatis.spring.MyBatisExceptionTranslator.translateExceptionIfPossible(MyBatisExceptionTranslator.java:96)

public class PersonApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		PersonService service = (PersonService) ctx.getBean("person");
//		System.out.println(service.insertPerson("kang456", "강민섭"));
		
//		System.out.println(service.selectPerson("kang456"));
		
//		System.out.println(service.updatePerson("hong123", "홍동길")?"수정성공":"수정실패");
//		System.out.println(service.selectPerson("hong123"));
		
//		System.out.println(service.deletePerson("hong123")?"삭제성공":"삭제실패");
//		System.out.println(service.selectPerson("hong123"));
	}
}
