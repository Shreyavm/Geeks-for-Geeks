package geeks;

public class sortanArrayofZeroesOnesandTows {
	  public static void sort012(int a[], int n)
	    {
	       int[] count=new int[3] ;
	       int[] b=new int[a.length];
	       for(int i=0;i<3;i++)
	    	   count[i]=0;
	       for(int i=0;i<a.length;i++)
	    	   ++count[a[i]];
	       for(int i=1;i<3;i++)
	    	   count[i]+=count[i-1];
	       for(int i=a.length-1;i>=0;i++)
	    	   b[--count[a[i]]]=a[i];
	    }
	}

