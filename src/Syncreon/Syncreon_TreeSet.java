package Syncreon;

import java.util.Iterator;
import java.util.TreeSet;

public class Syncreon_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> names = new TreeSet();
		names.add("Vikram");
		names.add("Zoya");
		names.add("Abhi");
		names.add("Sarika");
		names.add("Sarika");
		
		
		
		
		
//		Iterator itr = names.iterator();
//		Iterator itr = names.descendingIterator();
//		while(itr.hasNext()){
//			System.out.println(itr.next());
//		}
//		System.out.println(names.headSet("Vikram", false));
//		System.out.println(names.tailSet("Vikram",false));
//		System.out.println(names.subSet("Abhi",false,"Zoya",false));
		System.out.println(names.pollFirst());
		System.out.println(names.pollLast());
	}

}
