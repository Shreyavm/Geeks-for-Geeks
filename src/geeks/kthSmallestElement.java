package geeks;

import java.util.Arrays;

public class kthSmallestElement {
	public static void merge(int arr[],int p,int q,int r)
	{
		int n1=q-p+1;
		int n2=r-q;
		int a1[]=new int[n1];
		int a2[]=new int[n2];
		for(int i=0;i<n1;i++)
			a1[i]=arr[p+i];
		for(int i=0;i<n2;i++)
			a2[i]=arr[q+1+i];
		int i=0;
		int j=0;
		int k=p;
		while(i<n1&&j<n2)
		{
			if(a1[i]<a2[j])
				arr[k++]=a1[i++];
			else
				arr[k++]=a2[j++];
		}
		while(i<n1)
			arr[k++]=a1[i++];
		while(j<n2)
			arr[k++]=a2[j++];
	}
	public static void mergeSort(int arr[],int p,int r)
	{
		if(p<r)
		{
			int q=p+(r-p)/2;
			mergeSort(arr,p,q);
			mergeSort(arr,q+1,r);
			merge(arr, p, q, r);
		}
	}
	public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
		mergeSort(arr,l,r);
		for(int i=l;i<=r;i++)
		{
			if(i+1==k)
				return arr[i];
		}
		return -1;
    } 

	public static void main(String args[])
	{
		int arr[]=new int[] {7,10,4,20,15};
		mergeSort(arr,0,4);
		System.out.println(Arrays.toString(arr));
		System.out.println(kthSmallest(arr,0,4,4));
	}
}
