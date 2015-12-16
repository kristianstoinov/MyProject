
public class Ex1 {

	public static void main(String[] args) {
	int arr[]= { 10,9,6,18,20,14,3,-3,15,-7,-9 };
	int minimumValue=0;
	int maxValue=0;
	for (int index=0; index<=arr.length-1; index++ ) {
		System.out.print(arr[index] + " ");
	}
 
	for (int index=0; index<=arr.length-1; index++ ) {
		if(arr[index]>maxValue){
			maxValue=arr[index];
		}
	}
	minimumValue=maxValue;
	
	for (int index=0; index<=arr.length-1; index++ ) {
		if(arr[index]%3==0 && arr[index]<minimumValue){
			minimumValue=arr[index];
		
		}
	}
	System.out.println("\n \nThe minimum value is : " + minimumValue);
	
	
	
	}

}
