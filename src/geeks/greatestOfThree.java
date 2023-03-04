package geeks;

public class greatestOfThree {
	 int greatestOfThree(int A, int B, int C) {
	        // code here
		 if(A>B)
		 {
			 if(A>C)
				 return A;
			 return C;
		 }
		 if(B>C)
			 return B;
		 return C;
	    }
}
