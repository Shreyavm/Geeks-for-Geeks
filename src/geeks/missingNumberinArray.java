package geeks;

public class missingNumberinArray {
	 static int MissingNumber(int array[], int n) {
	        int sum=0;
	        for(int i=1;i<=n;i++)
	        	sum+=i;
	        for(int i=0;i<n-1;i++)
	        {
	        	sum-=array[i];
	        }
	        return sum;
	    }
	public static void main(String args[])
	{
		int array[]=new int[] {1};
		System.out.println(MissingNumber(array,2));
	}
}
