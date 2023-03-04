package geeks;

public class reverseaNumber {
	public static long reverse_digit(long n)
	{
		long j,k,rev=0;
		j=n;
		while(j!=0)
		{
			k=j%10;
			rev=rev*10+k;
			j=j/10;
		}
		return rev;
	}
	public static void main(String args[])
	{
		System.out.println(reverse_digit(200));
	}
}
