package numbers1;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		System.out.println("enter the number to check the factorial");
		Scanner sc=new Scanner(System.in);
		int fact=sc.nextInt();
		if(fact<=0) {
			System.out.println("the factorial of a number should be greater than zero");
		}
		else {
			int prod=1;
			for(int i=1;i<=fact;i++) {
				prod*=i;
			}
			System.out.println(prod);
		}
		}
}
