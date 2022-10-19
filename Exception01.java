/* You will be given two integers a and y as input, you have to compute / 
1. If a and y are not 32 bit signed integers or if y is zero, 
exception will occur and you have to report it.      */

package EXCEPTION_HANDLING;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception01 {

	    public static void main(String[] args) {                // main method
	     
	        try{                                                  
	            Scanner A = new Scanner(System.in);            // scanner object create
	            int a = A.nextInt();
	           
	            int b = A.nextInt();
	          
	            int c = a/b;
	            System.out.print(c);
	        }
	        catch(InputMismatchException Ao){                             // multiple catch 
	            System.out.print("InputMismatchException");
	        }
	        catch(Exception Ao)
	        {
	            System.out.print(Ao);
	        }
	    }
	}

