package geeks;

public class fibonaccirecursive {
	static long nthFibonacci(long n)
	{
		if(n<=1)
			return n;
		return nthFibonacci(n-1)+nthFibonacci(n-2);
	}
}
