package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx4 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc","def","apple","melon","text");
		
		//대문자로 변경한 값을 다른 리스트에 담은 후 출력
		List<String> upperList = new ArrayList<String>();
		for(String s:list) {
			upperList.add(s.toUpperCase());
		}
		System.out.println(upperList);
		
		//stream 아용
//		Stream<String> stream = list.stream();
//		Stream<String> upper = stream.map(String::toUpperCase);
//		upper.forEach(s -> System.out.println(s));
		
		List<String> upperList2 = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperList2);
	}
}
