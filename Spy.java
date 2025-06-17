package numbers1;
import java.util.*;

public class Spy {

	public static void main(String[] args) {
		System.out.println("enter a number to check1 it is spy number or not");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1=num,rem,sum=0,prod=1;
		
		while(num1>0) {
			rem=num1%10;
			sum+=rem;
			prod*=rem;
			num1/=10;	
		}
		if(sum==prod)
			System.out.println("sp1y number");
		else
			System.out.println("not sp1y number");
		
		

	}

}
