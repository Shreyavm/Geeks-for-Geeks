package geeks;

public class missingNumberinArraysecondapp {
	static int MissingNumber(int array[], int n) {
		int nums[]=new int[n];
		for(int i=0;i<n;i++)
			nums[i]=0;
		for(int i=0;i<n-1;i++)
			nums[array[i]-1]++;
		for(int i=0;i<n;i++)
		{
			if(nums[i]==0)
				return i+1;
		}
		return -1;
	}
	public static void main(String args[])
	{
		int array[]=new int[] {1,2,3,5};
		System.out.println(MissingNumber(array,5));
	}
}
