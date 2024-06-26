package programs;

public class RemoveduplicatesArray {
	 
	 public static int removeDuplicates(int a[], int n)
	    {
	        // if(array size if 0 or 1 array is already sorted)
	        if (n == 0 || n == 1) {
	            return n;
	        }
	 
	        int j = 0;
	        System.out.println(j);
	 
	        for (int i = 0; i < n - 1; i++) {
	        	System.out.println("------------------");
	        	System.out.println("j ="+j);
	        	System.out.println("a[i] = "+ a[i]);
	        	System.out.println("a[i + 1] ="+a[i + 1]);
	        	if (a[i] != a[i + 1]) {
	                a[j++] = a[i];
	            }
	        }
	 
	        a[j++] = a[n - 1];
	 
	        return j;
	    }
	 
	    public static void main(String[] args)
	    {
	        int a[] = { 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6 };
	 
	        int n = a.length;
	        
	        int z=0;
	       
	        // the function will modify the array a[]
	        // such that the starting j elements 
	        // will be having all unique elements 
	        // and no element will be appearing more than
	        // once
	        z = removeDuplicates(a, n);
	 
	        // printing array elements
	        for (int i = 0; i < z; i++)
	            System.out.print(a[i] + " ");
	    }
}