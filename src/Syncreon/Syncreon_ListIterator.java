package Syncreon;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Syncreon_ListIterator {
	
	public static void main(String[] args) {
	
		List<String> names= new ArrayList<String>();
		names.add("Vikram");
		names.add("Nanda");
		names.add("Sarika");
		names.add("Shambhavi");
		
		ListIterator itr=names.listIterator();
		
//		while(itr.hasNext()){
//			System.out.println(itr.next());
//		}
		
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
		
	}
	
	
	

}
