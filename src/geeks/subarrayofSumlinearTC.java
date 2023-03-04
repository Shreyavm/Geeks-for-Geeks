package geeks;
import java.util.*;
public class subarrayofSumlinearTC {
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
{
	ArrayList<Integer> a=new ArrayList<Integer>();
	a.add(-1);
	int sum=0;
	int j=0;
	for(int i=0;i<n;i++)
	{
		sum+=arr[i];
		while(j<i&&sum>s)
			sum-=arr[j++];
		if(sum==s)
		{
			a.remove(0);
			a.add(j+1);
			a.add(i+1);
			return a;
		}
	}
	return a;
}
	public static void main(String args[])
	{
		int[] arr=new int[] {3,2,6,8,23,90,88};
		System.out.println(subarraySum(arr,7, 113));
	}
}
