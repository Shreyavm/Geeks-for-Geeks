package geeks;

public class fibonacci {
	 static long nthFibonacci(long n)
	 {
		 long a=0;
		 long b=1;
		 long c;
		 long i=1;
		 while(i<n)
		 {
			 c=a+b;
			 a=b;  //i dont know why it is not passing all test cases on gfg
			 b=c;
			 i++;
		 }
		 return a;
	 }
    public static void main(String args[])
    {
    	System.out.println(nthFibonacci(3));
    }
}
