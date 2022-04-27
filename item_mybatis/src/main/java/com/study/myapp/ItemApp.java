package com.study.myapp;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.dto.ItemDTO;
import com.study.service.ItemService;

public class ItemApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		ItemService service = (ItemService) ctx.getBean("service");

		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
			System.out.println("--------------------------");
			System.out.println("1. 아이템 추가");
			System.out.println("2. 아이템 조회");
			System.out.println("3. 아이템 삭제");
			System.out.println("4. 아이템 수정");
			System.out.println("5. 아이템 전체 조회");
			System.out.println("6. 종료");
			System.out.println("--------------------------");

			System.out.print("번호 >> ");
			
			int no = Integer.parseInt(sc.nextLine());
			
			switch (no) {
			case 1:
				System.out.println("\n-- 아이템 입력 --");
				
				ItemDTO insertDto = new ItemDTO();
				System.out.print("카테고리 : ");
				insertDto.setCategory(sc.nextLine());
				
				System.out.print("상품명 : ");
				insertDto.setName(sc.nextLine());
				
				System.out.print("내용 : ");
				insertDto.setContent(sc.nextLine());
				
				System.out.print("사이즈 : ");
				insertDto.setPsize(sc.nextLine());
				
				System.out.print("가격 : ");
				insertDto.setPrice(Integer.parseInt(sc.nextLine()));
				
				System.out.println(service.ItemInsert(insertDto)?"입력성공":"입력실패");
				
				
				break;
			case 2: System.out.println("\n--아이템 조회--");
					System.out.println("번호 : ");
					int num = Integer.parseInt(sc.nextLine());
					
					System.out.println(service.getList(num));
					
				break;
			case 3: 
				System.out.println("\n--아이템 삭제--");
				System.out.println("번호 : ");
				num = Integer.parseInt(sc.nextLine());
				
				System.out.println(service.ItemDelete(no)?"삭제성공":"삭제실패");
				
				break;
			case 4:
				System.out.println("\n--아이템 수정--");
				
				System.out.print("번호 : ");
				num = Integer.parseInt(sc.nextLine());
				
				System.out.print("사이즈 : ");
				String psize = sc.nextLine();
				
				System.out.print("가격 : ");
				int price = Integer.parseInt(sc.nextLine());
				
				System.out.println(service.ItemUpdate(num, price, psize)?"수정성공":"수정실패");
			
				break;
			case 5: List<ItemDTO> list = service.searchList();
					System.out.println("num\tcategory\tname\tontent\tpszie\tprice");
					System.out.println("----------------------------------------------");
					
					for(ItemDTO dto: list) {
						System.out.print(dto.getNum()+"\t");
						System.out.print(dto.getCategory()+"\t");
						System.out.print(dto.getName()+"\t");
						System.out.print(dto.getContent()+"\t");
						System.out.print(dto.getPsize()+"\t");
						System.out.print(dto.getPrice()+"\t");
					}
				break;
			case 6: flag = false;
				break;
			default:
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
