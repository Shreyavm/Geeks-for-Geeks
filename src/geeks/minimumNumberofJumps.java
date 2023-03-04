package geeks;

public class minimumNumberofJumps {
	public static int minJumps(int arr[],int l,int h)
	{
		int jumps;
		int min=Integer.MAX_VALUE;
		if(arr[l]==0)
			return -1;
		if(l==h)
			return 0;
		
		
		
		for(int i=l+1;i<=h&&i<=l+arr[l];i++)
		{
			jumps=minJumps(arr,i,h);
			if(jumps+1<min)
				min=jumps+1;
			if(min==0)
				min= -1;
			
		}
		return min;
	}
	public static void main(String args[])
	{
		int array[]=new int[] {2,23,1,1,11,7};
		System.out.println(minJumps(array,0,5));
	}
}
