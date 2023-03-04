package geeks;

public class binaryToDecimalnum {
	 public static int binary_to_decimal(String str) {
	        // Code here
	        int n=Integer.parseInt(str);
	        int res=0;
			int a=1;
			while(n>0)
			{
				int k=n%10;
				res+=k*a;
				a*=2;
				n/=10;
			}
			return res;
	    }
	 public static void main(String args[])
		{
			System.out.println(binary_to_decimal("1001"));
		}
	}

