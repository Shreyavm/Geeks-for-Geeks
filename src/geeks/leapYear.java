package geeks;

public class leapYear {
	 static int isLeap(int N){
	        if(N%4==0)
	        {
	        	if(N%100==0)
	        	{
	        		if(N%400==0)
	        			return 1;
	      
	        		return 0;
	        	}
	        	return 1;
	        }
	        return 0;
	    }
	 public static void main(String[] args)
	 {
		 System.out.println(isLeap(2100));
	 }
}
