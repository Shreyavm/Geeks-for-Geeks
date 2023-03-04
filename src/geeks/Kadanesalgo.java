package geeks;
import java.util.*;
public class Kadanesalgo {
static long maxSubarraySum(int arr[], int n){
        
        // Your code here
	long msf=0;
	long mcs=Integer.MIN_VALUE;
			for(int i=0;i<arr.length;i++)
			{
				msf+=arr[i];
				
				if(msf>mcs)
				{
					mcs=msf;
				}
				if(msf<0)
					msf=0;
			}
      return mcs;  
    }
public static void main(String args[])
{
	int arr[]=new int[] {-1,-2,-3,-4};
	System.out.println(maxSubarraySum(arr,4));
}
}
