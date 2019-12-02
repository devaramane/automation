import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class PowerSchool {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File ref=new File("G:\\Selenium\\PowerSchool.txt");
		Scanner myReader=new Scanner(ref);
		while(myReader.hasNextLine()){
			System.out.println(myReader.nextLine());
			
			
		}
		
//	File ref=new File("G:\\Selenium\\sandox.txt");
//	
//	try{
//		if (ref.exists()){
//			System.out.println("Sandbox is alive");
//		}
//		
//	}catch(Exception e){
//		System.out.println("IOError Occurred");
//		e.printStackTrace();
//	}
//	finally{
//		System.out.println("Programming Completed");
//	}
	
		//User Input
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter your number");
//		int num=scanner.nextInt();
//		System.out.println("Your lucky number is "+(num+1));
//		
		

//		File ref = new File("G:\\Selenium\\PowerSchool.txt");
//		ref.canWrite();
//		System.err.println("Exception Issues");  
		

		// boolean data=ref.canWrite();
		// System.out.println(data);
		// File ref = new File("G:\\Selenium\\PowerSchool.txt");
		// boolean filePresent = ref.exists();
		// System.out.println(filePresent);
		// String fileName = ref.getName();
		// System.out.println(fileName);
		// String absPath = ref.getAbsolutePath();
		// System.out.println(absPath);
		// long size=ref.length();
		// System.out.println(size);
		// String [] filesList=ref.list();
		// System.out.println(filesList);

	}

}
