package numbers1;
import java.util.*;

public class RightShift2 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        int[] arr = new int[5];

		        System.out.println("Enter 5 integers:");
		        for (int i = 0; i < arr.length; i++) {
		            arr[i] = sc.nextInt();
		        }

		        // Save the last two elements
		        int last1 = arr[arr.length - 1];
		        int last2 = arr[arr.length - 2];

		        // Shift elements 2 steps to the right
		        for (int i = arr.length - 1; i > 1; i--) {
		            arr[i] = arr[i - 2];
		        }

		        // Place the saved elements at the beginning
		        arr[0] = last2;
		        arr[1] = last1;

		        // Print the shifted array
		        System.out.println("Array after shifting 2 positions to the right:");
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }

		        // Close the Scanner
		        sc.close();
		    }
		

	}


