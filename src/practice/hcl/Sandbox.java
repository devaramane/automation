package practice.hcl;

import java.util.Scanner;

public class Sandbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Number Swapping using third variable

//		int a = 5;
//		int b = 6;
//		int temp;
//
//		System.out.println("Before Swapping: " + a + b);
//		
//		temp=a;
//		a=b;
//		b=temp;
//
//		System.out.println("After Swapping:" + a + b);
		
		int temp;
		
		Scanner numbers = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		int numb1=numbers.nextInt();
		System.out.println("Enter your second number: ");
		int numb2=numbers.nextInt();
		
		System.out.println("Numbers Before Swapping: "+numb1+numb2);
		
		temp=numb1;
		numb1=numb2;
		numb2=temp;
		
		
		System.out.println("Numbers After Swapping: "+numb1+numb2);
		

	}

}
