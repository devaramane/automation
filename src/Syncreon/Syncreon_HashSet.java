package Syncreon;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Syncreon_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(25);
		numbers.add(35);
		numbers.add(45);
		numbers.add(55);
		numbers.add(75);
		numbers.remove(75);
		
		
		
		HashSet<Integer> numbers1 = new HashSet<Integer>();
		numbers1.add(95);
		numbers1.add(105);
		numbers1.add(252);
		numbers1.add(253);
		numbers1.add(257);
		
		numbers.addAll(numbers1);
		
		
		Iterator itr = numbers.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
