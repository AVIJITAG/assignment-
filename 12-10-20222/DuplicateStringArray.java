//Java program to find duplicate elements in an String array.




package LAB12_10_22;
import java.util.*;
public class DuplicateStringArray {    // class name 
	
	
	    
	    public static void main(String args[])  // main method create 
	    {
	        Scanner sc = new Scanner(System.in);    // scanner object
	        System.out.print("Enter the number of elements in the array: "); 
	        int num = sc.nextInt(); 
	        String arr[] = new String[num];             // object create 
	        System.out.println("Enter the elements: "); 
	        for (int i = 0; i <arr.length; i++)         // loop create 
	        { 
	            arr[i] = sc.next(); 
	        }
	        
	                                          // Displaying the array
	        System.out.print("Array: ");
	        printArray(arr);
	        System.out.print("The duplicate elements are : ");
	                                               // Print non duplicate elements
	        printDupes(arr);
	    }

	                                                        // Function to print the array
	    static void printArray(String arr[])
	    {
	        for(int i = 0; i < arr.length ; i++)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	    
	    public static void printDupes(String arr[])
	    {  
	                                                         // Counter
	        int j = 0;
	                                                        // Checks for duplicate elements
	        for (int i=0; i<arr.length-1; i++)
	        {
	            for(j=i+1;j<arr.length;j++)
	                if (arr[i].equals(arr[j])&&i!=j)
	                {
	                    System.out.print(arr[j]+" "); 
	            }  
	        }
	    }  
	}

