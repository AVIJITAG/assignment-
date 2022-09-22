
// WJP to print numbers between 1 to 200 which are divisible by 5, 7 and by both.


package MyPackage;

public class Class21 {
	static Number Calculate(int number) {
       
    	   for(int i=1; i <number + 1; i ++) {
    		   if ( i % 5 == 0 || i %7 ==0)
    			   System.out.println(i);
    	   }
    	   return number;
       }
	public static void main(String[] args) {
		Calculate(200);

	}

}
