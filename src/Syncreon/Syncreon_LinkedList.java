package Syncreon;

import java.util.Iterator;
import java.util.LinkedList;

public class Syncreon_LinkedList {
	
	
	public static void main(String[] args) {
		
		LinkedList<Integer> num= new LinkedList<Integer>();
		num.add(99);
		num.add(98);
		num.add(89);
		num.add(75);
		num.addFirst(362);
		num.add(22);
		num.addLast(999);
		num.removeLast();
		
		Iterator itr = num.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
