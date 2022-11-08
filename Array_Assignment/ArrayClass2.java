package ArrayClasses;

public class ArrayClass2 {
                                                                   // Creating a method which return the array
	static int[] printarray(){
		return new int [] {20,30,40,70};                          //anonymous array
		
	}
	public static void main(String[] args) {                      // calling main method
		int arr[] = printarray();                                // traversing the array
		for (int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
