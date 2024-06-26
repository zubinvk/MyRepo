package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerFromArrayList {
	    public static void main(String[] args) {
	        ArrayList<Integer> arrayList = new ArrayList<>();
	        arrayList.add(56);
	        arrayList.add(89);
	        arrayList.add(7);
	        arrayList.add(23);
	        arrayList.add(6);

	        
	        System.out.println(intFromArray(arrayList));
	        // Sort the ArrayList in ascending order
	    }

	    public static int intFromArray(List<Integer> arrayList) {
	    	
	    	if(arrayList.size()<1) {
	    		throw new IllegalArgumentException("Atleast one element is required");
	    	}
	    	
	    	int result = 0;
	    	for(int n: arrayList) {
	    		
	    		int digitCount=1;
	    		while(n/digitCount>0) {
	    			digitCount *= 10;
	    		}

	    		result = result*digitCount+n;
	    	}
	    	return result;
	    }
	}

