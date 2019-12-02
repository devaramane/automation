package practice.hcl;

public class Sandbox_6_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] str= {"Kan","Eng","Hin","Mat","Kan","Mat"};
		for (int i=0;i<str.length;i++){
			for(int j=i+1;j<str.length;j++){
				if(str[i].equals(str[j])){
					System.out.println("Duplicate Elements Found "+str[i]);
				}
				
			}
		}
		

	}

}
