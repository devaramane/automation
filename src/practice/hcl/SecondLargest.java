package practice.hcl;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
		int Largest = arr[0];
		int SecondLargest = arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>Largest){
				SecondLargest=Largest;
				Largest=arr[i];
				
			}
			else if (arr[i]>SecondLargest && Largest!=arr[i]){
				SecondLargest=arr[i];
			}
			
		}
		System.out.println("SecondLargest number is "+SecondLargest);
			}

}
