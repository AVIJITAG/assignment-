//  Write a Java program to create a new array list of elements, add some colors (string) and print out the collection.

package ArrayClasses;
import java.util.Scanner;
public class ArrayDemo3 {
	public static void main(String []args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Please Enter The array Size :  "); // asking the array size ;
		 int size = sc.nextInt();//  the array size;
		 String[] a = new String[size];// creating a new array to store the string type elements
		 for(int i = 0; i<size; i++) {
			 System.out.println("Please enter " + (i+1) + "th color : "); // asking for input string;
			 a[i] = sc.next(); // storing the elements
		 }
		 System.out.println("Your collection of colours :  ");
		 for (int i = 0; i <size; i++) {
			 System.out.println(a[i]+ ", ");  // printing the collection;
		 }
	}

}
