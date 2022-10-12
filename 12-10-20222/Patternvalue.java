
// Write a program to print following :

package LAB12_10_22;

public class Patternvalue {                         // class create
	 public static void main(String[] args) {     // main method 
		  
	     for(int i=1;i<=5;i++)                    // for loop start
	     {
	       for(int s=5-i;s>1;s--)
	       {
	         System.out.print("");
	       }
	   
	       for(int j=i;1<=j;j--)
	       {
	         System.out.print(j);
	       }

	       for(int k=2;k<=i;k++)
	       {
	         System.out.print(k);
	       }

	       System.out.println(" ");
	     }
	 }

	}