package Automation_Anywhere;

import java.util.Arrays;

public class AA_1 {

	int a = 5;
	int b = 10;
	char c = 'c';
	String d = "India";

	public AA_1() {
		System.out.println("Program Execution Started");
	}

	public void testing1() {
		System.out.println("Her age is " + a);
	}

	public void testing2() {
		System.out.println("My Country name is " + d);
	}

	public int testing3() {
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AA_1 ref = new AA_1();
		ref.testing1();
		ref.testing2();
		System.out.println(ref.testing3());

	}

}
