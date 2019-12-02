package Syncreon;

public class Syncreon_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str= {"Anand","Ram","Seeta","Lakshman","Anand"};
		
		for (int i=0;i<str.length;i++){
			for(int j=i+1;j<str.length;j++){
				if(str[i].equals(str[j])){
					System.out.println("This has duplicate elements"+" that is "+str[j]);
				}
			}
		}
		

	}

}
