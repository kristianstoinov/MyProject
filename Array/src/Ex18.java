
public class Ex18 {

	public static void main(String[] args) {
		int[] array1 ={18,19,32,1,3, 4, 5, 6, 7, 8};
		int[] array2={1, 2, 3,4,5,16,17,18,27,11};
		int[] newArray= new int[array1.length];
		for (int index = 0; index <= array1.length - 1; index++) {
			if(array1[index]>array2[index]){
				newArray[index] = array1[index];
				
			}
			if(array2[index]>array1[index]){
				newArray[index]=array2[index];
			}
			if(array2[index]==array1[index]){
				newArray[index]=array1[index];
			}
		}
		System.out.println("\nThe combined array is:");
		for (int index = 0; index <= array1.length - 1; index++) {
			System.out.print(newArray[index] + " ");
		}


	}

}
