package geeks;

public class trippleSum {
	public static void merge(int arr[],int p,int q,int r)
	{
		
	}
	
	public static void mergeSort(int arr[],int p,int r)
	{
		
	}
	
	public static int binarySearch(int arr[],int target,int s,int e)
	{
		return -1;
	}
	
	public boolean findTriplets(int arr[] , int n)
    {
       mergeSort(arr,0,n-1);
       for(int i=0;i<n-1;i++)
       {
    	   int target=arr[i]+arr[i+1];
    	   int val=binarySearch(arr,(-target),i+2,n-1);
       }
    }
}
