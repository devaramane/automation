package Syncreon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Testing201119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(115);
		num.add(35);
		num.add(45);
		num.add(55);
		num.add(65);
		
		num.add(0, 365);
		num.add(129);
		
		
		ArrayList<Integer> numNew = new ArrayList<Integer>();
		numNew.add(666);
		numNew.add(325);
		numNew.add(555);
		
		ArrayList<String> numStr = new ArrayList<String>();
		numStr.add("Rajesh");
		numStr.add("Sarika");
		numStr.add("Jitendra");
		numStr.remove("Jitendra");
		
		
		
		
		
//		num.addAll(numNew);
		
		
//		Collections.sort(num);
		
//		Iterator itr = num.iterator();
		
//		while(itr.hasNext()){
//			System.out.println(itr.next());
//		}
//		System.out.println(num.get(0));
//		System.out.println(num.get(2));
		
		//For Each Loop
		
		
//		for(int i:num){
//			System.out.println(i);
//		}
		
		//For Loop
//		for(int i=0;i<num.size();i++){
//			System.out.println(num.get(i));
//		}
		
		System.out.println(num.size());
			
			
			
			
			

	}

}
