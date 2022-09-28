
//  anonymous array in java  ;

package ArrayClasses;

public class ArrayClass1 {
	public static void main (String ...args) {
		display(new int [] {10,20,30,40,50});
	}
		//creating a method which receives an array as a parameter
	static void display(int arr[]) {
		for (int i = 0; i<=arr.length-1; i++)
			System.out.println(arr[i]);
	}}


