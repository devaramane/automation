package Syncreon;

import java.util.LinkedHashSet;

public class Syncreon_LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> LHS = new LinkedHashSet();
		LHS.add("Vikram");
		LHS.add("Sarika");
		LHS.add("Nanda");
		LHS.add("Chinnu");
		LHS.add("Chinnu");
		LHS.add("Vikram");
		LHS.add(null);
		LHS.add("");
//		LHS.clear();
		System.out.println(LHS.size());

		
	}

}
