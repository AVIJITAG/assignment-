/*  Write a do-while loop that asks the user to enter two numbers. 
    The numbers should be added and the sum displayed.
    The loop should ask the user whether he 
    or she wishes to perform the operation again. If so,
    the loop should repeat; otherwise it should terminate.       */



package LAB12_10_22;
import java.util.Scanner;       // import scanner class
public class TestSum {         // class create 
	
	
	  public static void main(String[] args) {        // main method create
	    Scanner in = new Scanner(System.in);          // scanner object 
	    int sum = 0;
	    char opp;
	    do{                                            // loop start
	      System.out.println("Enter two numbers");
	      int num1= in.nextInt();
	      int num2 = in.nextInt();
	      sum = sum+num1+num2;                          // sum create
	      
	      System.out.println("Do you wish to perform another operation, Y/N");    
	      opp =in.next().charAt(0);
	    }
	    while(opp =='Y'||opp=='y');
	    
	    
	   System.out.println("sum "+sum);
	  }
	}

