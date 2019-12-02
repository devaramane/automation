package practice.hcl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Sandbox_4_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Original, reverse="";
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter your String please:");
		Original=ref.nextLine();
		int length;
		for(int i=Original.length()-1;i>=0;i--){
			
			reverse=reverse+Original.charAt(i);
		}
		System.out.println("Reverse String is "+reverse);
		if(Original.equals(reverse)){
			System.out.println("This is Palindrome");
		}
		else {
			System.out.println("This is not Palindrome");
		}
		
	}

}