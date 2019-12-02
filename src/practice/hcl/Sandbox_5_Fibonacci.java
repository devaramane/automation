package practice.hcl;

import java.util.Scanner;

public class Sandbox_5_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,c=1;
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter number of times:");
		int num=ref.nextInt();
		for(int i=0;i<=num;i++){
			a=b;
			b=c;
			c=a+b;
			System.out.println(a);
			
		}
		
		

	}

}
