// FIND OUT THE   MAX  NUMBER:

package ArrayClasses;

public class ArrayClass {                                  // class create
public static void main(String ...args) {                  // main method 
	int a[] = {10,20,30};                                  // int value input 
	System.out.println(largenumber(a));
	}
	public static int largenumber(int a[]) {
		int max = a[0];
		for(int i= 0;i<a.length; i++) {
			if(a[i]>max);
			max= a[i];
		}
		return max;
	}
	
}

