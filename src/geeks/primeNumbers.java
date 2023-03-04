package geeks;

public class primeNumbers {
	static int isPrime(int N){
        // code here
		if(N<=1)
			return 0;
		if(N==2)
			return 1;
		for(int i=2;i<N;i++)
		{
			if(N%i==0)
				return 0;
			if((i*i)>N)
				return 1;
		}
		return 0;
    }
	public static void main(String args[])
	{
		System.out.println(isPrime(2551));
	}
}
