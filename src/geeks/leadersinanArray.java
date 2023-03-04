package geeks;
import java.util.*;

public class leadersinanArray {
	 static ArrayList<Integer> leaders(int arr[], int n){
	        // Your code here
		 ArrayList<Integer> res=new ArrayList<>();
		 ArrayList<Integer> fres=new ArrayList<>();
		 int nextNum=arr[n-1];
		 int max=arr[n-1];
		 res.add(nextNum);
		 for(int i=n-2;i>=0;i--)
		 {
			 nextNum=arr[i];
			 if(nextNum>=max)
			 {
				 res.add(nextNum);
				 max=nextNum;
			 }
	    }
		for(int i=res.size()-1;i>=0;i--)
		    fres.add(res.get(i));
		return fres;
	}
	public static void main(String args[])
	{
		int array[]=new int[] {1,2,3,4,4,0};
		System.out.println(leaders(array,6));
	}
}
