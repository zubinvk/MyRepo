package programs;

import java.util.ArrayList;
import java.util.Collections;

public class SoryArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> aL = new ArrayList<Integer>();
		aL.add(20);
		aL.add(27);
		aL.add(22);
		aL.add(21);
		aL.add(26);
		aL.add(24);

		System.out.println(aL.toString());

//		Collections.sort(aL,(a, b) -> b-a);
//		System.out.println(aL.toString());
		
//		
		int len= aL.size();
		for(int i=0;i<len;i++) {
			for(int j=1;j<len-i;j++) {
				if(aL.get(j)>aL.get(j-1)){
					int temp = aL.get(j);
					aL.set(j, aL.get(j-1));
					aL.set(j-1, temp);		
				}
			}
		}
		System.out.println(aL.toString());
		
		

	}

}
