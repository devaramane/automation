import java.util.ArrayList;
import java.util.Iterator;

import Syncreon.Syncreon_1;

public class Syncreon_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Syncreon_1 ref1 =new Syncreon_1(23,"Rama",60);
		Syncreon_1 ref2 =new Syncreon_1(32,"Krishna",50);
		Syncreon_1 ref3 =new Syncreon_1(55,"Chandra",90);
		
		ArrayList<Syncreon_1> chk= new ArrayList<Syncreon_1>();
		chk.add(ref1);
		chk.add(ref2);
		chk.add(ref3);
		
		Iterator itr= chk.iterator();
		while(itr.hasNext()){
			
			Syncreon_1 chk1 =(Syncreon_1)itr.next();
			
		}
		
		

	}

}
