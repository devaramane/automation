package Syncreon;

import java.util.HashMap;

public class Syncreon_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> subjects = new HashMap();
		subjects.put("Kannada", 113);
		subjects.put("English", 88);
		subjects.put("Hindi", 76);
		subjects.put("Science", 88);
		subjects.remove("Hindi");
		subjects.replace("English", 90);
		
		System.out.println(subjects);
		
		

	}

}
