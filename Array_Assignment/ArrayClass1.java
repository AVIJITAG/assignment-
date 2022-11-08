
//  anonymous array in java  ;

package ArrayClasses;
                                        
public class ArrayClass1 {                                         // class create                  
	public static void main (String ...args) {                     // main method 
		display(new int [] {10,20,30,40,50});                     // valu input 
	}
		                                                          //creating a method which receives an array as a parameter
	static void display(int arr[]) {
		for (int i = 0; i<=arr.length-1; i++)                         // for loop
			System.out.println(arr[i]);                             // print value 
	}}


