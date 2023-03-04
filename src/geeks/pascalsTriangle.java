package geeks;
import java.util.*;
public class pascalsTriangle {
	static ArrayList<Long> nthRowOfPascalTriangle(int n) {
	        // code here
		 ArrayList<Long> res=new ArrayList<>();
	    	 for(int j=0;j<n;j++)
	    	 {
	    		 res.add(fact(n-1)/(fact(j)*fact(n-1-j)));
	    	 }
	         return res;
	     }
	 public static long fact(long i)
	 {
		 if(i<=1)
			 return  1;
		 return fact(i-1)*i;
	 }
	 public static void main(String args[])
	 {
		 System.out.println(nthRowOfPascalTriangle(7));
	 }
}
