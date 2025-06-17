package numbers1;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		System.out.println("enter the number to check perfect square or not");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(n==sum) System.out.println("perfect square");
		else System.out.println("not perfect square");

	}

}
