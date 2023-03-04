package geeks;
import java.util.*;
public class subarrayofSum {
	
		 static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
		    {
			 ArrayList<Integer> a = new ArrayList<Integer>();
			
			 for(int i=0;i<n;i++)
			 {
				 int sum=0;
			 
				 for(int j=i;j<n;j++)
				 {
					 sum+=arr[j];
					 if(sum==s)
					 {
						 a.add(i+1);
						 a.add(j+1);
						 return a;
					 }
				 }
			 }
			 a.add(-1);
			 return a;
		    }
		 public static void main(String args[])
		 {
			 int arr[]=new int[] {1,2,3,7,5};
			 System.out.println(subarraySum(arr,5,12));
			
		 }
	}


