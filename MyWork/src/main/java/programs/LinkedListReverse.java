package programs;
import java.util.LinkedList;

public class LinkedListReverse {

	
	public static void main(String[] args) {
		
		LinkedList<String> list =new LinkedList<String>();
		list.add("Hello");
		list.add("World");
		list.add("This ");
		list.add("is");
		list.add("Java");
		list.add("programming");
		
		
		System.out.println("Original linked list");
		for(String s1:list) {
			System.out.print(s1);
		}
		
		System.out.println();
		System.out.println("After reversing");
		for(String s2: reveseLL(list)) {
			System.out.print(s2);
		}
	}

	
	
	public static LinkedList<String> reveseLL(LinkedList<String> ls) {
		if(ls.size()<2) {
			return ls;
		}
		
		int left = 0;
		int right = ls.size()-1;
		
		while(left<right) {
			
			String temp = ls.get(left);
			ls.set(left, ls.get(right));
			ls.set(right, temp);
			left++;
			right--;
		}
		
		
		
		return ls;
	}
}
