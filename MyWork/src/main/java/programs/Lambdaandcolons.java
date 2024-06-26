package programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lambdaandcolons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> aList = Arrays.asList("Chelsea","Arsenal","Liverpool","NewCastle");

//		for(String name : aList) {
//			System.out.println(name);
//		}
		
		
//		aList.forEach(System.out::println)
		
		Stream<String> map = aList.stream().map(a->(a+"Name"));
		
		 
		System.out.println(map.toString());
	}

}
