package numbers1;
import java.util.Scanner;

public class RightShift1 {

	public static void main(String[] args) {
		int last;
		Scanner sc=new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("print the array elements");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
	
		last=arr[arr.length-1];
		
			for(int i=arr.length-1;i>0;i--) {
				
					arr[i]=arr[i-1];
				
					
			}
			arr[0]=last;
			
		
		
		for(int num: arr) {
			System.out.print(num+" ");
		}
		
		
			
	}

}
