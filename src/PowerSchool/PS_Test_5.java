package PowerSchool;

public class PS_Test_5 implements PS_Test_4_Interface {

	@Override
	public void method1() {
		// TODO Auto-generated method stub

		System.out.println("First Message");

	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub

		System.out.println("Second Message");

	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub

		System.out.println("Third Message");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PS_Test_5 ref = new PS_Test_5();
		ref.method1();
		ref.method2();
		ref.method3();

	}

}
