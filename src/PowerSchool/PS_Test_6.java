package PowerSchool;

public class PS_Test_6 {

	enum level {

		LOW, MEDIUM, HIGH

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	level ref=level.HIGH;
	
	switch(ref){
	
	case LOW:
		System.out.println("Low Level");
		break;
	case MEDIUM:
		System.out.println("Medium Level");
		break;
	case HIGH:
		System.out.println("High Level");
		break;
	
	}

	}

}
