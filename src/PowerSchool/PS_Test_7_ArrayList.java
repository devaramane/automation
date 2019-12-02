package PowerSchool;

import java.util.ArrayList;
import java.util.Collections;

public class PS_Test_7_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Program to Identify the Duplicate elements in the array
		// String[] names = { "Vikram", "Shambhavi", "Nanda", "Sarika", "Vikram"
		// };
		// System.out.println(names.length);
		// for (int i=0;i<names.length;i++){
		// for(int j=i+1;j<names.length;j++){
		// if(names[i].equals(names[j])){
		// System.out.println("Duplicate name found and it is "+names[j]);
		// }
		// }
		// }
		int[] a = {2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i=0;i<a.length;i++){
			
			if(a[i]%2==0){
				System.out.println(a[i]+" is not a Prime Number");
			}
		}
		
	}

}
