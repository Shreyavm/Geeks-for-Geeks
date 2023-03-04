package geeks;

public class armstrongNumber {
	static String armstrongNumber(int n){
        // code here
		int sum=0;
		for(int i=n;i>0;i=i/10)
		{
			int a=i%10;
			sum+=a*a*a;
		}
		if(sum==n)
			return "Yes";
		return "No";
    }
	
	public static void main(String args[])
	{
		System.out.println(armstrongNumber(370));
	}
}
