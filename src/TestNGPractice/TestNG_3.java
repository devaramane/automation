package TestNGPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_3 {
  
	
	@Test
	@Parameters({"name","value"})
  public void f(String name,String value) {
		System.out.println(name+ " is "+value);
		
  }
}
